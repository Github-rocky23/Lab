import java.util.Scanner;
class Frequency
{
    public static void main(String[] args) 
    {
        int f=0;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        for(int i=0;i<s.length();i++)
        {
            c = s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(c==s.charAt(j))
                f++;
            }
            System.out.println(c +" : "+f);
        }
    }

}