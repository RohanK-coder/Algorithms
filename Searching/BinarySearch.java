class BinarySearch{
	public static void main(String[] args){
		int[] arr = new int[]{2,4,6,9,11,12,14,20,36,48};
		int target = 36;
		int start = 0;
		int end = arr.length-1;
		int mid = start + ((end-start)/2);
		if(target<arr[mid]){
			for(int i=0;i<mid;i++){
				if(arr[i]==target) System.out.print("Found");
			}
		}
		else if(target>arr[mid]){
                        for(int i=mid+1;i<=end;i++){
                                if(arr[i]==target) System.out.print("Found in the right");
                        }
                }
		

	}
}
