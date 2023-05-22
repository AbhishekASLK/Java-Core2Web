class spotifyApp {

	int totalSongsCount = 10000;
	int totalArtists = 150;
	String category = "Love";
	String artist = "Arijit Singh";
	String language = "Hindi";
	String favoriteSong = "Kahani Suno 2.0";

	void premium(){
		System.out.println("----- You purchased premium membership \uD83D\uDCB0  ----- ");
	}

	void charts(){
		// Ranking changes frequently so it is an method
		System.out.println("1. Kahani Suno 2.0\n2. Phir Kabhi\n3. Kaun Tujhe \n4. Khaab");
	}

	void play(){
		System.out.println("Playing: \u25B6  "+ favoriteSong + " \u2764\ufe0f");
	}

	public static void main(String[] args) {
	

		System.out.println("=============== Spotify ==============");
		System.out.println();

		spotifyApp u1 = new spotifyApp();

		System.out.println("Number of songs available: "+ u1.totalSongsCount);
		System.out.println("Number of artists: "+ u1.totalArtists);
		System.out.println("Your selected category: "+ u1.category);
		System.out.println("Favorite Artist: "+ u1.artist);

		System.out.println();

		u1.premium();

		System.out.println();

		System.out.println("Charts: ");

		u1.charts();

		System.out.println();

		u1.play();

		System.out.println();

	}

}
