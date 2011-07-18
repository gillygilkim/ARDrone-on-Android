package com.profusiongames.spec;

import java.nio.ByteBuffer;

import junit.framework.Assert;
import android.test.AndroidTestCase;

import com.codeminders.ardrone.video.BufferedVideoImage;
import com.codeminders.ardrone.video.ImageSlice;

public class TestVideoFeed extends AndroidTestCase
{
	BufferedVideoImage video = new BufferedVideoImage();
	
	//I don't know how the method is supposed to change the variables so I can't test to see if it's equal with expectations
	public void testAddImageStream() throws Throwable
	{
		ByteBuffer stream = ByteBuffer.allocate(5);
		video.addImageStream(stream);
		Assert.assertEquals(video.imageStreamByteArray,0);
		Assert.assertEquals(video.imageStreamCapacity,0);
		
		stream = ByteBuffer.allocate(10);
		video.addImageStream(stream);
		Assert.assertEquals(video.imageStreamByteArray,0);
		Assert.assertEquals(video.imageStreamCapacity,0);
		
		stream = ByteBuffer.allocate(3);
		video.addImageStream(stream);
		Assert.assertEquals(video.imageStreamByteArray,0);
		Assert.assertEquals(video.imageStreamCapacity,0);
	}
	
	//I don't know how the method is supposed to change the variables so I can't test to see if it's equal with expectations
	public void testAlignStreamData() throws Throwable
	{
		video.streamFieldBitIndex = 5;
		video.alignStreamData();
		Assert.assertEquals(video.streamFieldBitIndex,0);
		
		video.streamFieldBitIndex = 2;
		video.alignStreamData();
		Assert.assertEquals(video.streamFieldBitIndex,0);
		
		video.streamFieldBitIndex = 3;
		video.alignStreamData();
		Assert.assertEquals(video.streamFieldBitIndex,0);
	}
	
	//This method doesn't change any variables that I can access. It only changes local variables within the method.
	//I will need to move the variables out of the method to test if it does as expected.
	//I don't know what this method is supposed to do.
	public void testComposeImageSlice() throws Throwable
	{
		video.width = 1;
		video.sliceIndex = 1;
		video.imageSlice = new ImageSlice (5);
		video.composeImageSlice();
		Assert.assertEquals(4,0);
		
		video.width = 2;
		video.sliceIndex = 4;
		video.imageSlice = new ImageSlice (3);
		video.composeImageSlice();
		Assert.assertEquals(4,0);
		
		video.width = 3;
		video.sliceIndex = 2;
		video.imageSlice = new ImageSlice (4);
		video.composeImageSlice();
		Assert.assertEquals(4,0);
	}

	//I don't know how this method changes the variables so I don't know what the expected values are
	public void testDecodeFieldBytes() throws Throwable
	{
		int [] run = {0};
		int [] level = {0};
		boolean [] last = {false};
		video.decodeFieldBytes(run, level, last);
		Assert.assertEquals(run[0],4);
		Assert.assertEquals(level[0],4);
		Assert.assertEquals(last[0],true);
		
		run[0] = 5;
		level[0] = 5;
		last[0] = true;
		video.decodeFieldBytes(run, level, last);
		Assert.assertEquals(run[0],4);
		Assert.assertEquals(level[0],4);
		Assert.assertEquals(last[0],false);
		
		run[0] = 3;
		level[0] = 5;
		last[0] = false;
		video.decodeFieldBytes(run, level, last);
		Assert.assertEquals(run[0],4);
		Assert.assertEquals(level[0],4);
		Assert.assertEquals(last[0],true);
	}
	
	//I don't know how this method changes the variables so I don't know what the expected values are
	public void testGetBlockBytes() throws Throwable
	{
		Boolean input = true;
		video.getBlockBytes(input);
		Assert.assertEquals(video.dataBlockBuffer[0],4);
		
		input = true;
		video.getBlockBytes(input);
		Assert.assertEquals(video.dataBlockBuffer[63],4);
		
		input = true;
		video.getBlockBytes(input);
		Assert.assertEquals(video.dataBlockBuffer[32],4);
		
		input = false;
		video.getBlockBytes(input);
		Assert.assertEquals(video.dataBlockBuffer[0],4);
		
		input = false;
		video.getBlockBytes(input);
		Assert.assertEquals(video.dataBlockBuffer[63],4);
	}
	
	//This method doesn't change any variables that I can access. It only changes local variables within the method.
	//I will need to move the variables out of the method to test if it does as expected.
	//I don't know what this method is supposed to do.
	public void testInverseTransform() throws Throwable
	{
		int macroBlockIndex = 0;
		int dataBlockIndex = 0;
		video.inverseTransform(macroBlockIndex, dataBlockIndex);
		Assert.assertEquals(4,0);
		
		macroBlockIndex = 3;
		dataBlockIndex = 7;
		video.inverseTransform(macroBlockIndex, dataBlockIndex);
		Assert.assertEquals(4,0);
		
		macroBlockIndex = 12;
		dataBlockIndex = 5;
		video.inverseTransform(macroBlockIndex, dataBlockIndex);
		Assert.assertEquals(4,0);
	}
	
	
	public void testMakeRGB() throws Throwable
	{
		Assert.assertEquals(4,0);
	}
	
	
	public void testPeekStreamData() throws Throwable
	{
		Assert.assertEquals(4,0);
	}
	
	
	public void testProcessStream() throws Throwable
	{
		Assert.assertEquals(4,0);
	}
	
	
	public void testReadHeader() throws Throwable
	{
		Assert.assertEquals(4,0);
	}
	
	
	public void testReadStreamDataInt() throws Throwable
	{
		Assert.assertEquals(4,0);
	}
}
