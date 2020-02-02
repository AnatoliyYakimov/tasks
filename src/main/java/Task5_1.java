import java.util.Arrays;
import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = scanner.nextInt();
		int[] array = new int[N];
		System.out.println("Enter " + N + " array elements:");
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		printMax(N, array);
	}

	private static void printMax(int n, int[] array) {
		/* Проходя массив слева направо ищем максимальный элемент.
		 * Все элементы слева от максимального будут строго меньше его.
		 */
		int max = array[0];
		int imax = 0;
		for (int i = 1; i < n; i++) {
			if (array[i] > max) {
				max = array[i];
				imax = i;
			}
		}
		/* Arrays.toString(array) - встроенная функция, превращает массив в строку,
		 * позволяя напечатать его с помощью любой функции печати
		 */
		System.out.println(Arrays.toString(array));
		System.out.println("Max value: " + max);
		System.out.println("Max value index: " + imax);
	}
}
