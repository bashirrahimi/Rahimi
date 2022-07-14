package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {

		/*
		 * declare a variable rate. if rate is more than 5--> I am not buying house
		 */

		double mortgageRate = 5.5;

		if (mortgageRate > 5) {

			System.out.println("I am not buying house");

			// second example
			int num1 = 99;
			int num2 = 10;

			System.out.println(num1 + "is bigger than" + num2);

			/*
			 * declare a temperature if temperature is higher than 75--> i will go for a
			 * walk
			 */

			int temp = 65;

			if (temp > 75) {

				System.out.println("I will go for awalk");

			} else {
				System.out.println("I will stay home");

				char gender = 'm';
				{

					if (gender == 'f')
						System.out.println("you like shoping");
					else {
						System.out.println("you like sport");

						String browser = ("firefox");
						if (browser.equals("chrome")) {
							System.out.println("all test will be executed");

						} else {
							System.out.println("I will not execute any test");
						}
					}

				}

			}
		}

	}

}
