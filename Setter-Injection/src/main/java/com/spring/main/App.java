package com.spring.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.beans.WishMessageGenerator;

public class App 
{
    public static void main( String[] args )
    {
        // Get Xml Configuration file  	
    	FileSystemResource res= new FileSystemResource("src/main/java/com/spring/cfg/applicationContext.xml");
    	// Activate IOC Container
    	XmlBeanFactory factory= new XmlBeanFactory(res);
    	// get object of bean class
    	 Object obj=factory.getBean("wmg");
    	 //convert object type into sub type (WishMess...)
    	 WishMessageGenerator generator= (WishMessageGenerator) obj;
    	 // invoke b.logic methods
    	 String msg= generator.wishMsg("   Narendra ");
    	 // Display the Result
    	 System.out.println(msg);
    }
}
