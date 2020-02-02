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

		System.out.println(list.toString() + " -> " + newList.toString());
	}

	private static List<Integer> filterList(List<Integer> list) {
		List<Integer> newList = new ArrayList<>(list.size());
		Integer current = null;
		boolean currentLessThenLeft = true;
		boolean currentLessThanRight;
		//Используем ссылочный тип, чтобы избежать ненужного копирования
		for (Integer right : list) {
			if (current == null) {
				current = right;
				currentLessThenLeft = true;
			} else {
				currentLessThanRight = current < right;
				//Если current НЕ меньше left (элемент слева) или НЕ меньше right (справа), то добавляем его
				if (!currentLessThenLeft || !currentLessThanRight) {
					newList.add(current);
				}
				//Здесь мы мысленно сдвигаемся вправо, и тот элемент, который был текущим, становится предыдущим
				//В этот момент мы мысленно работаем с элементом right
				//То есть right становится current, а current становится left
				currentLessThenLeft = right < current;
				current = right;
			}
		}
		if (!currentLessThenLeft) {
			newList.add(current);
		}
		return newList;
	}
}
