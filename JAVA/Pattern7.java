class Pattern7
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
        int t=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(t+" ");
                t++;
			}
				System.out.println();
		}
	}
}