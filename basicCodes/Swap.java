class Swap{
	public static void main(String[] args){
		int a = 5;
		int b = 15;
		System.out.println("a is "+a+"b is "+b);
			
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a+"b is "+b);
	}
}	
