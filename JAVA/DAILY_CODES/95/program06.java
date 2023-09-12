import java.io.*;

class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fis = new FileInputStream("PlayerData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Player p1 = (Player)ois.readObject();
		Player p2 = (Player)ois.readObject();

		ois.close();
		fis.close();

		System.out.println("jerNo: "+ p1.jerNo);
		System.out.println("Name: "+ p1.pName);
		
		System.out.println("jerNo: "+ p2.jerNo);
		System.out.println("Name: "+ p2.pName);
	}
}
