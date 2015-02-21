package Factory;
import java.io.*;
public class MainClass {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HelperClass hc = new HelperClass();
		String str = br.readLine();
		Drawing dw = hc.getObject(str);
		dw.draw();
	}
}
