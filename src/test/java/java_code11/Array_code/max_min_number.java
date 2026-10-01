package java_code11.Array_code;

public class max_min_number {
	public static void main(String[] args) {

		int[] numbers = {45, 12, 78, 3, 0, 89, 107, 23, 56};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : numbers) {

			if (num < min) {
				min = num;
			}
			 if (num > max) {

				max = num;
			}
		}
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}
}
