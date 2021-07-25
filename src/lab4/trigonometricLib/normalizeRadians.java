package lab4.trigonometricLib;

public class normalizeRadians {
	
	public static double radians(double ang)
	{
	 final double PI = 3.141592653589793;
	//The conversion takes place for the angle x taken by user input from -(2 * PI Value) and +(2 * PI Value)
	 ang = ang % (2 * PI);
	 
	 return ang;
	}
}
