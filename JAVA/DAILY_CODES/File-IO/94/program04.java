
import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write("Core2web");
		fw.flush();
	}
}
