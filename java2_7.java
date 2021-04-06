package com.wiwatyooraks.java2;

public class java2_7 {
	public static void main(String[] args) {
		String word_1 = "You and Me";
		String word_2 = "you and me";
		String check = "Me";
		String Trim = "    Charz 365    ";
		String aTrim = Trim.trim();
		String bTrim = Trim.trim().toUpperCase();
		if ( word_1.equals(word_2))
			System.out.println("Compare Word_1 & Word_2 : " + "True");
		else
			System.out.println("Compare Word_1 & Word_2 : " + "False");
		System.out.println("Me in Word_1 : " + word_1.contains(check));
		System.out.println("Me in Word_2 : " + word_2.contains(check));
		System.out.println("Word_1 length : " + word_1.length());
		System.out.println("Word_2 length : " + word_2.length());
		System.out.println(word_1.substring(0, 4));
		System.out.println(word_2.substring(0, 4));
		System.out.println(aTrim);
		System.out.println(aTrim.toUpperCase());
		System.out.println(bTrim);
	}
}
