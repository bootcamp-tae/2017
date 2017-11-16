package ClockTests;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClockTest extends MobileTest<ClockPage>{


    @Test
    public void chronometerTest(){
        ChronometerPage chronometer = getInitialPage()
                .goToChronometer()
                .start()
                .stop()
                .wait(5);
                .reset();

        assertThat("The clock has been reset", choronometer.getTime(), is(0d));
    }

}
