class Palindrome
{
	public static void main(String args[])
	{
		int r=0,l,palin;
		palin=Integer.parseInt(args[0]);
		int num=palin;
		while(num!=0)
		{
			l=num%10;
			r=(r*10)+l;
			num=num/10;
		}
		if(palin==r)
		System.out.println(r+" is a palindrome number");
		else
		System.out.println(r+" is not a palindrome number");
	}
}