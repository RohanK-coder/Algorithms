import java.util.*;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first operand : ");
		int a = sc.nextInt();
		System.out.print("\nEnter the second operand : ");
		int b = sc.nextInt();
		System.out.print("\nEnter the operation to be done ");
		char s = sc.next().charAt(0);
		switch(s){
			case '+': System.out.print(a+b);
				  break;
			case '-': System.out.print(a-b);
				  break;
			default : System.out.print("Choose the correct option");
		}
	}
}
		
