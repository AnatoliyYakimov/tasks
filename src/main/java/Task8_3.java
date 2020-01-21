import java.util.Scanner;

public class Task8_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int M = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int N = scanner.nextInt();

		int[][] array = generateSpecialArray(M, N);

		System.out.println("[");
		for (int i = 0; i < M; i++) {
			System.out.print("\t");
			for (int j = 0; j < N; j++) {
				System.out.print(array[j][i]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("]");
	}

	private static int[][] generateSpecialArray(int M, int N) {
		int[][] array = new int[N][M];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				int val = i * M;
				if (i % 2 == 0) {
					val += j;
				} else {
					val += M - 1 - j;
				}
				array[(N - 1) - i][(M - 1) - j] = val;
			}
		}
		return array;
	}
}
