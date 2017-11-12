package logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Logging {
    default Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }
}
