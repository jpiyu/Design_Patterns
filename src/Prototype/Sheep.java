package Prototype;

class Sheep implements Animal{
	
	Sheep()
	{
		System.out.println("sheep is made");
	}
	public Animal makeCopy() {
		// TODO Auto-generated method stub
		System.out.println("sheep is being made");
		Sheep object = null;
		try
		{
			object = (Sheep)super.clone();
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return object;
	}
	
	public String toString()
	{
		return "dolly was the first clone";
	}
}
