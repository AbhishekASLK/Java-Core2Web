import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		int x = fr.read();
		while(x!=-1){
			System.out.print((char)x+" ");
			x=fr.read();
		}
		System.out.println();
	}
}
