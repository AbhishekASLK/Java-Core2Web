
import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100); // Adding Single character to the file
		fw.write("Abhi\nBhosle");
		fw.write('\n');
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
	}
}
