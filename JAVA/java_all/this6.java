class A 
{
    B B1;

    A(B B1)
    {
        this.B1 = B1;
    }

    void display() 
    {
        System.out.println("The value of b is : " + B1.b);
    }
}

class B 
{
    int b = 10;
    B() 
    {
        A A1 = new A(this);
        A1.display();
    }
}

public class this6
{
    public static void main(String args[]) 
    {
        new B();
    }
}
