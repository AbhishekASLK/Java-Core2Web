import java.util.*;
class marvel {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x<0 || y<0)
			System.out.println("Sorry! Negative Number is not allowed");
		else{
			int n = x*y;
			int rem=n%2;
			switch(rem){
				case 0:
					System.out.println("Even");
					break;
				case 1:
					System.out.println("Odd");
					break;
			}
		}
	}
}
