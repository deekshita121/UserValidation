package com.capg.uservalidation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	
	private boolean validate(String password) {
		return password.matches("(?=.*)[A-Z][a-zA-Z]{7,}");
	}
	
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
        LOG.info("Enter Password: ");
        String password = sc.nextLine();
        App app = new App();
        if(app.validate(password))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
    }
}
