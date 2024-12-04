class LinearSearch{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5,6};
		boolean flag = false;
		int toFind = 4;
		for(int i:arr){
			if(i==toFind){
				flag=true;
			}
		}
		if(flag) System.out.println("Found");
		else System.out.println("Not found");
	}
}
