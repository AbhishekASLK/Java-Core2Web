// 16] Last index of One

// Given a string S consisting only '0's and '1's, find the last index of the '1' present in
// it.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(new Provojax().lastIndexOfOne(s));
	}

    int lastIndexOfOne(String s){

        char[] ch = s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='1')
                return i;
        }

        return -1;
    }

}
