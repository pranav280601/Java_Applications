/*Programs on pattern printing
input:5
output:* * * * *
*/

import java.util.*;

class Program25
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iNum = 0;

		System.out.println("Enter the number :");
		iNum = sobj.nextInt();

		Display obj = new Display();
		obj.fun(iNum);
	}
}

class Display
{
	public void fun(int iNo)
	{
		for (int i = 0; i < iNo ; i++) 
		{
			System.out.print("*\t");	
		}
	}
}