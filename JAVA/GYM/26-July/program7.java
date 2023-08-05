
class TooYoungException extends RuntimeException {

	TooYoungException(String s){
		super(s);
	}
}

class TooOldException extends RuntimeException {

	TooOldException(String s){
		super(s);
	}
}

class Test {

	public static void main(String[] args){
		
		int age = Integer.parseInt(args[0]);
		
		if(age>60)
			throw new TooYoungException("Plz wait some more time definitely you will get best match!");
		else if (age<18)
			throw new TooOldException("Your age is already crossed marriage age and no chance of getting marriage!");
		else 
			System.out.println("You will get match details soon by email");
	}

}
