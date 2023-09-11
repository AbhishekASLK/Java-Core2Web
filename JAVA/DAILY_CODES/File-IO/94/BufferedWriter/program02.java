import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("sample.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("abhi");
		bw.newLine();
		bw.write("Core2web Tech");
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
