package com.profusiongames.spec;

import java.nio.ByteBuffer;

import junit.framework.Assert;
import android.test.AndroidTestCase;

import com.codeminders.ardrone.video.BufferedVideoImage;
import com.codeminders.ardrone.video.ImageSlice;

public class TestVideoFeed extends AndroidTestCase
{
	BufferedVideoImage video = new BufferedVideoImage();
	
	
	
	
	//I NEED TO CONTROL ALL THE VARIABLES USED WITHIN THE METHODS SO THAT I CAN PROPERLY PREDICT WHAT THE END RESULT SHOULD BE
	//THAT IS WHAT ALL THE SETTINGS OF VARIABLES BEFORRE RUNNING THE METHODS IS FOR
	
	
	//The stuff in /* ..... */ is what the tests used to be like
	//The old tests only checked to see if things are equal
	//The old tests did not tell what they expected
	
	
	//I don't know how the method is supposed to change the variables so I can't test to see if it's equal with expectations
	public void testAddImageStream() throws Throwable
	{
/*		ByteBuffer stream = ByteBuffer.allocate(5);
		video.addImageStream(stream);
		Assert.assertEquals(video.imageStreamByteArray,0);
		Assert.assertEquals(video.imageStreamCapacity,0);*/
		
		
		ByteBuffer stream = ByteBuffer.allocate(5);
		byte[] imageStreamByteArrayCopy = {0,1,2};
		video.imageStreamByteArray = imageStreamByteArrayCopy;
		int imageStreamCapacityCopy = 1;
		video.imageStreamCapacity = imageStreamCapacityCopy;
		video.imageSlice = new ImageSlice (3);
		video.javaPixelData = new int [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.addImageStream(stream);
		assertTrue("video.imageStreamByteArray should be " + /*what I expect it to be +*/ " but was "
                + video.imageStreamByteArray/*what it actually is*/, video.imageStreamByteArray.equals(/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("video.imageeStreamCapacity should be " + /*what I expect it to be +*/ " but was "
                + video.imageStreamCapacity/*what it actually is*/, video.imageStreamCapacity == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
		
		
		stream = ByteBuffer.allocate(5);
		imageStreamByteArrayCopy = new byte[] {0,1,2,3,4,5};
		video.imageStreamByteArray = imageStreamByteArrayCopy;
		imageStreamCapacityCopy = 3;
		video.imageStreamCapacity = imageStreamCapacityCopy;
		video.imageSlice = new ImageSlice (3);
		video.javaPixelData = new int [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.addImageStream(stream);
		assertTrue("video.imageStreamByteArray should be " + /*what I expect it to be +*/ " but was "
                + video.imageStreamByteArray/*what it actually is*/, video.imageStreamByteArray.equals(/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("video.imageeStreamCapacity should be " + /*what I expect it to be +*/ " but was "
                + video.imageStreamCapacity/*what it actually is*/, video.imageStreamCapacity == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
		
		
		stream = ByteBuffer.allocate(5);
		imageStreamByteArrayCopy = new byte [] {0,1,2,3,4,5,6,7};
		video.imageStreamByteArray = imageStreamByteArrayCopy;
		imageStreamCapacityCopy = 5;
		video.imageStreamCapacity = imageStreamCapacityCopy;
		video.addImageStream(stream);
		assertTrue("video.imageStreamByteArray should be " + /*what I expect it to be +*/ " but was "
                + video.imageStreamByteArray/*what it actually is*/, video.imageStreamByteArray.equals(/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("video.imageeStreamCapacity should be " + /*what I expect it to be +*/ " but was "
                + video.imageStreamCapacity/*what it actually is*/, video.imageStreamCapacity == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
	}
	
	//I don't know how the method is supposed to change the variables so I can't test to see if it's equal with expectations
	public void testAlignStreamData() throws Throwable
	{
		/*video.streamFieldBitIndex = 5;
		video.alignStreamData();
		Assert.assertEquals(video.streamFieldBitIndex,0);*/
		
		
		video.streamFieldBitIndex = 5;
		video.streamField = 1;
		video.alignStreamData();
		assertTrue("video.streamFieldBitIndex should be " + /*what I expect it to be +*/ " but was "
                + video.streamFieldBitIndex/*what it actually is*/, video.streamFieldBitIndex == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("video.streamField should be " + /*what I expect it to be +*/ " but was "
                + video.streamField/*what it actually is*/, video.streamField == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
		
		
		video.streamFieldBitIndex = 5;
		video.alignStreamData();
		assertTrue("video.streamFieldBitIndex should be " + /*what I expect it to be +*/ " but was "
                + video.streamFieldBitIndex/*what it actually is*/, video.streamFieldBitIndex == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("video.streamField should be " + /*what I expect it to be +*/ " but was "
                + video.streamField/*what it actually is*/, video.streamField == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
		
		
		video.streamFieldBitIndex = 5;
		video.alignStreamData();
		assertTrue("video.streamFieldBitIndex should be " + /*what I expect it to be +*/ " but was "
                + video.streamFieldBitIndex/*what it actually is*/, video.streamFieldBitIndex == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("video.streamField should be " + /*what I expect it to be +*/ " but was "
                + video.streamField/*what it actually is*/, video.streamField == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
	}
	
	//This method doesn't change any variables that I can access, except for javaPixelData (I can't test it). 
	//It only changes local variables within the method.
	//I will need to move the variables out of the method to test if it does as expected.
	//I don't know what this method is supposed to do.
	public void testComposeImageSlice() throws Throwable
	{
		/*video.width = 1;
		video.sliceIndex = 1;
		video.imageSlice = new ImageSlice (5);
		video.composeImageSlice();
		Assert.assertEquals(4,0);*/
		
		int [] javaPixelDataCopy = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.javaPixelData = javaPixelDataCopy;
		video.width = 0;
		video.sliceIndex = 0;
		video.imageSlice = new ImageSlice (1);
		video.composeImageSlice();
		assertTrue("video.javaPixelData should be " + /*what I expect it to be +*/ " but was "
                + video.javaPixelData/*what it actually is*/, video.javaPixelData.equals(/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		
		
		javaPixelDataCopy = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.javaPixelData = javaPixelDataCopy;
		video.width = 3;
		video.sliceIndex = 2;
		video.imageSlice = new ImageSlice (3);
		video.composeImageSlice();
		assertTrue("video.javaPixelData should be " + /*what I expect it to be +*/ " but was "
                + video.javaPixelData/*what it actually is*/, video.javaPixelData.equals(/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		
		
		javaPixelDataCopy = new int [] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.javaPixelData = javaPixelDataCopy;
		video.width = 5;
		video.sliceIndex = 3;
		video.imageSlice = new ImageSlice (3);
		video.composeImageSlice();
		assertTrue("video.javaPixelData should be " + /*what I expect it to be +*/ " but was "
                + video.javaPixelData/*what it actually is*/, video.javaPixelData.equals(/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
	}

	//I don't know how this method changes the variables so I don't know what the expected values are
	public void testDecodeFieldBytes() throws Throwable
	{
		/*int [] run = {0};
		int [] level = {0};
		boolean [] last = {false};
		video.decodeFieldBytes(run, level, last);
		Assert.assertEquals(run[0],4);
		Assert.assertEquals(level[0],4);
		Assert.assertEquals(last[0],true);*/
		
		int [] run = {0};
		int [] level = {0};
		boolean [] last = {false};
		video.streamIndex = 0;
		video.streamFieldBitIndex = 1;
		video.imageStreamByteArray = new byte [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.decodeFieldBytes(run, level, last);
		assertTrue("run[0] should be " + /*what I expect it to be +*/ " but was "
                + run[0]/*what it actually is*/, run[0] == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("level[0] should be " + /*what I expect it to be +*/ " but was "
                + level[0]/*what it actually is*/, level[0] == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("boolean[0] should be " + /*what I expect it to be +*/ " but was "
                + last[0]/*what it actually is*/, last[0] == (/*what I expect it to be*/ false /*test to see if the expected and real are equal*/));
		
		
		run = new int [] {0};
		level = new int [] {0};
		last = new boolean [] {true};
		video.streamIndex = 0;
		video.streamFieldBitIndex = 1;
		video.imageStreamByteArray = new byte [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.decodeFieldBytes(run, level, last);
		assertTrue("run[0] should be " + /*what I expect it to be +*/ " but was "
                + run[0]/*what it actually is*/, run[0] == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("level[0] should be " + /*what I expect it to be +*/ " but was "
                + level[0]/*what it actually is*/, level[0] == (/*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/));
		assertTrue("boolean[0] should be " + /*what I expect it to be +*/ " but was "
                + last[0]/*what it actually is*/, last[0] == (/*what I expect it to be*/ false /*test to see if the expected and real are equal*/));
	}
	
	//I don't know how this method changes the variables so I don't know what the expected values are
	//If the Boolean input is "true", then the method returns an arrayIndexOutOfBounds error
	public void testGetBlockBytes() throws Throwable
	{
		/*Boolean input = true;
		video.getBlockBytes(input);
		Assert.assertEquals(video.dataBlockBuffer[0],4);*/
		
		
		Boolean input = false;
		short [] dataBlockBufferCopy = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		video.dataBlockBuffer = dataBlockBufferCopy;
		video.quantizerMode = 31;   //the value of static final int TABLE_QUANTIZATION_MODE
		video.streamFieldBitIndex = 1;
		video.imageStreamByteArray = new byte [] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		video.getBlockBytes(input);
		video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);
		video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);
		video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);
		video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);video.getBlockBytes(input);
		assertTrue("video.dataBlockBuffer[0] should be " + /*what I expect it to be +*/ " but was "
                + video.dataBlockBuffer[0]/*what it actually is*/, video.dataBlockBuffer[0] == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.dataBlockBuffer[31] should be " + /*what I expect it to be +*/ " but was "
                + video.dataBlockBuffer[31]/*what it actually is*/, video.dataBlockBuffer[31] == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.dataBlockBuffer[63] should be " + /*what I expect it to be +*/ " but was "
                + video.dataBlockBuffer[63]/*what it actually is*/, video.dataBlockBuffer[63] == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		input = false;
		dataBlockBufferCopy = new short [] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		video.dataBlockBuffer = dataBlockBufferCopy;
		video.quantizerMode = 31;   //the value of static final int TABLE_QUANTIZATION_MODE
		video.streamFieldBitIndex = 1;
		video.imageStreamByteArray = new byte [] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		video.getBlockBytes(input);
		assertTrue("video.dataBlockBuffer[0] should be " + /*what I expect it to be +*/ " but was "
                + video.dataBlockBuffer[0]/*what it actually is*/, video.dataBlockBuffer[0] == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.dataBlockBuffer[31] should be " + /*what I expect it to be +*/ " but was "
                + video.dataBlockBuffer[31]/*what it actually is*/, video.dataBlockBuffer[31] == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.dataBlockBuffer[63] should be " + /*what I expect it to be +*/ " but was "
                + video.dataBlockBuffer[63]/*what it actually is*/, video.dataBlockBuffer[63] == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
	}
	
	//This method doesn't change any variables that I can access. It only changes local variables within the method.
	//I will need to move the variables out of the method to test if it does as expected.
	//I don't know what this method is supposed to do.
	//I need to understand the last line of code.
	public void testInverseTransform() throws Throwable
	{
		/*int macroBlockIndex = 0;
		int dataBlockIndex = 0;
		video.inverseTransform(macroBlockIndex, dataBlockIndex);
		Assert.assertEquals(4,0);*/
		
		
		short [] dataBlockBufferCopy = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		video.dataBlockBuffer = dataBlockBufferCopy;
		int macroBlockIndex = 0;   //input 1
		int dataBlockIndex = 0;    //input 2
		video.imageSlice = new ImageSlice (2);
		video.inverseTransform(macroBlockIndex, dataBlockIndex);
		//assertTrue("SOMETHING should be " + /*what I expect it to be +*/ " but was "
              //  + SOMETHING /*what it actually is*/, SOMETHING == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
		assertTrue(0==1);
		
		
		dataBlockBufferCopy = new short [] {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
		video.dataBlockBuffer = dataBlockBufferCopy;
		macroBlockIndex = 1;
		dataBlockIndex = 1;
		video.inverseTransform(macroBlockIndex, dataBlockIndex);
		//assertTrue("SOMETHING should be " + /*what I expect it to be +*/ " but was "
              //  + SOMETHING /*what it actually is*/, SOMETHING == /*what I expect it to be*/ 0 /*test to see if the expected and real are equal*/);
		assertTrue(0==1);
	}
	
	//I don't know how this method changes the variables so I don't know what the expected values are
	public void testPeekStreamData() throws Throwable
	{
		ByteBuffer stream = ByteBuffer.allocate (5);
		int count = 1;
		video.streamField = 0;
		video.streamFieldBitIndex = 0;
		video.imageStreamCapacity = 0;
		video.streamIndex = 0;
		byte[] imageStreamByteArrayCopy = {0,1,2,3,4,5};
		video.imageStreamByteArray = imageStreamByteArrayCopy;
		int output = video.peekStreamData(stream, count);
		assertTrue("video.peekStreamData() ouput should be " + /*what I expect it to be +*/ " but was "
                + output /*what it actually is*/, output == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		stream = ByteBuffer.allocate (3);
		count = 3;
		video.streamField = 1;
		video.streamFieldBitIndex = 1;
		video.imageStreamCapacity = 1;
		video.streamIndex = 1;
		imageStreamByteArrayCopy = new byte [] {0,1,2,3,4,5,6,7,8,9};
		video.imageStreamByteArray = imageStreamByteArrayCopy;
		output = video.peekStreamData(stream, count);
		assertTrue("video.peekStreamData() ouput should be " + /*what I expect it to be +*/ " but was "
                + output /*what it actually is*/, output == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		stream = ByteBuffer.allocate (2);
		count = 5;
		video.streamField = 2;
		video.streamFieldBitIndex = 2;
		video.imageStreamCapacity = 2;
		video.streamIndex = 2;
		imageStreamByteArrayCopy = new byte [] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		video.imageStreamByteArray = imageStreamByteArrayCopy;
		output = video.peekStreamData(stream, count);
		assertTrue("video.peekStreamData() ouput should be " + /*what I expect it to be +*/ " but was "
                + output /*what it actually is*/, output == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
	}
	
	//I don't know how this method changes the variables so I don't know what the expected values are
	//It uses composeImageSlice(), readHeader(), readStreamDataInt(), and inverseTransform() inside it
	//This method takes a long time to run
	public void testProcessStream() throws Throwable
	{
		video.imageStreamCapacity = 1;
		video.blockCount = 1;
		video.processStream();
		assertTrue("video.quantizerMode should be " + /*what I expect it to be +*/ " but was "
                + video.quantizerMode /*what it actually is*/, video.quantizerMode == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		video.imageStreamCapacity = 2;
		video.blockCount = 2;
		video.processStream();
		assertTrue("video.quantizerMode should be " + /*what I expect it to be +*/ " but was "
                + video.quantizerMode /*what it actually is*/, video.quantizerMode == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		video.imageStreamCapacity = 3;
		video.blockCount = 3;
		video.processStream();
		assertTrue("video.quantizerMode should be " + /*what I expect it to be +*/ " but was "
                + video.quantizerMode /*what it actually is*/, video.quantizerMode == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
	}
	
	//I don't know how this method changes the variables so I don't know what the expected values are
	//It uses other methods before doing its own implementation.
	//I need to consider the other methods that it uses when testing
	public void testReadHeader() throws Throwable
	{
		Assert.assertEquals(4,0);

	}
	
	//I don't know how this method changes the variables so I don't know what the expected values are
	public void testReadStreamDataInt() throws Throwable
	{
		video.streamFieldBitIndex = 1;
		video.streamIndex = 1;
		video.imageStreamByteArray = new byte [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int count = 1;
		int output = video.readStreamDataInt(count);
		assertTrue("video.readStreamDataInt() output should be " + /*what I expect it to be +*/ " but was "
                + output /*what it actually is*/, output == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.streamField should be " + /*what I expect it to be +*/ " but was "
                + video.streamField /*what it actually is*/, video.streamField == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		video.streamFieldBitIndex = 2;
		video.streamIndex = 2;
		video.imageStreamByteArray = new byte [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		count = 32;
		output = video.readStreamDataInt(count);
		assertTrue("video.readStreamDataInt() output should be " + /*what I expect it to be +*/ " but was "
                + output /*what it actually is*/, output == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.streamField should be " + /*what I expect it to be +*/ " but was "
                + video.streamField /*what it actually is*/, video.streamField == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		
		
		video.streamFieldBitIndex = 3;
		video.streamIndex = 3;
		video.imageStreamByteArray = new byte [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		count = 80;
		output = video.readStreamDataInt(count);
		assertTrue("video.readStreamDataInt() output should be " + /*what I expect it to be +*/ " but was "
                + output /*what it actually is*/, output == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
		assertTrue("video.streamField should be " + /*what I expect it to be +*/ " but was "
                + video.streamField /*what it actually is*/, video.streamField == /*what I expect it to be*/ 10 /*test to see if the expected and real are equal*/);
	}
}
