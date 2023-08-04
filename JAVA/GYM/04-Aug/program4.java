class Client {

	Client(int i){
		
	}

	public static void main(String[] args){
	
		Client[] arr = new Client[5];

		for(int i=0;i<5;i++){
			arr[i] = new Client(i);
		}

		for(Client x:arr)
			System.out.println(x);
	}
}
