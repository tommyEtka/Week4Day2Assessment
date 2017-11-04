package PersonManagerEmployeePoly;

import java.util.ArrayList;

public class assessmentNumber8 {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		ArrayList<Integer> numberList = new ArrayList<>();

		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);

		while (i < numberList.size()) {
			sum += numberList.get(i);

			i++;
		}
		System.out.println(sum);

	}

}
