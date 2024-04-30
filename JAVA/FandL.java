import java.util.Scanner ;
class FandL
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        System.out.println("First Character : "+s.charAt(0));
        //System.out.println(s.length());
        System.out.println("Last Character : "+s.charAt((s.length()-1)));
    }
}