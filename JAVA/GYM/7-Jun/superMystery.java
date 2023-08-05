class Parent {
	int fun(){
		System.out.println("Parent fun");
		return 0;
	}
}

class Child extends Parent {
	Child(){
		System.out.println(this);
		System.out.println((Parent)(this)); // super;
		System.out.println(((Parent)(this)).fun()); // super.fun();
	}
}

class Test {

	public static void main(String[] args) {
	
		Child obj = new Child();
	}
}
