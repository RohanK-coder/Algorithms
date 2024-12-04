import java.util.*;
class Floor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{2,4,6,8,10,12};
		int start = 0;
		int end = arr.length-1;
		int target = sc.nextInt();

		while(start<=end){
			int mid = start+((end-start)/2);
			if(target==arr[mid]) {
				System.out.print("Floor Found at index : "+mid);
				return;
			}
			else if(target>arr[mid]){
				if(target<arr[mid+1]){
					System.out.println("Floor Found at index: "+mid+" with the value "+arr[mid]);
					return;
				}
				else{
					start=mid+1;
				}
			}
			else if(target<arr[mid]){
				if(target>arr[mid-1]){
					System.out.println("Floor found at index: "+(mid-1)+" with the value : "+arr[mid-1]);
					return;
				}
				else{
					end=mid-1;
				}
			}
		}
	}
}

