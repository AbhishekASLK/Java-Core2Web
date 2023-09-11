

import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("core2web.txt");
		System.out.println(fr.ready());
		fr.close();	
		System.out.println(fr.ready());
	}
}
