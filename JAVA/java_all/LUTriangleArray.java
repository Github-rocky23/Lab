import java.util.Scanner;
class LUTriangleArray 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the square matrix:");
        int matrix[][] = new int[size][size];
        for(int i=0;i<size;i++) 
        {
            for(int j=0;j<size;j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Displaying upper triangle
        System.out.println("Upper triangle is:");
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Displaying lower triangle
        System.out.println("Lower triangle is:");
        for(int i=1;i<size;i++) 
        {
            for(int j=0;j<i;j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
      }
}
