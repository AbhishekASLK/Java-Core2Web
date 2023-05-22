class gitUsers {

	int totalLocalRepo = 10;  // instance variable
       	static int totalRemoteRepo = 20; // static variable

	void gitStatus(){
		
		System.out.println("totalLocalRepo :"+totalLocalRepo);
		System.out.println("totalRemoteRepo :"+totalRemoteRepo);

	}

	public static void main(String[] args){
	
		gitUsers u1 = new gitUsers();
		gitUsers u2 = new gitUsers();
		
		u1.gitStatus();
		u2.gitStatus();
	
		u2.totalLocalRepo = 20;
		u2.totalRemoteRepo = 500;

		u1.gitStatus();
		u2.gitStatus();
	
	
	}	
}
