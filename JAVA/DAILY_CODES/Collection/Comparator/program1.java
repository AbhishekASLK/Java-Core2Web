import java.util.*;

class Products {

	String pName;
	int activeUsers;

	Products(String pName, int activeUsers){
	
		this.pName=pName;
		this.activeUsers=activeUsers;
	}

	public String toString(){
		return pName+"("+activeUsers+" Cr)";
	}

}

class SortByUsers implements Comparator {

	public int compare(Object obj1, Object obj2){
		return (((Products)obj1).activeUsers)-(((Products)obj2).activeUsers);
	}
}

class Client {

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();

		al.add(new Products("GMail",10));
		al.add(new Products("GPay",15));
		al.add(new Products("GMeet",20));
		al.add(new Products("Youtube",35));
		al.add(new Products("GCloud",12));

		Collections.sort(al,new SortByUsers());
	
		System.out.println(al);
	}
}
