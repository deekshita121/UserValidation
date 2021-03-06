package com.capg.uservalidation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface UserValidator {
	boolean validate(String input);
}

public class UserValidation 
{
	private static final Logger LOG = LogManager.getLogger(UserValidation.class);
	UserValidator validateFirstName = (firstName)->firstName.matches("^[A-Z]{1}[a-z]{2,}");
	UserValidator validateLastName = (lastName)->lastName.matches("^[A-Z]{1}[a-z]{2,}");
	UserValidator validatePhoneNum = (phoneNum)->phoneNum.matches("[91]{2}\\s[6-9]{1}[0-9]{9}$");
	UserValidator validateEmailId = (emailId)->emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	UserValidator validatePassword = (password)->password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@%$&*_.?])[A-Za-z0-9!@$%&*_?.]{8,}$");
	
	public boolean validateFirstName(String firstName) throws UserValidationException{
		if(validateFirstName.validate(firstName))
			return true;
		else
			throw new UserValidationException("Invalid First Name");
			
	}
	
	public boolean validateLastName(String lastName) throws UserValidationException {
		if(validateLastName.validate(lastName))
			return true;
		else
			throw new UserValidationException("Invalid Last Name");
	}

	
	public boolean validatePhoneNum(String phoneNum) throws UserValidationException{
		if(validatePhoneNum.validate(phoneNum))
			return true;
		else
			throw new UserValidationException("Invalid Phone number");
	}
	
	public boolean validateEmailId(String emailId) throws UserValidationException {
		if(validateEmailId.validate(emailId))
			return true;
		else
			throw new UserValidationException("Invlid Email");
	}
	
	public boolean validatePassword(String password) throws UserValidationException{
		if(validatePassword.validate(password))
			return true;
		else
			throw new UserValidationException("Inavlid Password");
	}
	
	
	
	
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
        UserValidation userValidation = new UserValidation();
        
        LOG.info("Enter First Name: ");
        String firstName = sc.nextLine();
        try
        {
           if(userValidation.validateFirstName(firstName))
           {
              LOG.info("Valid");
           }
        }
        catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
        
        
        LOG.info("Enter Last Name: ");
        String lastName = sc.nextLine();
        try
        {
           if(userValidation.validateLastName(lastName))
           {
       	      LOG.info("Valid");
           }
        }
        catch(UserValidationException e)
        {
         	e.printStackTrace();
        }
        
        LOG.info("Enter EmailId: ");
        String emailId = sc.nextLine();
        try
        {
        	
           if(userValidation.validateEmailId(emailId))
           {
       	      LOG.info("Valid");
           }
        }
        catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
        
        
        LOG.info("Enter Phone Number: ");
        String phoneNum = sc.nextLine();
        try
        {
           if(userValidation.validatePhoneNum(phoneNum))
           {
       	      LOG.info("Valid");
           }
        }
        catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
        
        LOG.info("Enter password: ");
        String password = sc.nextLine();
        try
        {
        	
           if(userValidation.validatePassword(password))
           {
       	      LOG.info("Valid");
           }
        }
        catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
        
        
       	 
        
    }
}
