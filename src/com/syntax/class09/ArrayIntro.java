package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// create an array
		int[] b=new int [4];
		// store the value
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		// access values from array
		System.out.println(b[2]);//70
		System.out.println(b[1]+b[3]);// 185

		// we need to create an array of my classmates names
		String[] classmates=new String[5];
		
		classmates[0]="Ahmad";
		classmates[1]="Mahmood";
		classmates[2]="Kalbi";
		classmates[3]="Maqaood";
		classmates[0]="Nabi";
		
		System.out.println("My classmate name is "+classmates[3]);
	}

}
