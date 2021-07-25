package lab4.test;

import lab4.trigonometricLib.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class JunitTaylorSeries {

	double convertedRadians = 1.570;         //converted 90 radians to degrees 
	double decimals = 0.01;
	
	
	
	@BeforeClass
	public static void trigFunctionClassBeforeTest() {
		System.out.println("@BeforeClass: Start TaylorSeries class");
	}
	
	@Before
	public void sinFunctionMethodBeforeTest() {
		System.out.println("@BeforeClass: Start sin function method");
	}
	
	@Test
	public void SinTest1()
	{
		// this is to check with the inbuilt Math.sin function and implemented sin function
		assertEquals(Math.sin(10), SinFunction.sin(10.0), decimals);
	}
	
	@Test
	public void SinTest2()
	{
		// this is to check with the inbuilt Math.sin function and implemented sin function
		assertEquals(Math.sin(20), SinFunction.sin(20.0), decimals);
	}
	
	/*@Test
	public void SinTest3()
	{
		// this is to check with the inbuilt Math.toRadians function and implemented sin function
		assertEquals(Math.toRadians(10), SinFunction.sin(SinFunction.degToRad(10.0)), decimals);
	}*/
	
	@After
	public void sinFunctionMethodAfterTest() {
		System.out.println("@AfterClass: End sin function method");
	}
	
	@Test
	public void CosTest1()
	{
		// this is to check with the inbuilt Math.cos function and implemented cos function
		assertEquals(Math.cos(2.0), CosFunction.cos(2.0), decimals);
	}
	
	@Test
	public void CosTest2()
	{
		// this is to check with the inbuilt Math.cos function and implemented cos function
		assertEquals(Math.cos(90), CosFunction.cos(90.0), decimals);
	}
	
	@Ignore
	public void CosTest3()
	{
		// this is to check with the inbuilt Math.toRadians function and implemented cos function
		assertEquals(Math.toRadians(10), CosFunction.cos(CosFunction.degToRad(10.0)), decimals);
	}
	
	@Test
	public void TanTest1()
	{
		// this is to check with the inbuilt Math.tan function and my implemented tan function
		assertEquals(Math.tan(2.0), TanFunction.tan(2.0), decimals);
	}
	
	@Test
	public void TanTest2()
	{
		// this is to check with the inbuilt Math.tan function and my implemented tan function
		assertEquals("Fail",Math.tan(90.0), TanFunction.tan(90.0), decimals);
	}
	
	/*@Test
	public void TanTest3()
	{
		// this is to check with the inbuilt Math.toRadians function and implemented tan function
		assertEquals(Math.toRadians(10), TanFunction.tan(TanFunction.degToRad(10.0)), decimals);
	}*/

/*	@Test
	public void conversionFromDegToRadiansTest() {
		assertEquals(convertedRadians,degToRadians.degToRads(90.0),decimals);
	}
	
	@Test
	public void RadianNormalize()
	{
		// this is to check with the inbuilt Math.tan function and my implemented tan function
		assertEquals(2.300, normalizeRadians.radians(40.0), decimals);
	}*/
	
	/* @Rule		
	 public ErrorCollector collector = new ErrorCollector();	
	 
	 @Test		
	 public void exampleError() {					
	   collector.addError(new Throwable("There is an error in first line"));							

	   System.out.println("Sin Function Check");					
	     try {			
	         	Assert.assertTrue(1.2233 == SinFunction.sin(10.0));					
	        } catch (Throwable t) {					
	            collector.addError(t);					
	        }		
	    }*/		
	
	 
	@AfterClass
	public static void trigFunctionClassAfterTest() {
		System.out.println("@AfterClass: End TaylorSeries class");
	}
	
}
