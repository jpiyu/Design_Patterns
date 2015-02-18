package Singleton;

public class MainClass {
	public static void main(String[] args)
	{
		AmericaPresident president1 = AmericaPresident.getPresident();
		AmericaPresident president2 = AmericaPresident.getPresident();
		System.out.println("lets check the hashvalue of both of the objects -----");
		System.out.println(president1.hashCode());
		System.out.println(president2.hashCode());
		System.out.println("=========================");
		System.out.println("we can see that the hashvalues of both the objects are same .. so we can say that both the references are pointing to t"
				+ "he same object");
	}
}
