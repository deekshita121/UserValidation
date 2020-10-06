package com.capg.uservalidation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	
	private boolean validate(String emailId) {
		return emailId.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9-_.]+$");
	}
	
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
        LOG.info("Enter Email Id of user: ");
        String emailId = sc.nextLine();
        App app = new App();
        if(app.validate(emailId))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
    }
}
