
import java.util.*;

class Products implements Comparable {

	String pName;
	int activeUsers;

	Products(String pName, int activeUsers){
		this.pName = pName;
		this.activeUsers = activeUsers;
	}

	public int compareTo(Object obj){
		return -(activeUsers-((Products)obj).activeUsers);
	}	
	
	public String toString(){
		return pName+"("+activeUsers+" Cr)";
	}	

}

class Client {

	public static void main(String[] args){
	
		TreeSet t = new TreeSet();
		
		t.add(new Products("Instagram",85));
		t.add(new Products("Linkedin",75));
		t.add(new Products("Facebook",60));
		t.add(new Products("Whatsapp",50));

		System.out.println(t);
	}
}
