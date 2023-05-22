import java.util.*;
class marvel {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Select product type: \n 1. Electronics \n 2. Clothing ");
		int productType= sc.nextInt();

		switch(productType){
			case 1:
				{	
					System.out.println("Choose product: \n 1. Headphones\n 2. Mobiles\n Choose option 1 or 2");
					int item= sc.nextInt();
					switch(item){
						case 1:
							System.out.println("======== You Purchased BOAT ==========");
							break;
						case 2:
							System.out.println("=========You Purchased iPhone ========");
							break;
					}
				}
				break;
			case 2:
				{
					System.out.println("Choose product: \n 1. Tshirt\n 2. Pants\n Choose option 1 or 2");
					int item= sc.nextInt();
					switch(item){
						
						case 1:
							System.out.println("======== You Purchased Calvin ===========");
							break;
						case 2:
							System.out.println("======== You Purchased Nike =============");
							break;
					}
				}
				break;
		}
	}
}
