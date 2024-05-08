class Fib
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int a=0,b=1;
		if(n==0)
			System.out.print("Please give morethan 0 value ");
		else if(n==1)
			System.out.print(" 0 ");
		else if(n==2)
			System.out.print(" 0 1 ");
		else
		{
			System.out.print(" 0 1 ");
			while(n>2)
			{
				int c=a+b;
				System.out.print(c +" ");
				a=b;
				b=c;
				n--;
			}
		}
	}
}