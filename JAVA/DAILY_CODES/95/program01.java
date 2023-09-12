import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("Incubator.txt");
		fw.write("Flutter");
		fw.write("Backend");
		fw.write("Frontend");

		fw.close();
	}
}
