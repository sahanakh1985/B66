package com.basic.programs;

public class PresenceOfSpecificDigit {
	public static void main(String[] args) {
		int[] arr = { 237, 452, 694, 134, 876 };
		boolean containsSeven = false;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 10 == 7) || (arr[i] / 10 == 7)) {
				containsSeven = true;
				break; // Once we find '7', no need to check further
			}
		}

		if (containsSeven) {
			System.out.println("The array contains the digit '7'.");
		} else {
			System.out.println("The array doesn't contain the digit '7'.");
		}
	}
}