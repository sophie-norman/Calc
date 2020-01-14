package com.kavinschool.calc;

public class Calc {
	private double x, y;

	Calc(double a, double b) {
		x = a;
		y = b;
	}

	public double add2() {
		if(x > 0) return 1;
		else if *y >0) return 2;
		
		if(x>y) return 3;
		
		return x + y;
	}

	public double add() {
				
		return x + y;
	}

	
	public double mul() {
		return x * y;
	}

	public double sub() {
		return x - y;
	}

	public double div() {
		return x / y;
	}

	public double rem() {
		return x % y;
	}

	public double cube() {
		return x * x * x;
	}

	public double square() {
		return x * x ;
	}

	public double pow() {
		return (int)x ^ (int)y;
	}

}
