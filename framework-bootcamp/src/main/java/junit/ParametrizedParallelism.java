package junit;

import org.junit.runners.Parameterized;

public class ParametrizedParallelism extends Parameterized {

    public ParametrizedParallelism(Class<?> klass) throws Throwable {
        super(klass);
        setScheduler(new ThreadPoolScheduler());
    }
}
