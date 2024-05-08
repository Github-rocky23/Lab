import java.util.Scanner;
class TwoDArray
{
	int a[][],m,n;
	TwoDArray(int m1,int n1)
	{	
		m=m1;n=n1;
		Scanner sc=new Scanner(System.in);
		a=new int[m][n];
		System.out.println("enter numbers");
		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
	}
	void display()
	{
		System.out.println("The numbers are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
class Array2d
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int m=sc.nextInt();
		System.out.println("enter number of columns");
		int n=sc.nextInt();
		TwoDArray t=new TwoDArray(m,n);
		t.display();
	}
}
	