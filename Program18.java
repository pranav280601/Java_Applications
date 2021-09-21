/*wap to break a number & count odd digits from that number and add them by using while loop
input:213
output:4(1+3)
*/
import java.util.*;
import java.lang.*;

class Program18
{
	public static void main(String arg[])
	{
		int iNum = 0;

		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		iNum = sobj.nextInt();

		OddCount obj = new OddCount();
		
		System.out.println("Count is :"+obj.fun(iNum)); 
		
	}


}

class OddCount
{

	public int iDigit,iCount;

	public OddCount()
	{
		this.iDigit = 0;
		this.iCount = 0;
	}

	public int fun(int ino)
	{

		while(ino != 0)
		{
		this.iDigit = ino%10;

		if(this.iDigit%2 != 0)
		{
			this.iCount++;
		}

		ino/=10;
		
		}

	return this.iCount;
	
	}
}
