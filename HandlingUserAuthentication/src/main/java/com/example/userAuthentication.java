package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class userAuthentication {
	
	
	public static  String auth(String un,String up) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	user u1=ac.getBean(user.class);
    	userdao dao1=ac.getBean(userdao.class);
        
		int i=0;
		String res = null;
        
        List<user> uu=dao1.getalluser();
        for(user usr:uu) {
        
        	if(usr.getUsername().equals(un) && usr.getPassword().equals(up)) {
        		i+=1;
        		res= "Authentication succesful";
        		
        	}
        	
        }
        if (i==0) {
    		res= "check credentials";
    	}
		return res;
		
	}
	
	
	public static void main( String[] args ) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	user u=ac.getBean(user.class);
        userdao dao=ac.getBean(userdao.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        String un=sc.next();
        u.setUsername(un);
        System.out.println("enter the password");
        String up=sc.next();
        u.setPassword(up);
      
        auth(un,up);
	}
}
