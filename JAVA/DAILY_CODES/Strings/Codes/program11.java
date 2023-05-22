class marvel {

	public static void main(String[] args) {
	
		String str1 = new String("Shashi");
		String str2 = "Shashi";
		
		System.out.println(str1==str2);

		String str3 = new String("Core2Web").intern();
		String str4 = "Core2Web";

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		System.out.println(str3==str4);
	}
}
