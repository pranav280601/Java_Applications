/*wap and check whether that number is palindrome or not
input:-213
output-NOT PALINDROME(0)
input:-232
output-PALINDROME(1)
*/

import java.util.*;
import java.lang.*;

class Program20
{
	public static void main(String arg[])
	{
		int iNum = 0;

		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		iNum = sobj.nextInt();

		Palindrome obj = new Palindrome();
			
		Boolean iRet = false;
				
		iRet = obj.fun(iNum);
		
		if(iRet == true)
		{
			System.out.println("PALINDROME");	
		}

		else
		{
			System.out.println("NOT PALINDROME");	
		}	 		
	}

}

class Palindrome
{

	public int iDigit,iRev;

	public Palindrome()
	{
		this.iDigit = 0;
		this.iRev = 0;
	}

	public Boolean fun(int ino)
	{
		int no2 = ino;
		while(ino != 0)
		{
			this.iDigit = ino%10;

			this.iRev = ((this.iRev*10) + this.iDigit);

			ino/=10;
		}

		if(no2 == iRev)
		{
			return true;
		}

		else
		{
			return false;
		}

	}	
	
}

