package basic_prblm;

import java.util.Scanner;

public class Jump_Game {
	    public static boolean canJump(int[] nums) {
	        int max=0;
	      for(int i=0;i<nums.length;i++){
	        if(i>max){
	            return false;
	        }
	        if (i + nums[i] > max) {
	                max = i + nums[i];
	            }
	      }
	      return true;  
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(canJump(nums));
		sc.close();

	}

}
