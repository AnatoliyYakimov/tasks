import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int M = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int N = scanner.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < M; i++) {
			System.out.println("Enter row " + (i + 1));
			for (int j = 0; j < N; j++) {
				matrix[j][i] = scanner.nextInt();
			}
		}

		printMatrix(matrix);

		for (int i = N; i-- > 0;) {
			if (containsZero(matrix[i])) {
				swapColumns(matrix, i, N - 1);
				break;
			}
		}

		printMatrix(matrix);
	}

	private static void printMatrix(int[][] array) {
		int N = array.length;
		int M = array[0].length;
		System.out.println("[");
		for (int i = 0; i < M; i++) {
			System.out.print("\t [ ");
			for (int j = 0; j < N; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println("]");
		}
		System.out.println("]");
	}

	private static void swapColumns(int[][] array, int i, int j) {
		if (i == j) {
			return;
		}
		int[] tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	private static boolean containsZero(int[] ints) {
		for (int value : ints) {
			if (value == 0) {
				return true;
			}
		}
		return false;
	}
}
