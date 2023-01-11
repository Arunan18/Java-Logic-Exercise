package Exercise_01;

public class Question1 {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		float sum = 0;
		double squareSum = 0;
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		float average = sum / number.length;
		System.out.println("average of the 10 numbers:- " + average);

		for (int i = 0; i < number.length; i++) {
			float different = number[i] - average;
			// System.out.println(different);
			double square = Math.pow(different, 2);
			// System.out.println(square);
			squareSum = squareSum + square;

		}
		// System.out.println("********" + squareSum + "*******");
		double square7 = Math.pow(squareSum, 0.5);
		// System.out.println(square7);
		double stand = square7 / number.length;
		System.out.println("Standrad deviation :- " + stand);

	}

}
