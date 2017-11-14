package junit;

import logging.Logging;
import org.junit.runners.model.RunnerScheduler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.format;
import static java.util.concurrent.TimeUnit.MINUTES;

public class ThreadPoolScheduler implements RunnerScheduler, Logging {

    private static final int TIMEOUT_MINUTES = 10;

    private final ExecutorService executor;

    ThreadPoolScheduler() {
        this.executor = Executors.newWorkStealingPool(2);
    }

    @Override
    public void finished() {
        executor.shutdown();
        try {
            executor.awaitTermination(TIMEOUT_MINUTES, MINUTES);
        } catch (InterruptedException exc) {
            Thread.currentThread().interrupt();
        }
        getLogger().info(format("Executor state: %s", executor.toString()));
    }

    @Override
    public void schedule(Runnable childStatement) {
        executor.submit(childStatement);
    }

    static class TestThreadPool implements ThreadFactory {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "TestPool-Thread-" + poolNumber.getAndIncrement());
        }
    }
}
