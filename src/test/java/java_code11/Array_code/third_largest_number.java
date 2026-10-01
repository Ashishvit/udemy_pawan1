package java_code11.Array_code;

public class third_largest_number {

		public static void main(String[] args) {

			int[] arr = {10, 20, 80, 45, 86, 53, 100, 170};
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			int third = Integer.MIN_VALUE;

			for (int num : arr) {

				if (num > first) {
					third = second;
					second = first;
					first = num;
				}
				else if (num > second && num != first) {
					third = second;
					second = num;
				}
				else if (num > third && num != second && num != first) {
					third = num;
				}
			}
			if (third == Integer.MIN_VALUE)
			System.out.println("Array does not have 3 distinct elements");
			else
				System.out.println("Third largest : " + third);
		}
	}

