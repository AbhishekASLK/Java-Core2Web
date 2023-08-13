import java.util.*;

class Products {
	
	String name;

	Products(String name){
		this.name = name;
	}

	public String toString(){
		return "Product Name: "+name;
	}
}

class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add(new Products("Gmail"));
		al.add(new Products("Meet"));
		al.add(new Products("Chrome"));
		al.add(new Products("GPay"));

		System.out.println(al);

	}

}
