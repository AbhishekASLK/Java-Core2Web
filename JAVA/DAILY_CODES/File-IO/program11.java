import java.io.*;

class Test {

	public static void main(String[] rag) throws IOException {

		File f1 = new File("ABC.txt");
		f1.createNewFile();
		System.out.println(f1.getCanonicalPath());

		File f2 = new File("XYZ.txt");
		f2.createNewFile();
		System.out.println(f2.getCanonicalPath());	
		
		System.out.println(f1.compareTo(f2));

	}
}
		


