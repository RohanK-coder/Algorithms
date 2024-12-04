class VarArgs{
	public static void printNumbers(int... numbers){
		for(int i : numbers){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		printNumbers(1,2,3,4,5,6,7,8,9);
	}
}
