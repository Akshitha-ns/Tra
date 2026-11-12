package basic_prblm;
import java.util.Scanner;
public class Contains_mostwater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");//1,8,6,2,5,4,8,3,7
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxwater=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int width = right-left;
			int min = Math.min(arr[left],arr[right]);
			int curr = width*min;
			maxwater = Math.max(maxwater, curr);
			if(arr[left]<=arr[right]) {
				left++;
			}else {
				right--;
			}
			
		}
		System.out.println(maxwater);
		sc.close();

	}

}
