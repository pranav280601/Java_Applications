/*Programs on pattern printing
input:3
output:* # *
*/

import java.util.*;

 class Program28
 {
 	public static void main(String arg[])
 	{
 		int iNum = 0;

 		Scanner sobj = new Scanner(System.in);
 		
 		System.out.println("Enter number:");
 		iNum = sobj.nextInt();

 		Display obj = new Display();

 		obj.fun(iNum);

 	}	
 }

 class Display
 {
 	public void fun(int iNo)
 	{
 		int iCout = 0;
		for(int i = 1; i <= iNo; i++)
		{
			if(i%2 != 0)
			{
				System.out.print("*\t");
			}
			
			else
			{
				System.out.print("#\t");	
			}
		} 
	}
 }