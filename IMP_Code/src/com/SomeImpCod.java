package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class SomeImpCod 
{
	public static void main(String[] args) throws IOException
	{
		
		//*********************property file read**************************************************
		
		InputStream is = SomeImpCod.class.getResourceAsStream("/Properties/config123.properties");
		if(is != null) 
		{
		    Properties adminProps = new Properties();
		    adminProps.load(is);
		    System.out.println("heoo");
		    System.out.println(adminProps.getProperty("username"));
		
		}
		
		//******************************************************************************************
		
		//******************************retrive data from list of list******************************
		
		/*List list=new ArrayList();
		List l1=new ArrayList();
		List l2=new ArrayList();
		
		l1.add("avinash");
		l1.add(21);
		
		l2.add("sanjay");
		l2.add(35);
		
		list.add(l1);
		list.add("mahesh pawar");
		list.add(l2);
		list.add("santosh");
		
		
		System.out.println(list);
		System.out.println(((List) list.get(0)).get(0));*/
		
		//*************************************System data read from java****************************************
		
	   /*System.out.println(System.getProperty("user.name"));
		 System.out.println(System.getenv().get("USERDOMAIN"));
		 System.out.println(System.getenv().get("USERNAME"));*/
		
		/* try {
	            InetAddress address = InetAddress.getLocalHost();
	            System.out.println("Using InetAddress");
	            System.out.println("Host Address: "+ address.getHostAddress());
	            System.out.println("Host Name: "+ address.getHostName());
	            System.out.println("CanonicalHostName: "+ address.getCanonicalHostName());
	            System.out.println("Address: "+ address.getAddress());
	            System.out.println("LocalHost: "+ address.getLocalHost());
	            System.out.println("LoopbackAddress: "+ address.getLoopbackAddress());
	            System.out.println(address.getLoopbackAddress());
	             System.out.println(address.hashCode());
	            String os = "os.name";
	            String version = "os.version";
	            String arch = "os.arch";
	            System.out.println("Name of the OS: "+ System.getProperty(os));
	            System.out.println("Version of the OS: "+ System.getProperty(version));
	            System.out.println("Architecture of the OS: "+ System.getProperty(arch));
	        }
		 catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
		*/
		
		//***********************************cmd command read code*****************************************
			
			/*ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "whoami");
	        builder.redirectErrorStream(true);
	        Process p = builder.start();
	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line=r.readLine();
	       String str= line.replaceAll("[^0-9]", "");
	       int no=Integer.parseInt(str);
	        System.out.println(no);*/
		
		String no=System.getProperty("user.name");
		System.out.println(no);
		//String userName = new com.sun.security.auth.module.NTSystem().getName();
		
	}
}
