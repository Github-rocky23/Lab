interface Shape
{
	void draw();
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
class InterfaceDemo1
{
	public static void main(String args[])
	{
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Circle();
		s.draw();
	}
}