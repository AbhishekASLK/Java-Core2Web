import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		PrintWriter out = new PrintWriter("abc.txt");

		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("Abhi");
		out.flush();
		out.close();
		out.println("A");
		out.flush();
	}
}
