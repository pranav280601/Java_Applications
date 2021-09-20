/*check whether number is perfect or not bt writing only 2 functions
input:6
output:Number is perfect
input:16
output:Number is not perfect
*/

import java.util.*;
import java.lang.*;


class Program22
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int iNum = 0;
		Boolean iRet = false;

		System.out.println("Enter the number:");
		iNum = sobj.nextInt();

		CheckPerfect obj =  new CheckPerfect();

		iRet = obj.fun(iNum);

		if(iRet == true)
		{
			System.out.println("Number is Perfect");
		}

		else
		{
			System.out.println("number is not Perfect");
		}

	}

}

class CheckPerfect
{

	public int i, iSum;

	public CheckPerfect()
	{
		this.i = 1;
		this.iSum = 0;
	}

	public Boolean fun(int iNo)
	{

	for(i = 1; i <= (iNo/2); i++)
	{
		if(iNo%i == 0)
		{
			iSum = iSum+i;
		}
	} 

	if(iSum == iNo)
	{
		return true;
	}
	else 
	{
		return false;
	}

	}

}	
