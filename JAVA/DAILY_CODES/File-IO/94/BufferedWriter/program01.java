import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is*write*method of filewriter class",5,14);
		fw.flush();
	}
}
