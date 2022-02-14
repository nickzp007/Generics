package com.bridgelabz.generics;

	public class FindMaxUsingGeneric {

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
		public String findMaxString(String num1, String num2, String num3) {
			String maxOfString = num1;
			if (num1.compareTo(maxOfString) > 0) {
				maxOfString = num1;
			}
			if (num2.compareTo(maxOfString) > 0) {
				maxOfString = num2;
			}
			if (num3.compareTo(maxOfString) > 0) {
				maxOfString = num3;
			}
			return maxOfString;
		}
		public static void main(String[] args) {

			int maxInteger;
			System.out.println("Solving Problem by using Generic");
			FindMaxUsingGeneric obj = new FindMaxUsingGeneric();
			maxInteger = obj.findMaxInteger(12, 30, 25);
			System.out.println(maxInteger);
			Float maxFloat = obj.findMaxFloat(12.12f, 30.9f, 25.8f);
			System.out.println(maxFloat);
			String maxString = obj.findMaxString("Apple","Peach","Banana");
			System.out.println(maxString);
		}

	}

}
