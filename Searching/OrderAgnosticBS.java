import java.util.*;
class OrderAgnosticBS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("\nEnter the elements of the array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("\nEnter the target to be searched : ");
		int target = sc.nextInt();
		//System.out.println("\n1 is descending : 0 is ascending");
		System.out.println(orderBS(arr,target));
	}

	// Binary Search for Ascending or Descending Order
	public static int orderBS(int[] arr,int target){
		int start = 0;
		int end = arr.length - 1;

		while(start<=end){
			int mid = start+((end-start)/2);
			if(arr[mid]==target) return mid;
			
			//Ascending Order Code
			if(arr[0]<arr[arr.length-1]){
				if(target>mid){
					start=mid+1;
				}
				else if(target<mid){
					end=mid-1;
				}
				else{
					return mid;
				}
			}
			//for descending order
			else{
				if(target>mid){
					end=mid-1;
				}
				else if(target<mid){
					start=mid+1;
				}
				else return mid;
			}
			

	}
	return -1;

}
}
