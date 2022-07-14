package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		/*
		 * declare 2 number and verify which one is the largest
		 */

		int num1=20;
		int num2=66;
		
		if (num1>num2) {
		System.out.println(num1+"is larger than"+num2);
		
	}else {
		System.out.println(num2+"is larger than"+num1);
		
		
		/*
		 * second scenario 
		 */
		
		int num3=15;
		int num4=20;
		
		if (num3>num4) {
			System.out.println(num3+"larger than"+num4);
				
			}else if(num4>num3) {
				System.out.println(num4+"is larger than"+num3);
			}else {
				System.out.println(num3+"is equals to"+num4);
				
				
			
				
				
			}
		}
	}
	}

