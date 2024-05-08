abstract class Bank
{
	abstract float getRateOfInterest();
}
class SBI extends Bank
{
	float r=7.8f;
	float getRateOfInterest()
	{
		return r;
	}
}
class Axis extends Bank
{
	float r=9.2f;
	float getRateOfInterest()
	{
		return r;
	}
}
class AbstarctDemoBank
{
	public static void main(String args[])
	{
		Bank b;
		b=new SBI();
		System.out.println("SBI Interest Rate: " + b.getRateOfInterest());
		b = new Axis();
        	System.out.println("Axis Interest Rate: " + b.getRateOfInterest());	
	}
}