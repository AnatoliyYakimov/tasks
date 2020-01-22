import java.util.Scanner;

public class Task4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height: ");
		int H = scanner.nextInt();
		System.out.println("Enter width: ");
		int W = scanner.nextInt();

		if (H > 0) {
			printEdge(W);
		}

		for (int i = 0; i < H - 2; i++) {
			for (int j = 0; j < W; j++) {
				if (j == 0 || j == W - 1) {
					System.out.print("|");
				} else if (i % 2 == 0){
					System.out.print("\\");
				} else {
					System.out.print("/");
				}
			}
			System.out.println();
		}
		if (H > 1) {
			printEdge(W);
		}
	}

	private static void printEdge(int w) {
		for (int i = 0; i < w; i++) {
			if (i == 0 || i == w - 1) {
				System.out.print("*");
			} else {
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
