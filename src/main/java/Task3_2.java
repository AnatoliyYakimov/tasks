import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height: ");
		int H = scanner.nextInt();

		if (H > 0) {
			for (int j = 0; j < H - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int i = 1; i < H - 1; i++) {
			for (int j = i; j < H - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("\\");
		}
		if (H > 1) {
			System.out.print("*");
			for (int i = 0; i < H * 2 - 3; i++) {
				System.out.print("-");
			}
			System.out.print("*");
		}
	}
}
