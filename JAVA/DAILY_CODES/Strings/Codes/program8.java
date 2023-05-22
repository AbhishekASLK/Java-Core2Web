class marvel {

	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("String");

		StringBuffer str2 = new StringBuffer(str1);

		String str = new String(str2);

		System.out.println(str.replace('t','p'));
		System.out.println(str);

	}
}
