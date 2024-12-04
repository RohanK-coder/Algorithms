import java.util.*;
class Ceiling{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int[] arr  = new int[]{2,3,5,9,14,16,18};
		System.out.print("Enter the target to be searched : ");
		int target = sc.nextInt();
		int start = 0;
		int end = arr.length-1;

		while(start<=end){
			int mid = start + ((end-start)/2);
			if(target == arr[mid]){
				System.out.println("Ceiling is found at : "+mid+" and the value is "+arr[mid]);
				return;
			}
			else if(target>arr[mid]){
				if(target<arr[mid+1]){
					System.out.print("Ceiling is found at "+(mid+1)+" and the value is "+arr[mid+1]);
					return;
				}
				else
					start = mid+1;
			}
			else if(target<arr[mid]){
				if(target>arr[mid-1]){
					System.out.print("Ceiling is found at "+(mid)+" and the value is"+arr[mid]);
					return;
				}
				else
					end = mid-1;
			}
		}
	}
}
