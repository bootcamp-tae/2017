package com.globant.automation.bootcamp.runners.junit;

import org.junit.runners.Parameterized;

/**
 * Created by Facundo on 11/11/2017.
 */
public class ParametrizedParallelism extends Parameterized {

    public ParametrizedParallelism(Class<?> clazz) throws Throwable {
        super(clazz);
        setScheduler(new ThreadPoolScheduler());
    }

}
