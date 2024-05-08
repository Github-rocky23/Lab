import java.util.Scanner;
class Class
{
    void upper(int x[][],int i,int j)
    {
        
        if(i==j || i>j)
        System.out.print("   ");
        else
        System.out.print(x[i][j]+"  ");
    }
    void lower(int x[][],int i,int j)
    {
        
        if(i==j || i<j)
        System.out.print("  ");
        else
        System.out.print(x[i][j]+"  ");
    }
}
class ArrTri
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Class obj = new Class();
        System.out.print("Enter size of array : ");
        int n =s.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<a.length;i++)
        for(int j=0;j<a.length;j++)
        a[i][j]=s.nextInt();
        System.out.println("Upper triangle : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                obj.upper(a,i, j);
            }
            System.out.println();
        } 
        System.out.println("Lower triangle : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                obj.lower(a,i, j);
            }
            System.out.println();
        } 
            
    }
}