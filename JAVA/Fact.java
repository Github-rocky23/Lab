class Fact
{
	public static void main(String args[])
	{
		int F=1,n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			F=F*i;
		}
		System.out.println("Factrioal of a given number : " + F);
	}
}