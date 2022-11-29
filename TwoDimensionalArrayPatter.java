// Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search
// for substring like “too” in the two dimensional string both from left to right and from top to bottom.
// w e L C O
// M E T O Z
// O H O C O
// R P O R A
// T I O n
// And print the start and ending index as
// Start index : <1,2>
// End index: <3, 2>
  
import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = input.next();

		int length = string.length();
		int k = 0;
		int num = (int) Math.ceil(Math.sqrt(length));

		char arr[][] = new char[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (k >= length) {
					break;
				}
				arr[i][j] = string.charAt(k);
				k++;
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter a SubString to search: ");
		String substring = input.next();
		substring = substring.toUpperCase();
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - 1; j++) {
				if (arr[i][j] == substring.charAt(0)) {
					if (arr[i + 1][j] == substring.charAt(1)) {
						if (arr[i + 2][j] == substring.charAt(2)) {
							System.out.println("Start index: " + i + "," + j);
							System.out.println("End index: " + (i + 2) + "," + j);
						}
					} else if (arr[i][j + 1] == substring.charAt(1)) {
						if (arr[i][j + 2] == substring.charAt(2)) {
							System.out.println("Start index: " + i + "," + j);
							System.out.println("End index: " + i + "," + (j + 2));
						}
					}
				}
			}
		}
	}
}
