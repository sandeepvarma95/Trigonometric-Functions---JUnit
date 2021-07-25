package lab4.trigonometricLib;

public class SinFunction {
	
	public static Double sin(Double ang)
	{
		
		double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // calculation of the first i terms from the taylor series
        
        degToRad(ang);
        
        double norAng = normalizeRadians.radians(ang);
        
        for (int i = 1; term != 0.0; i++) {
            term *= (norAng / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
		return sum;
	}
	
	public static Double degToRad(Double deg)
	{
		return degToRadians.degToRads(deg);
	}

}
