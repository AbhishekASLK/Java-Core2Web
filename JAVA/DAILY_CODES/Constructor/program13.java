class P {

	P(){
		System.out.println("Parent Constructor");
	}

	public static void main(String[] args) {
	
		//C  c = new C();
		P p = new P();
		System.out.println("Main()");
	}
}

class C extends P {
	
	C() {
		System.out.println("Child Constructor");
	}
}
