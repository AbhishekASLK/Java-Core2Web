class Writer {

	String bookName = "Operating System - Unveiling the Core Principles";
	String authorName = "Shashi Bagal";
	int totalSoldCopies = 10;

	static String genre = "Education";
	
	void info() {
	
		System.out.println("Book Name: " + bookName + "\n");
		System.out.println("Author Name: " + authorName + "\n");
		System.out.println("Genre: " + genre + "\n"); 
		System.out.println("Sold: " + totalSoldCopies + " Crores Copies \n");
	}

	static void availability() {
	
		System.out.println("Available on: Amazon, Flipkart\n");
	}

}

class shashiBagal {

	public static void main(String[] args) {
	
		System.out.println(" ======================== Book Information ===================\n");
		Writer shashibagal = new Writer();
		shashibagal.info();
		Writer.availability();		
	}

}

