import java.io.*;
class StringDemo {

	
	// ================ Anagram Strings ================
	

	void checkAnagramStrings(String str1, String str2) {
	
		str1 = str1.toLowerCase();  // race
		str2 = str2.toLowerCase();  // care

		if(str1.length()!=str2.length()){
				System.out.println("Not an Anagram Strings");
				return;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		int n = arr1.length;

		for(int i=0;i<n;i++){
			boolean b = false;
			for(int j=0;j<n;j++){

				if(arr1[i]==arr2[j]){
					b=true;
					arr2[j]='*';
					break;
				}
					
			}

			if(b==false){
				System.out.println("Not an Anagram Strings");
				return;
			}
			
		}

		System.out.println("Anagram Strings");

	}


	// ================ Palindrome ================
	

	static void checkPalindromeString(String str){
	
		StringBuffer sb = new StringBuffer(str);
		String temp = sb.reverse().toString();
		if(temp.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println(" ============== Check Palindrome Strings ========== ");
		System.out.println("Enter the String: ");	
		String str1 = br.readLine();
		
		System.out.print(str1+": ");
		checkPalindromeString(str1);



		System.out.println(" ============== Check Anagram Strings ========== ");
		System.out.println("Enter two strings: ");
		String str2 = br.readLine();
		String str3 = br.readLine();

		StringDemo sd = new StringDemo();
		System.out.print(str2+" and "+str3+" are: ");
		sd.checkAnagramStrings(str2,str3);

	}
}
