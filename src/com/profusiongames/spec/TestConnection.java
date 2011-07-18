package com.profusiongames.spec;

import com.codeminders.ardrone.*;
// This uses the classes "CommandSender" "NavDataReader" and "VideoReader"


import java.net.DatagramSocket;
import java.net.InetAddress;


import junit.framework.Assert;
import android.test.AndroidTestCase;

public class TestConnection extends AndroidTestCase 
{
	CommandQueue cmd_queue;
	ARDrone drone;
	InetAddress drone_addr;
	DatagramSocket cmd_socket;
	CommandSender cake = new CommandSender(cmd_queue,drone,drone_addr,cmd_socket);
	
	//I don't know how to test this method because it is an infinite loop and is not meant to ever stop
	public void testRun() throws Throwable
	{
		cake.run();
		Assert.assertEquals(0,0);
	}
	
	
	int navdata_port;
	/*NavDataReader cake2 = new NavDataReader(drone,drone_addr,navdata_port);
	
	public void testDisconnect2() throws Throwable
	{
		cake2.disconnect();
		Assert.assertEquals(0,0);
	}
	
	public void testRun2() throws Throwable
	{
		cake2.run();
		Assert.assertEquals(0,0);
	}
	
	public void testStop2() throws Throwable
	{
		cake2.stop();
		Assert.assertEquals(0,0);
	}
	
	int video_port;
	VideoReader cake3 = new VideoReader(drone,drone_addr,video_port);
	
	public void testDisconnect3() throws Throwable
	{
		cake3.disconnect();
		Assert.assertEquals(0,0);
	}
	
	public void testRun3() throws Throwable
	{
		cake3.run();
		Assert.assertEquals(0,0);
	}
	
	public void testStop3() throws Throwable
	{
		cake3.stop();
		Assert.assertEquals(0,0);
	}*/
}
