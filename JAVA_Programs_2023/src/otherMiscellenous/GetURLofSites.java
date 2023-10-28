package otherMiscellenous;

import java.net.InetAddress;
import java.net.URL;

public class GetURLofSites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	/*
	URL URL= new URL("https://google.com");
	
	System.out.println("Protocol "+URL.getProtocol());
	System.out.println("HostName "+URL.getHost());
	System.out.println("Port Number "+URL.getPort());
	System.out.println("FileName "+URL.getFile());
	
	
	*/
	InetAddress ip=InetAddress.getByName("www.Technolamror.com");
	
	System.out.println("Host Name "+ip.getHostName());
	System.out.println("IP Address"+ip.getHostAddress());
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e.getMessage());
}
		
		
	}

}
