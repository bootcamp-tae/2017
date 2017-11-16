package bootcamp;

import mobile.MobileTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


public class TestCalculator extends MobileTest<CalculatorHome> {

    @Test
    public void testCalculator(){
        String result=getInitialPage()
                .eight()
                .cero()
                .add()
                .two()
                .cero()
                .eq()
                .getResult();

                assertThat("result is 100",result,is("100"));
    }

    @Override
    protected CalculatorHome getInitialPage() {
        return new CalculatorHome();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities desiredCapabilities) {
        //tested on android 6.0.1
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "VZY223HC2RD");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        //tested with genymotion
        //desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        //desiredCapabilities.setCapability("appActivity",".Calculator");
    }
}
