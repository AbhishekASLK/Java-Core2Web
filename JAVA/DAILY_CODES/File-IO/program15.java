import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
		
		File f = new File("Wakanda");
		f.createNewFile();
		System.out.println(f.getParent());
	}
}
