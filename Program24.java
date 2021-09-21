//Display table by taking input from user

import java.util.*;
import java.lang.*;


class Program22
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iNum = 0;
		
		System.out.println("Enter the number:");
		iNum = sobj.nextInt();

		DisplayTable obj =  new DisplayTable();

		obj.fun(iNum);
	}

}

class DisplayTable
{

	public int i;

	public DisplayTable()
	{
		this.i = 1;
	}

	public void fun(int iNo)
	{

	for(i = 1; i <= 10; i++)
	{
		System.out.println("Table is : "+(i*iNo));
	}
	} 

}	