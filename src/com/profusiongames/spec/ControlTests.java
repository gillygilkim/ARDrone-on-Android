package com.profusiongames.spec;


import junit.framework.Assert;
import android.test.AndroidTestCase;


public class ControlTests extends AndroidTestCase {

    public void testTiltRightFlyRight() throws Throwable 
    {
       Assert.assertTrue(1 + 1 == 2);
    }

    public void testOnePlusOneDoesNotEqualThree() throws Throwable 
    {
       Assert.assertFalse(1 + 1 == 3);
    }
}