import java.io.*;

class Player implements Serializable {

	int jerNo;
	String pName;

	Player(int jerNo, String pName){
		
		this.jerNo=jerNo;
		this.pName=pName;
	}
}

class Test {

	public static void main(String[] args) throws IOException {
	
		Player p1 = new Player(1,"KL Rahul");
		Player p2 = new Player(18,"Virat Kohli");

		FileOutputStream fos = new FileOutputStream("PlayerData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);

		oos.close();
		fos.close();
	}
}
