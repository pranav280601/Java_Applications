/*wap to break a number & reverse them by using while loop
input:123
output321
*/

import java.lang.*;
import java.util.*;

class Program17
{
	public static void main(String arg[])
	{
		int iNum =0, iRet = 0;

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number:");
		iNum = sobj.nextInt();

		Reverse robj = new Reverse();
		System.out.println("Reverse number is :"+robj.fun(iNum));

	}
}

class Reverse
{
	int iDigit,iRev;

	public Reverse()
	{
		//this.iNum = no;
		this.iDigit = 0;
		this.iRev = 0;
	}

	public int fun(int iNo)
	{
	while(iNo != 0)
	{
		this.iDigit = iNo % 10;

		this.iRev = ((this.iRev*10) + this.iDigit);

		iNo/=10;

	}	
	return this.iRev;
	}	
}