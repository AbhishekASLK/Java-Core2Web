
import java.io.*;

class Test {

	public static void main(String[] args){
		
		File f = new File("/home/abhishekaslk/Desktop/PROJECTS/Core2Web/Java/Java-Core2Web/JAVA/DAILY_CODES/File-IO");
		//System.out.print(f.exists());

		String[] str = f.list();

		int count=0;

		for(String s: str){
			File f2 = new File(s);
			if(f2.isFile())
				count++;
			//count++;
			//System.out.println(s);	
		}
		System.out.println(count);
	}
}
