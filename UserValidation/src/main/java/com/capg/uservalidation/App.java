package com.capg.uservalidation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	
	private boolean validate(String phoneNum) {
		return phoneNum.matches("^[91]{2}\\s[6-9]{1}[0-9]{9}$");
	}
	
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
        LOG.info("Enter Phone number of user: ");
        String phoneNum = sc.nextLine();
        App app = new App();
        if(app.validate(phoneNum))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
    }
}
