/*Programs on pattern printing
input:5
output:1* 2* 3* 4* 5*
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
		int iCount = 1;

		for (int i = 1; i <=iNo ; ++i) 
		{
			System.out.print(iCount+"*\t");
			iCount++;	
		}
	}
}