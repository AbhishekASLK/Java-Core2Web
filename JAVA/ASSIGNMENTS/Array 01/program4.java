import java.io.*;
class marvel {

	public static void main(String[] args) throws IOException{
	
		// WAP to take 7 character as input, print only vowels from the array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char arr[] = new char[7];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)(br.read());
			br.skip(1);
		}

		System.out.print("Vowels are: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
