package org.javaturk.oofp.ch09.lambda.math;

public class AnonymousMathImplementations {

	public static void main(String[] args) {
		
		java.lang.Math adder = new java.lang.Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 + arg2;
			}
		};
		
		doMath(adder, 3, 5);
		
		doMath(new java.lang.Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 * arg2;
			}
		}, 3, 5);
		
		doMath(new java.lang.Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 - arg2;
			}
		}, 3, 5);
		
		doMath(new java.lang.Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 / arg2;
			}
		}, 3, 5);
	}
	
	public static void doMath(java.lang.Math math, double arg1, double arg2){
		System.out.println(math.calculate(arg1, arg2));
	}
}
