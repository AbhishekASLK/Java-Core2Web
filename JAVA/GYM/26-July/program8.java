
import java.util.Scanner;

class NewException extends Exception {

	public NewException(){
	
	}

	public NewException(String msg){
		super(msg);
	}
}

class Demo1 {
	
	Scanner sc = new Scanner(System.in);
	int i;
	public void run() {
		System.out.println("Enter the number: ");

		i = sc.nextInt();
		if(i>10)
			throw new NewException("IllegalArgumentException User Defined");
	}
}
class ThreadDemo {

	public static void main(String[] args) {
	
		Demo t = new Demo();
		t.run();
	}
}
