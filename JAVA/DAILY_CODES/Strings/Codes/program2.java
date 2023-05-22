class marvel {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer(400);

		sb.append("ABCDEFG");

		sb.trimToSize();
		sb.setLength(2);

		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
