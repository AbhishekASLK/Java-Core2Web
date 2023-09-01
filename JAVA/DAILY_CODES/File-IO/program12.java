// Java program to demonstrate the working
// of compareTo() method of File class

import java.io.File;

class Test
{
	public static void main(String[] args)
	{
		File f1 = new File("c:\\GEEKSFORGEEKS\\GfgA.txt");
		File f2 = new File("c:\\GEEKSFORGEEKS\\Gfga.txt");

		int value = f1.compareTo(f2);
		System.out.println(value);
		if (value == 0)
		{
			System.out.println("Both files are equal");
		}
		else if (value > 0)
		{
			System.out.println(" Gfg1 is greater than Gfg2");
		}
		else
		{
			System.out.println(" Gfg2 is greater than Gfg1");
		}
	}
}

