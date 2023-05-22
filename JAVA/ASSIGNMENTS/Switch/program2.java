import java.util.*;
class marvel {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		switch(x){
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("Number is greater than 5");
		}
	}
}
