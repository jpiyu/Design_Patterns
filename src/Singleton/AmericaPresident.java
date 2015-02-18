package Singleton;

public class AmericaPresident {
	private static AmericaPresident president;
	private AmericaPresident(){};
	public static AmericaPresident getPresident()
	{
		if(president == null)
		{
			president = new AmericaPresident();
		}
		return president;
	}
}
