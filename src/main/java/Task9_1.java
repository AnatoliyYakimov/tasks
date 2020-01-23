import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9_1 {

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
		Integer last = null;
		//Используем ссылочный тип, чтобы избежать ненужного копирования
		for (Integer current : list) {
			if (last != null) {
				newList.add(current + last);
			}
			last = current;
		}
		return newList;
	}
}
