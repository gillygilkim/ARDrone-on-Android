
package com.profusiongames.spec;

import junit.framework.Assert;
import android.test.AndroidTestCase;

import com.profusiongames.FusionDrone;
import com.profusiongames.FusionDrone.VideoDisplayer;

public class TestFusionDrone extends AndroidTestCase
{
	FusionDrone pilot = new FusionDrone();
	
	
	public void testGetUIComponents() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	
	
	public void testNavDataReceived() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	
	
	public void testFrameReceived() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	
	
	public void testOnSensorChanged() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	
	
	
	
	
	FusionDrone.DroneStarter pilot2 = pilot.new DroneStarter();
	
	
	
	public void testDoInBackground2() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	public void testOnPostExecute2() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	
	
	
	
	
	
	FusionDrone.DroneEnder pilot3 = pilot.new DroneEnder();
	
	
	
	public void testDoInBackground3() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	public void testOnPostExecute3() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	
	
	
	
	int x;
	int y;
	int width;
	int height;
	int [] arr;
	int off;
	int scan;
	
	VideoDisplayer pilot4 = pilot.new VideoDisplayer(x,y,width,height,arr,off,scan);
	
	
	
	public void testDoInBackground4() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
	public void testOnPostExecute4() throws Throwable
	{
		Assert.assertEquals(0,0);
	}
}
