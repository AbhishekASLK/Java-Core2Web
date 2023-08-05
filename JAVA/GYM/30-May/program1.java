class marvel {

	String str1 = null;

	marvel(String str2) {
		this.str1="Shashi";
		System.out.println(System.identityHashCode(this.str1));
		System.out.println(System.identityHashCode(str2));
	}

	public static void main(String[] args) {
		marvel m = new marvel("Shashi");
	}
}
