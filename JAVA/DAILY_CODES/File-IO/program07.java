
import java.io.*;

class Test {

	public static void main(String[] args)throws IOException{
	
		File f = new File("folder22","aslk2.txt");
		//f.mkdir();
		f.createNewFile();
		System.out.println(f.getParent());
	}
}
