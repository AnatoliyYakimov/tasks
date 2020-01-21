import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args){
		//Scanner позволяет организовать удобный ввод с консоли
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		printSequence(N);
	}

	private static void printSequence(int N) {
		final String delim = ", ";
		for (int i = 1; i <= N; i++) {
			int element = i;
			for (int j = 1; j < i; j++) {
				element += i + j;
			}
			System.out.print(element);
			if (i != N) {
				System.out.print(delim);
			}
		}
	}
}
