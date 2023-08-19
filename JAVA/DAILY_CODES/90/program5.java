import java.util.*;
import java.io.*;

class PropertiesDemo {

	public static void main(String[] args) throws IOException {
	
		Properties p = new Properties();

		FileInputStream fir = new FileInputStream("friends.properties");
		p.load(fir);

		System.out.println(p);

		p.put("Prajwal","Google");

		FileOutputStream fos = new FileOutputStream("friends.properties");
		p.store(fos,"Updated by AbhishekASLK");
		
		System.out.println(p);
		
	}
}
