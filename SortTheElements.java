Write a program to sort the elements in odd positions in descending order and elements in ascending order 
Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1
        
        
        
import java.util.Scanner;

public class SorttTheElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int length = scanner.nextInt();
		System.out.println("Enter the element of an array : ");
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		while (length > 2) {
			for (int i = 2; i < length; i += 2) {
				if (arr[i] > arr[i - 2]) {
					int temp = arr[i];
					arr[i] = arr[i - 2];
					arr[i - 2] = temp;
				}

				i += 1;

				if (i < length) {

					if (arr[i] < arr[i - 2]) {
						int temp = arr[i];
						arr[i] = arr[i - 2];
						arr[i - 2] = temp;
					}
				}
				i -= 1;

			}
			length -= 2;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
