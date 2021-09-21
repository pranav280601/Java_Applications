/*wap to take negative number & show reverse in negative mo. without using updater by using while loop
input:-213
output-312
*/

import java.util.*;
import java.lang.*;

class Program19
{
	public static void main(String arg[])
	{
		int iNum = 0;

		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		iNum = sobj.nextInt();

		Reverse obj = new Reverse();
		
		System.out.println("Reverse number is :"+obj.fun(iNum)); 
		
	}


}

class Reverse
{

	public int iDigit,iRev;

	public Reverse()
	{
		this.iDigit = 0;
		this.iRev = 0;
	}

	public int fun(int ino)
	{
	while(ino != 0)
	{
		this.iDigit = ino%10;

		this.iRev = ((this.iRev*10) + this.iDigit);

		ino/=10;
	}

	return this.iRev;	
	}	
	
}

