package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a credit card? Type false or true");
		boolean card = scan.nextBoolean();
		if (card) {
			System.out.println("What is balance on the card?");
			int value = scan.nextInt();
			if (value >= 1000) {
				System.out.println("Pay it off immediately");
			} else {
				System.out.println("Spend more");
			}
		} else {
			System.out.println("We are offering you a card");
		}
		scan.close();
	}
}