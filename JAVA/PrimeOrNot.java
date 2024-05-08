class PrimeOrNot
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int prime=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				prime++;
				break;
			}
		}
		if(num!=1 && prime==0)
			System.out.println(num +" is a prime number");
		else
			System.out.println(num +" is not a prime number");
	}
}