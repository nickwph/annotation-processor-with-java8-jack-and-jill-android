package com.example.nickwph.jackandjillannotationtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

/**
 * Created by nickwph on 6/29/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(application = TestApplication.class, constants = BuildConfig.class, sdk = 18)
public class UtilityTest {

    private Utility utility;

    @Before
    public void setUp() throws Exception {
        utility = new Utility();
        utility.context = RuntimeEnvironment.application;
    }

    @Test
    public void shouldToastSpecificTextOnRun() throws Exception {
        utility.run();
        Assert.assertEquals("hello from utility", ShadowToast.getTextOfLatestToast());
    }
}
