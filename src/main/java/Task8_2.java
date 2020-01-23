import java.util.Scanner;

public class Task8_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int N = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int M = scanner.nextInt();
		int[][] matrix = generateSpecialMatrix(N, M);

		System.out.println("[");
		for (int i = 0; i < N; i++) {
			System.out.print("\t");
			for (int j = 0; j < M; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("]");
	}

	private static int[][] generateSpecialMatrix(int n, int m) {
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				matrix[n - i - 1][j] = i;
			}
			for (int j = i + 1; j < m; j++) {
				matrix[n - i - 1][j] = j;
			}
		}
		return matrix;
	}
}
