package basic_prblm;

import java.util.Scanner;

public class Next_iteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int i = nums.length - 2;
		while (i >= 0 && nums[i] > nums[i + 1]) {
			i--;
		}
		if (i >= 0) {
			int j = nums.length - 1;
			while (nums[i] >= nums[j]) {
				j--;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		int left = nums.length - 2;
		int right = left + 1;
		if (nums[left] > nums[right]) {
			int t = nums[left];
			nums[left] = nums[right];
			nums[right] = t;
		}
		for (int b = 0; b < nums.length; b++) {
			System.out.print(nums[b] + " ");
		}
		sc.close();
	}
}
