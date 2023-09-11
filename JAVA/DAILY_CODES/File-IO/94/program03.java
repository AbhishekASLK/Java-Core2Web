
import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("D.txt");
		fw.write(65);
		fw.write('X');
		//fw.flush();
		//fw.close();
		fw.flush();	
		fw.write('Y');
	}
}
