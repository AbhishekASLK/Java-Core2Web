import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		File f = new File("abc");
		System.out.println(f.exists()); // false
		f.createNewFile();
		System.out.println(f.exists()); // true
	}
}
