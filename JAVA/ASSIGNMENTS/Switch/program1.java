import java.util.*;
class marvel {

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter marks of Subject-1: ");
		double s1 = obj.nextInt();			
		
		System.out.println("Enter marks of Subject-2: ");
		double s2 = obj.nextInt();
		
		System.out.println("Enter marks of Subject-3: ");
		double s3 = obj.nextInt();
			
		System.out.println("Enter marks of Subject-4: ");
		double s4 = obj.nextInt();
		
		System.out.println("Enter marks of Subject-5: ");
		double s5 = obj.nextInt();
		
		if(s1<40 || s2<40 || s3<40 || s4<40 || s5<40)
			System.out.println("You failed in exam!");
		else{
			double d = ((s1+s2+s3+s4+s5)/500)*100;
			int per=(int)d;
			switch(per/10){				
				case 10:
				case 9:
					System.out.println("You got an Grade: 'O' ");
					break;
				case 8:
				case 7:
					System.out.println("You got an Grade: 'A' ");
					break;
				case 6:
				case 5:
					System.out.println("You got an Grade: 'B' ");
					break;
				case 4:
				case 3:
					System.out.println("You got an Grade: 'C' ");
					break;

			}
		}
			
			
			
	}
}
