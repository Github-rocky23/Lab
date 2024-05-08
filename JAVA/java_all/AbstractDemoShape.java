abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}
class AbstractDemoShape
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