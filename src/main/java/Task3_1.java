import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height: ");
		int h = scanner.nextInt();
		printTree(h);
	}

	private static void printTree(int h) {
		for (int i = 1; i <= h; i++) {
			//Выводим h - i пробелов
			for (int j = i; j < h; j++) {
				System.out.print(" ");
			}
			//Выводим i '/'
			for (int j = 0; j < i; j++) {
				System.out.print("/");
			}
			//Выводим i '\'
			for (int j = 0; j < i; j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}
