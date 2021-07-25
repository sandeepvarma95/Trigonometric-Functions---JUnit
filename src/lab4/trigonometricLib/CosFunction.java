package lab4.trigonometricLib;

public class CosFunction {

	public static Double cos(Double ang)
	{
		
		double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // calculation of the first i terms from the taylor series
        
        degToRad(ang);
        //System.out.println("The value is"+Math.cos(ang));
        double norAng = normalizeRadians.radians(ang);
        sum = 1;
        for (int i = 1; term != 0.0; i++) {
            term *= (norAng / i);
            if (i % 4 == 0) sum += term;
            if (i % 4 == 2) sum -= term;
        }
        //double seriesSum = 1 - sum;
		return sum;
		
		
	}
	
	public static Double degToRad(Double deg)
	{
		return degToRadians.degToRads(deg);
	}
}
