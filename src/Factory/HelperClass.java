package Factory;

public class HelperClass {
	
	public Drawing getObject(String str)
	{
		if(str.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(str.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		else if(str.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;	
	}
}
