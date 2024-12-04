import java.util.*;
class BinarySearchWhile{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5,6};
		int start = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target value : ");
		int target = sc.nextInt();
		int end = arr.length-1;

		while(start<=end){
			int mid = start + ((end-start)/2);
			if(target>arr[mid]){
				start=mid+1;
			}
			else if(target<arr[mid]){
				end=mid-1;
			}
			else if(target==arr[mid]) {
				System.out.println("Target found at index : "+mid);
				return;
			}
		}
	}
}
