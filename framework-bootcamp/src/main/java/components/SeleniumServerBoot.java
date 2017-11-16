package components;


import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.openqa.grid.internal.utils.configuration.StandaloneConfiguration;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.slf4j.LoggerFactory;
import java.util.logging.LogManager;

public enum SeleniumServerBoot {
    INSTANCE;

    private final SeleniumServer server;

    SeleniumServerBoot() {
        StandaloneConfiguration configuration = new StandaloneConfiguration();

        this.server = new SeleniumServer(configuration);

        // Turn off verbose logging from Selenium Server...(default is ON)
        ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.OFF);
        LogManager.getLogManager().getLogger("").setLevel(java.util.logging.Level.OFF);

        // Register a hook in the JVM to shut down the Selenium server cleanly before terminating
        Runtime.getRuntime().addShutdownHook(new Thread(this::stop));
    }

    public void start() {
        server.boot();
    }

    public void stop() {
        try {
            server.stop();
        } catch (Exception ignored) {

        }
    }
}
