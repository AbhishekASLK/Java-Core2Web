import java.util.*;

class InsufficientBalanceException extends RuntimeException {

	InsufficientBalanceException(String str){
		super(str);
	}
	
}

class Test {

	public static void main(String[] args){

		Thread.currentThread().setName("Google-Pay");
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if(x<0)
			throw new InsufficientBalanceException("No Fund In Account");
		else 
			System.out.println("Balance: "+x);
	}
}
