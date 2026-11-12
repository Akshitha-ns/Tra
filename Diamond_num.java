package basic_prblm;

import java.util.Scanner;

public class Diamond_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int k = i; k < n; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i = n - 1; i >= 1; i--) {
			for(int k = i; k < n; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
