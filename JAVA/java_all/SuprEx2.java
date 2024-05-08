//Invoking parameterised constructor of parent class in a parameterised constructor of child class
class A
{
	int i,j;
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
class B extends A
{
	int k,l;
	B(int i,int j,int k,int l)
	{
		super(i,j);
		this.k=k;
		this.l=l;
	}
	void display()
	{
		System.out.println("The value of i is : "+" "+i);
		System.out.println("The value of j is : "+" "+j);
		System.out.println("The value of k is : "+" "+k);
		System.out.println("The value of l is : "+" "+l);
	}
}
class SuprEx2
{
	public static void main(String args[])
	{
		new B(10,20,30,40).display();
	}
}
		