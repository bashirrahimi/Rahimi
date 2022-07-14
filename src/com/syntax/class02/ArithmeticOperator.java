package com.syntax.class02;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		int num1=30;
		int num2=40;
		int sum,sub,mult,div;
		
		System.out.println(num1+num2);
		
		double num3=2.99;
		double num4=4.99;
		double sum1,sub1,mult1,div1;
		
		
		// first way to do the below arithmetic Operator
		double result=num3+num4;
		System.out.println(result);
		
		// 2nd way of to to the above arithmetic operator 
		
		System.out.println(num3+num4);
		
		
		float num5=4.5f;
		float num6=3.6f;
		float sum3,sub3,mult3,div3;
		
		System.out.println(num5+num6);
		
		// between double and float for decimal numbers double is mostly used
		
		int a=10;
		int b=3;
		System.out.println(a/b);//3
		System.out.println(a%b);// 1 shows the remainder 
	}

}
