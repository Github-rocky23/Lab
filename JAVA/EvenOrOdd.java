class EvenOrOdd
{
    public static void main(String[] args)
    {
        if(Integer.parseInt(args[0])%2==0)
        {
            System.out.println(args[0]+" is even");
        }
        else
        {
            System.out.println(args[0]+" is odd");
        }
    }    
}
