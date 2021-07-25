package lab4.taylorSeries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import lab4.trigonometricLib.*;

/**
 * 
 * @author Sandeep Varma Mudunuri (110057766)
 * Taylor Series Expansions - Sin, Cos, Tan
 * The expansions have a measure in radians
 * The degrees are converted into radians
 *
 */

public class TaylorSeries {
	
	public static void main(String[] args) throws NumberFormatException, IOException, NullException {
		
	System.out.println("Taylor Series Expansions \n");	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double x;
    
    System.out.println("Enter the angle whose sine is to be calculated in degrees: ");
    try{
    	String y = br.readLine();
    	
    	if(!(y == null))
    	{
    	x = Double.parseDouble(y);
    	Double sin = SinFunction.sin(x);
    	System.out.println("The taylor series expansion for sin("+x+") is: "+sin);
    	
    	Double cos = CosFunction.cos(x);
    	System.out.println("The taylor series expansion for cos("+x+") is: "+cos);
    	
    	Double tan = TanFunction.tan(x);
    	System.out.println("The taylor series expansion for tan("+x+") is: "+tan);
    	}
    }
    	catch(NumberFormatException e){
    		throw new NullException("The angle is empty");
    }
    
	
	}
}
