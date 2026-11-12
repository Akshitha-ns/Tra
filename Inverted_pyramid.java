package basic_prblm;

import java.util.Scanner;

public class Inverted_pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int n = sc.nextInt();
		for(int i = n; i >= 0; i--) {
			for(int k = i; k < n; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
