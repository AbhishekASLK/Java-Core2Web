import java.util.*;

class Products implements Comparable {

	String name;
	int id;

	Products(String name, int id){
		this.name=name;
		this.id=id;
		compareTo(this);
	}

	public int compareTo(Object o){
		return -(name.compareTo(((Products)o).name));
	}

	public String toString(){
		return name;
	}
}

class Client {

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();
		al.add(new Products("instagram",10));
		al.add(new Products("telegram",20));
		al.add(new Products("youtube",40));
		al.add(new Products("whatsapp",30));

		System.out.println(al);
	}
}
