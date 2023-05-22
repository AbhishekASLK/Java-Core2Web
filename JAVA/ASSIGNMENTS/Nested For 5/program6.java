import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch1 =(char) br.read();
		br.skip(1);
		char ch2 =(char) br.read();
		
		if(ch1==ch2)
			System.out.println(ch1+" "+ch2);
		else
			System.out.println(ch2-ch1);

		// Take two characters if these characters are equal then print them as it is but if they are unequal then print their difference.
		// Input:: a p
		// Output:: 15
	}
}
