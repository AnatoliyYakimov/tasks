import java.util.Arrays;
import java.util.Scanner;

public class Task5_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = scanner.nextInt();
		int[] array = new int[N];
		System.out.println("Enter " + N + " array elements:");
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		int idx = findMinimalLocalMaximum(array);
		System.out.println(Arrays.toString(array) + " -> " + idx);
	}

	private static int findMinimalLocalMaximum(int[] array) {
		int minLocalMax = Integer.MAX_VALUE;
		int minLocalMaxIdx = -1;
		for (int i = 0; i < array.length; i++) {
			if (isLocalMax(array, i)) {
				if (minLocalMaxIdx == -1 || array[i] < minLocalMax) {
					minLocalMax = array[i];
					minLocalMaxIdx = i;
				}
			}
		}
		return minLocalMaxIdx;
	}

	private static boolean isLocalMax(int[] array, int i) {
		//Вырожденный случай
		if (array.length == 1) {
			return true;
		}

		boolean isLocalMax;
		if (i == 0) {
			isLocalMax = array[i] - array[i + 1] > 0;
		} else if (i == array.length - 1) {
			isLocalMax = array[i] - array[i - 1] > 0;
		} else {
			isLocalMax = (array[i] - array[i + 1] > 0) && (array[i] - array[i - 1] > 0);
		}
		return isLocalMax;
	}
}
