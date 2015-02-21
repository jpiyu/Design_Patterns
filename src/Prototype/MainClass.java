package Prototype;

public class MainClass {
	public static void main(String[] args)
	{
		Animal a1 = new Sheep();
		Animal clone;
		CloneFactory cf = new CloneFactory();
		clone = (Sheep)cf.getClone(a1);
		
		System.out.println(a1);
		System.out.println(clone);
	}
}
