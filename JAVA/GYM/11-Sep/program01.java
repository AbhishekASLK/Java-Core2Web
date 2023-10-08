// File Class Methods

import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("Core2Web");

		// f1.exists();
		System.out.println(f1.exists());

		// f1.createNewFile();
		f1.createNewFile();

		// f2.mkdir();
		File f2 = new File("Biencaps");
		f2.mkdir();

		// f1.isFile();
		f1.isFile();

		// f2.isDirectory();
		f2.isDirectory();

		// f3.list();
		File f3 = new File("/home");
		String[] arr = f3.list();	

		for(String str : arr){
			System.out.println(str);
		}
		
		// f1.length();
		System.out.println(f1.length()); // In case of file, it returns total characters

		// f2.length();
		System.out.println(f2.length()); // In case of dir, it returns the block size of dir

		// equals(Obj) It checks the path of the files or filder
		File f4 = new File("A.txt");
		File f5 = new File("B.txt");

		System.out.println(f4.equals(f5));

		// f6.mkdirs();
		File f6 = new File("marvel","blackWidow");
		f6.mkdirs();
		
		// f7.mkdir();
		File f7 = new File("DC","Superman");
		f7.mkdir();
	}
}
