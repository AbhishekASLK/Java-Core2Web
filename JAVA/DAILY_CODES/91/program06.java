
interface Core2Web {
	void lang();
}

class Year2022 {

	public static void main(String[] args){
	
		Core2Web obj = new Core2Web() {
			public void lang(){
				System.out.println("Java/Python/OS");
			}
		};

		obj.lang();
	}
}
