package org.javaturk.oofp.ch03.math.calculator1;

public class FiboniacciFunction implements MathFunction{
	private static String name = "Fiboniacci";
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public double calculate(double arg) {
			
		    if(arg == 0) {
		        return 0;
		    }
		    else if(arg == 1) {
		      return 1;
		    }
		    else if(arg<0) {
		    	System.out.println("Fiboniacci negatif deger alamaz");
		    	return -1;
		    }
		   else
		      return calculate(arg - 1) + calculate(arg - 2);
	}

}
