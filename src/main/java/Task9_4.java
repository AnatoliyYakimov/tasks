import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int N = scanner.nextInt();
		List<Integer> list = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}

		List<Integer> newList = filterList(list);

		System.out.println(list.toString() + " -> " + newList.toString());
	}

	private static List<Integer> filterList(List<Integer> list) {
		List<Integer> newList = new ArrayList<>(list.size());
		boolean foundZero = false;
		//Используем ссылочный тип, чтобы избежать ненужного копирования
		for (Integer current : list) {
			if (current == 0) {
				if (!foundZero) {
					foundZero = true;
				} else {
					//Если встретили второй ноль, то выходим из цикла
					break;
				}
			} else if (foundZero) {
				newList.add(current);
			}
		}
		return newList;
	}
}
