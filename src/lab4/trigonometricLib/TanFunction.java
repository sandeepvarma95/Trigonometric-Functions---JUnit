package lab4.trigonometricLib;

public class TanFunction {
	
	public static Double tan(Double ang)
	{
		
		Double tanx = SinFunction.sin(ang)/ CosFunction.cos(ang);
		return tanx;
	}

	public static Double degToRad(Double deg)
	{
		return degToRadians.degToRads(deg);
	}
}
