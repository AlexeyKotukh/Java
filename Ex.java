package packet;

import java.util.*;

public class Ex {

	public static void main(String[] args) {
		System.out.println("First number: ");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println("Second number: ");
		int second = scanner.nextInt();
		int count = Math.abs(second - first) + 1;

		System.out.println("Ex(1): ");
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = first + i;
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("Amount of numbers : " + count);
		System.out.println();

		System.out.println("Ex(2): ");
		ArrayList<Integer> array1 = new ArrayList<>();
		int odd = 0;
		for (int i = 0; i < count; i++) {
			if (array[i] % 2 != 0) {
				array1.add(array[i]);
				odd++;
			}
		}
		
		System.out.println(array1);
		System.out.println("Amount of odd num: " + odd);
		System.out.println();

		System.out.print("Ex(3): ");
		ArrayList<Integer> array2 = new ArrayList<>();
		int even = 0;
		for (int i = 0; i < count; i++) {
			if (array[i] % 2 == 0) {
				array2.add(array[i]);
				even++;
			}
		}

		System.out.println(array2);
		System.out.println("Amount of even num: " + even);
		System.out.println();

		System.out.print("Ex(4): ");
		ArrayList<Integer> array3 = new ArrayList<>();
		int negative = 0;
		for (int i = 0; i < count; i++) {
			if (array[i] < 0) {
				array3.add(array[i]);
				negative++;
			}
		}

		if (negative == 0) {
			System.out.println("There are no negative numbers");
		} else {
			System.out.println(array3);
			System.out.println("Amount of negative numbers: " + negative);
		}
		System.out.println();
		
		System.out.print("Ex(5): ");
		ArrayList<Integer> array4 = new ArrayList<>();
		int positive = 0;
		for (int i = 0; i < count; i++) {
			if (array[i] >= 0) {
				array4.add(array[i]);
				positive++;
			}
		}
		if (positive <= 0) {
			System.out.println("There are no positive numbers");}
			else {
				System.out.println(array4);
				System.out.println("Amount of positive numbers: " + positive);
			}
		System.out.println();
		}
	}


