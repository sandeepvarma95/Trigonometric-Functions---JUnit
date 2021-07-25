package lab4.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import lab4.trigonometricLib.*;

@RunWith(Parameterized.class)
public class JunitTaylorSeriesParameterized {

	 private double angle;
	 
	 public JunitTaylorSeriesParameterized(double angle)
	 {
		 this.angle = angle;
	 }
	
	@Parameterized.Parameters
	 public static List<Object> data() {
	        Object[] dataValues = new Object[] { 4, 7, 11, 20, 25 };
	        return Arrays.asList(dataValues);
	    }

	 @Test
	    public void testAddition() {
	        SinFunction sinFunc = new SinFunction();
	        assertEquals(Math.sin(angle), sinFunc.sin(angle),0.0001);
	        System.out.println("Test for sin(" + angle + ") has been passed!\n");
	    }
}
