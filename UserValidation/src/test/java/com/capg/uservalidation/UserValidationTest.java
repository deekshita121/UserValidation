package com.capg.uservalidation;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class UserValidationTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void firstName_ShouldbeProper_ShouldAnswerTrue()
    {
        UserValidation userValidation = new UserValidation();
       
        boolean result = false;
        try
        {
        	result = userValidation.validateFirstName("Tejaswini");
        }
        catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
        
        Assert.assertTrue(result);
    }
    
    
	@Test
    public void firstName_StartNotCapital_ShouldReturnFalse()
    {  
    	UserValidation userValidation = new UserValidation();
    	try
    	{
            userValidation.validateFirstName("teju");
    	}
    	catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
        
    }
	
	@Test
	public void firstName_WhenContainsOtherThanLetters_ShouldReturnFalse() 
	{
	    UserValidation userValidation = new UserValidation();
	    try
	    {
	         userValidation.validateFirstName("te$u");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void lastName_WhenProper_ShouldReturnTrue() 
	{
	    UserValidation userValidation = new UserValidation();
	    try
	    {
	    	 userValidation.validateLastName("Amukta");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void lastName_WhenNotStartCapital_ShouldReturnFalse()
	{  
		UserValidation userValidation = new UserValidation();
		try
		{
			
	         userValidation.validateLastName("amukta");
		}
		catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	@Test
	public void lastName_WhenContainOtherThanLetters_ShouldReturnFalse()
	{ 
		UserValidation userValidation = new UserValidation();
	    try
	    {
	    	userValidation.validateLastName("@mukta");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void emailId_WhenPoper_ShouldReturnTrue()
	{ 
		UserValidation userValidation = new UserValidation();
	    try
	    {
	    	userValidation.validateEmailId("teju_reddy@gmail.com");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void emailId_WhenNotAtTheSymbol_ShouldReturnFalse()
	{ 
		UserValidation userValidation = new UserValidation();
	    try
	    {
	    	userValidation.validateEmailId("tej.com");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	}
	
	@Test
	public void phoneNo_WhenProper_ShouldReturnTrue()
	{
	    UserValidation userValidation = new UserValidation();
	    try
	    {
	    	userValidation.validatePhoneNum("91 9182884051"); 
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void phoneNo_WhenNotProper_ShouldReturnFalse()
	{
	    UserValidation userValidation = new UserValidation();
	    try
	    {
	    	userValidation.validatePhoneNum("566783");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void password_WhenProper_ShouldReturnTrue()
	{  
		UserValidation userValidation = new UserValidation(); 
		try
		{
			userValidation.validatePassword("Tejukta@7");
		}
		catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
	
	@Test
	public void password_WhenNotProper_ShouldReturnFalse() 
	{
	    UserValidation userValidation = new UserValidation();
	    try
	    {
	    	userValidation.validatePassword("tejuta3");
	    }
	    catch(UserValidationException e)
        {
        	e.printStackTrace();
        }
	    
	}
}
