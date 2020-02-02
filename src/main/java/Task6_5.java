import java.util.Arrays;
import java.util.Scanner;

public class Task6_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int M = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int N = scanner.nextInt();
		int[][] array = new int[N][M];
		for (int i = 0; i < M; i++) {
			System.out.println("Enter row " + (i + 1));
			for (int j = 0; j < N; j++) {
				array[j][i] = scanner.nextInt();
			}
		}
		findMinValueInMaxColumn(N, array);
	}

	private static void findMinValueInMaxColumn(int n, int[][] array) {
		int maxColumnIdx = 0;
		int globalMax = maxInCol(array, 0);
		for (int i = 1; i < n; i++) {
			int maxInCurrentCol = maxInCol(array, i);
			if (maxInCurrentCol > globalMax) {
				globalMax = maxInCurrentCol;
				maxColumnIdx = i;
			}
		}
		int minValueInColumn = minInCol(array, maxColumnIdx);
		System.out.println("[");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[");
		}
		System.out.println("]");
		System.out.printf("Max value in array = %d in column %d. \nMin value in this column = %d",
			globalMax, maxColumnIdx + 1, minValueInColumn);
	}

	private static int maxInCol(int[][] arr, int idx) {
		int[] col = arr[idx];
		int max = col[0];
		for (int i = 1; i < col.length; i++) {
			if (col[i] > max) {
				max = col[i];
			}
		}
		return max;
	}

	private static int minInCol(int[][] arr, int idx) {
		int[] col = arr[idx];
		int min = col[0];
		for (int i = 1; i < col.length; i++) {
			if (col[i] < min) {
				min = col[i];
			}
		}
		return min;
	}
}
