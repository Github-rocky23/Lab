import java.util.Scanner;
class Array2dForEach
{
	public static void main(String args[])
	{
		int i,j;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows of matrix");
		int m=sc.nextInt();
		System.out.println("Enter number of columns of matrix");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter elements of matrix");
		for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();

		for(int[] k:a)
		{
			for(int val:k)
				System.out.print(val+" ");
			System.out.println();
		}

	}
}