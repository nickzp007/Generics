package com.bridgelabz.generics;
//UC2

public class FindMaxUsingGeneric_uc2{

	public int findMaxInteger(Integer num1, Integer num2, Integer num3) {
		int maxOfInteger = num1;
		if (num1.compareTo(maxOfInteger) > 0) {
			maxOfInteger = num1;
		}
		if (num2.compareTo(maxOfInteger) > 0) {
			maxOfInteger = num2;
		}
		if (num3.compareTo(maxOfInteger) > 0) {
			maxOfInteger = num3;
		}
		return maxOfInteger;
	}

	public Float findMaxFloat(Float num1, Float num2, Float num3) {
		Float maxOfFloat = num1;
		if (num1.compareTo(maxOfFloat) > 0) {
			maxOfFloat = num1;
		}
		if (num2.compareTo(maxOfFloat) > 0) {
			maxOfFloat = num2;
		}
		if (num3.compareTo(maxOfFloat) > 0) {
			maxOfFloat = num3;
		}
		return maxOfFloat;
	}

	public static void main(String[] args) {

		System.out.println("Solving Problem by using Generic");
		FindMaxUsingGeneric max = new FindMaxUsingGeneric();
		int maxInteger = max.findMaxInteger(12, 30, 25);
		System.out.println(maxInteger);
		Float maxFloat = max.findMaxFloat(12.12f, 30.9f, 25.8f);
		System.out.println("The maximum float is: "+maxFloat);
	}
}