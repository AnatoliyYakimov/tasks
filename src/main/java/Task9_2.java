import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int N = scanner.nextInt();
		List<Integer> list = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}

		List<Integer> newList = filterList(list);

		System.out.println(newList);
	}

	private static List<Integer> filterList(List<Integer> list) {
		List<Integer> newList = new ArrayList<>(list.size());
		Integer last = null;
		boolean resultForLast = true;
		boolean resultForCurrent;
		//Используем ссылочный тип, чтобы избежать ненужного копирования
		for (Integer current : list) {
			if (last == null) {
				last = current;
				resultForLast = true;
			} else {
				resultForCurrent = current - last > 0;
				if (resultForLast && resultForCurrent) {
					newList.add(last);
				}
				resultForLast = !resultForCurrent;
				last = current;
			}
		}
		return newList;
	}
}
