class marvel {

	public static void main(String[] args) {
	
		String str1 = new String("Hello").intern();
		String str2 = new String("Hello").intern();
		
		System.out.println(str1==str2);
	}
}
