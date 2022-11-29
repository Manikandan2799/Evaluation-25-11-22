// Given an array and a threshold value find the o/p
// eg) i/p {5,8,10,13,6,2};threshold = 3;
//  o/p count = 17
//  explanation:
// Number parts counts
// 5 {3,2} 2
// 8 {3,3,2} 3
// 10 {3,3,3,1} 4
// 13 {3,3,3,3,1} 5
// 6 {3,3} 2
// 2 {2} 1
  
import java.util.Scanner;

public class Threshold {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int threshold = input.nextInt();
		int num, count = 0;

		for (int i = 0; i < n; i++) {
			num = input.nextInt();
			count = count + (num / threshold);
			if (num % threshold != 0)
				count++;
		}
		System.out.println(count);
	}

}
