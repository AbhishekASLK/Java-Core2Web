import java.util.*;

class BlockChain {

	String block;

	BlockChain(String block){
		this.block=block;
	}

	public String toString(){
		return "Block: "+block;
	}
}

class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		
		ll.add(new BlockChain("#8564"));
		ll.add(new BlockChain("#4786"));
		ll.add(new BlockChain("#1248"));
		ll.add(new BlockChain("#9873"));

		System.out.println(ll);
	}
}
