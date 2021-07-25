package lab4.trigonometricLib;

public class degToRadians {

	public static double degToRads(double angle)
	{
		final double Circle = 360;
		final double PI = 3.141592653589793;
		
		double convertedRads = (2*angle*PI)/Circle;
		
		//System.out.println("The converted degrees to radians is: "+convertedRads);
		return convertedRads;
	}
}
