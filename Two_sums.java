package basic_prblm;
import java.util.Arrays;
import java.util.Scanner;

public class Two_sums {
	public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] { i, j };
                    
                }
            }
        }
        return new int[] {};
    }
    
    
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array:");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Enter the target");
		 int t=sc.nextInt();
		 int result[]= twoSum(arr,t);
		 System.out.println(Arrays.toString(result));
		 sc.close();
		}

	}


