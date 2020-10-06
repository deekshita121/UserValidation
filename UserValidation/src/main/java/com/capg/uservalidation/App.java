package com.capg.uservalidation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	
	private boolean validate(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
        LOG.info("Enter Last Name of user: ");
        String lastName = sc.nextLine();
        App app = new App();
        if(app.validate(lastName))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
    }
}
