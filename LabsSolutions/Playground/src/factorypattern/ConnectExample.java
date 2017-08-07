package factorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ConnectExample {
	public static void main(String[] args) throws IOException {
		URL oracle = new URL("https://www.facebook.com/");
		URLConnection urlConn = oracle.openConnection();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
		
		String inputLine;
		
		while((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		
		System.out.println(inputLine);
		
		in.close();
		
	}
}
