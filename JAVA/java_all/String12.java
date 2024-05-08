import java.util.*;
class String12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        // Splitting the string based on whitespace
        String[] s1 = str.split("\\s");
        System.out.println("After splitting :");
	for(int i=0;i<s1.length;i++)
		System.out.println(s1[i]);	
    }
}
