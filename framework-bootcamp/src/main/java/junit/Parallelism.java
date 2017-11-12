package junit;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class Parallelism extends BlockJUnit4ClassRunner {
    public Parallelism(Class<?> klass) throws InitializationError {
        super(klass);
    }
}
