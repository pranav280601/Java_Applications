/*Programs on pattern printing
input:5
output:2 4 6 8 10
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
			System.out.print((2*i)+"\t");
		} 
	}
 }