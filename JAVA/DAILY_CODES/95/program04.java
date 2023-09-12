import java.io.*;

class FileReaderDemo {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("Incubator.txt");
		FileDescriptor fd = fis.getFD();

		FileReader fr = new FileReader(fd);

		int data = fr.read();

		while(data != -1){
			System.out.println((char)data);
			data = fr.read();
		}

		fr.close();
	}
}
