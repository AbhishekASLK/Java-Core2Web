import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		File f = new File("abc.txt");
		char[] ch = new char[(int)f.length()];

		FileReader fr = new FileReader(f);
		fr.read(ch);

		for(char c:ch){
			System.out.print(c+" ");
		}
	}
}
