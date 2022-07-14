package com.syntax.class04;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */
		
		int x = 20, y = 10, z = 30;

		if ((x > y) && (x > z)) {
			System.out.println("Number " + x + " is largest number among three numbers.");
		} else if ((y > x) && (y > z)) {
			System.out.println("Number " + y + " is largest number among three numbers.");
		} else if ((z > y) && (z > x)) {
			System.out.println("Number " + z + " is largest number among three numbers.");
		}
	}

	

}
