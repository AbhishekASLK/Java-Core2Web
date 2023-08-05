import java.util.*;

class InsufficientBalanceException extends RuntimeException {

	InsufficientBalanceException(String msg){
		super(msg);
	}

}

class Test {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------Welcome to G-Pay-----------");
		System.out.println("-----------Select the amount to send: -----------");
		int amountToSend = sc.nextInt();
		System.out.println("-----------What is current balance in your bank?-----------");
		int currentBalance = sc.nextInt();

		if(currentBalance<amountToSend){
			throw new InsufficientBalanceException("Paise kamav");
		}

		else {
			System.out.println("Transaction successful...");
		}

	}
}
