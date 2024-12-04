class ReverseArray{
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5};
		for(int i : arr){
			System.out.print(i);
		}
		int start = 0;
		int end = arr.length - 1;

		while(start<end){
			arr[start] = arr[start]+arr[end];
			arr[end] = arr[start]-arr[end];
			arr[start] = arr[start] - arr[end];
			start++;
			end--;
		}
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}
