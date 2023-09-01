
import java.io.*;

class Test {

	public static void main(String[] args){
	
		File f = new File("../");
		
		String[] str = f.list();

		for(String s: str){
			System.out.println(s);
		}
	}
}
