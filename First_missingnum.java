package basic_prblm;

import java.util.Scanner;

public class First_missingnum {
	public static int firstMissingPositive(int[] nums) {
	int n = nums.length;
    for (int i = 0; i < n; i++) {
		while (nums[i] >= 1 && nums[i] <= n) {
		int rightIndex = nums[i] - 1;                
		if (nums[i] == nums[rightIndex]) {
		    break;
		}
		int temp = nums[i];
	    nums[i] = nums[rightIndex];
		nums[rightIndex] = temp;
		}
		}
	    for (int i = 0; i < n; i++) {
		    int expected = i + 1;
		    if (nums[i] != expected) {
		        return expected;
		    }
		}
		return n+1;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(firstMissingPositive(nums));
		sc.close();
	}

}
