import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FRQ5two {

	



	public String getHostName(String hostName){
		System.out.println(hostName);
		return hostName;
	}

	public String getAddress(String address) { 
		System.out.println(address); 
		return address;
	}

	public String getName(String userName) { 
		System.out.println(userName); 
		return userName;

	}

	public int getAge(int age) {
		System.out.println(age); 
		return age;
	}


	public String setAddress(String address)
	{
		System.out.println("The address has been set to: " + address);
		return address;
	}

	public String invite(String me, String address, String hostName)
	{
		System.out.println("Dear "+me+", please attend my event at "+address+". See you then, "+hostName+ ".");

		return me; 
	}

	


}

