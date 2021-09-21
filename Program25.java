/*Find out power of number taking input from user
input :x=3,y=2
Output=9(3^2)
*/

import java.util.*;

class Program25
{
	public static void main(String arg[])
	{
		int iX = 0;
		int iY = 0;

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number:");
		iX = sobj.nextInt();


		System.out.println("Enter the power of that number:");
		iY = sobj.nextInt();

		Power obj = new Power(iX);

		System.out.println("Result is: "+obj.fun(iX,iY));

	}

}

class Power
{
	public int iPow;

	public Power(int a)
	{
		this.iPow = a;
	}

	public int fun(int j, int k)
	{
		int i = 0;

	if(j == 0)
	{
		return 0;
	}

	if(k == 0)
	{
		return 1;
	}

	for(i = 1; i < k; i++)
	{
		iPow = iPow * j;
	}

	return  iPow; 
}


}

