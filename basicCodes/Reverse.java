import java.util.*;
class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to reverse it : ");
		int n = sc.nextInt();
		int reversed = 0;
		while(n!=0){
			reversed=reversed*10+(n%10);
			n/=10;
		}
		System.out.println("Reversed Number : "+reversed);
	}
}

