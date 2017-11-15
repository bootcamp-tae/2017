import com.globant.automation.bootcamp.logging.Logging;
import com.globant.automation.bootcamp.webdriver.Initializable;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Facundo on 15/11/2017.
 */
public enum OperSyst implements Initializable, HasCapabilities, Logging {
    ;

    @Override
    public void initialize() {

    }

    @Override
    public Capabilities getCapabilities() {
        return null;
    }

    /*ANDROID {
        @Override
        public void initialize() {
            INITIALIZED.computeIfAbsent(ordinal(), n -> {
                AndroidDriver; //Here it obviously go something else, im not sure about this class
                return true;
            });
        }

        @Override
        public Capabilities getCapabilities() {
            return DesiredCapabilities.android();
        }
    }

    private static final Map<Integer, Boolean> INITIALIZED = new ConcurrentHashMap<>();*/

}
