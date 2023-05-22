class instagramAccount {

	// --------- Instance Variables --------

	String username;
	String password = "********";
	StringBuffer followers;

	// --------- Static Variable --------

	static String appName = "Instagram";
	

	// --------- Static Method --------

	static void reels(){
		System.out.println("Playing Reels \u25B6");
	}

	// --------- Instance Method --------

	void history(){
		System.out.println("Your history: ... \u2764 .....");
	}

	void watchFollowers(){
		System.out.println("Followers: "+followers+" \u2764");
	}

	public static void main(String[] args){
	
		// ---------- User 1 ---------------

		instagramAccount a1 = new instagramAccount();
		a1.username = "abhishekaslk";
		a1.followers = new StringBuffer("10M");

		// ---------- User 2 ---------------

		instagramAccount a2 = new instagramAccount();
		a2.username = "shashibagal";
		a2.followers = new StringBuffer("100M");

		// ---------- User 3 ---------------

		instagramAccount a3 = new instagramAccount();
		a3.username = "stevejobs";
		a3.followers = new StringBuffer("1000M");

		System.out.println("========== Account details ==============");

		System.out.println("Platform: "+ appName);
		System.out.println("Username: "+ a1.username);
		System.out.println("Password: "+ a1.password);

		System.out.println("========== Play Reel \u25B6  =============");

		reels();

		System.out.println("========== Watch History \uD83D\uDC41   =============");

		a1.history();

		System.out.println("========== Watch Followers \uD83D\uDC41   =============");

		a1.watchFollowers();


	
	}
}
