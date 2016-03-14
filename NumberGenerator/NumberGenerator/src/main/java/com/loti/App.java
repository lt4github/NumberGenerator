package com.loti;


import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	        App obj = new App();
	        System.out.println("Unique ID : " + obj.generateUniqueKey());
	        System.out.println("change on local branch 03/14/2016");
	    }
	    
	    public String generateUniqueKey(){
	    	
	    	String id = UUID.randomUUID().toString();
	    	return id;
	    	
	    }
}
