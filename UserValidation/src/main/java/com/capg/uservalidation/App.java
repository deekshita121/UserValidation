package com.capg.uservalidation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	
	public boolean validateFirstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}");
	}
	
	public boolean validateLastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}");
	}

	
	public boolean validatePhoneNum(String phoneNum) {
		return phoneNum.matches("[91]{2}\\s[6-9]{1}[0-9]{9}$");
	}
	
	public boolean validateEmailId(String emailId) {
		return emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zAZ0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	}
	
	public boolean validatePassword(String password) {
		return password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@%$&*_.?])[A-Za-z0-9!@$%&*_?.]{8,}$");
	}
	
	
	
	
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
        App app = new App();
        
        LOG.info("Enter First Name: ");
        String firstName = sc.nextLine();
        if(app.validateFirstName(firstName))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
        
        LOG.info("Enter Last Name: ");
        String lastName = sc.nextLine();
        if(app.validateLastName(lastName))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
        LOG.info("Enter EmailId: ");
        String emailId = sc.nextLine();
        if(app.validateEmailId(emailId))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
        LOG.info("Enter Phone Number: ");
        String phoneNum = sc.nextLine();
        if(app.validatePhoneNum(phoneNum))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
        LOG.info("Enter password: ");
        String password = sc.nextLine();
        if(app.validatePassword(password))
        {
       	 LOG.info("Valid");
        }
        else
        {
       	 LOG.info("Invalid");
        }
        
        
       	 
        
    }
}
