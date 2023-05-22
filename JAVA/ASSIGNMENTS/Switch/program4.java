import java.util.*;
class marvel {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your interest? \n 1. Movies \n 2. Series \n Enter your choice ");
		int x = sc.nextInt();
		switch(x){
			case 1:
				System.out.println("Available Movies: \n 1. Founder \n 2. Snowden \n 3. Jobs \n 4. Social Network");
				System.out.println("Enter your choice: ");
				int y = sc.nextInt();
				switch(y){
					case 1:
						System.out.println("=========== Playing Founder..........==========");
						break;
					case 2:
						System.out.println("=========== Playing Snowden..........==========");
						break;
					case 3:
						System.out.println("=========== Playing Jobs..........==========");
						break;
					case 4:
						System.out.println("=========== Playing Social Network..........==========");
						break;
					default:
						System.out.println("Invalid Choice");
				}
				break;
			case 2:
				System.out.println("Available Series: \n 1. TVF PITCHERS \n 2. THE PROFIT \n 3. SILICON VALLEY \n 4. STARTUP");
				System.out.println("Enter your choice: ");
				int z = sc.nextInt();
				switch(z){
					case 1:
						System.out.println("=========== Playing TVF PITCHERS..........==========");
						break;
					case 2:
						System.out.println("=========== Playing THE PROFIT..........==========");
						break;
					case 3:
						System.out.println("=========== Playing SILICON VALLEY..........==========");
						break;
					case 4:
						System.out.println("=========== Playing STARTUP..........==========");
						break;
					default:
						System.out.println("Invalid Choice");
				}
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}
