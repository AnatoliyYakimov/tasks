import java.util.Arrays;
import java.util.Scanner;

public class Task6_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int N = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int M = scanner.nextInt();
		int[][] array = new int[N][M];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter row " + (i + 1));
			for (int j = 0; j < M; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		int oddIdx = findLastOddRow(array);

		System.out.println("[");
		for (int[] ints : array) {
			System.out.println("\t" + Arrays.toString(ints));
		}
		System.out.println("]");
		System.out.println("Last odd row: " + oddIdx);
	}

	private static int findLastOddRow(int[][] array) {
		int oddIdx = -1;
		for (int i = array.length; i-- > 0;) {
			if (isOddRow(array[i])){
				oddIdx = i;
				break;
			}
		}
		return oddIdx;
	}

	private static boolean isOddRow(int[] array) {
		for (int val : array) {
			if (val % 2 == 1) {
				return false;
			}
		}
		return true;
	}


}