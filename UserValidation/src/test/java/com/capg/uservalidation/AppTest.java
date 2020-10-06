package com.capg.uservalidation;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void firstName_ShouldbeProper_ShouldAnswerTrue()
    {
        App userValidation = new App();
        boolean result =userValidation.validateFirstName("Tejaswini");
        Assert.assertTrue(result);
    }
    
    
	@Test
    public void firstName_StartNotCapital_ShouldReturnFalse()
    {  
    	App userValidation = new App();
        boolean result = userValidation.validateFirstName("teju");
        Assert.assertFalse(result);
    }
	
	@Test
	public void firstName_WhenContainsOtherThanLetters_ShouldReturnFalse() 
	{
	    App userValidation = new App();
	    boolean result = userValidation.validateFirstName("te$u");
	    Assert.assertFalse(result);
	}
	
	@Test
	public void lastName_WhenProper_ShouldReturnTrue() 
	{
	    App userValidation = new App();
	    boolean result = userValidation.validateLastName("Amukta");
	    Assert.assertTrue(result);
	}
	
	@Test
	public void lastName_WhenNotStartCapital_ShouldReturnFalse()
	{  
		App userValidation = new App();
	    boolean result = userValidation.validateLastName("amukta");
	    Assert.assertFalse(result);
	}
	@Test
	public void lastName_WhenContainOtherThanLetters_ShouldReturnFalse()
	{ 
		App userValidation = new App();
	    boolean result = userValidation.validateLastName("@mukta");
	    Assert.assertFalse(result);
	}
	
	@Test
	public void emailId_WhenPoper_ShouldReturnTrue()
	{ 
		App userValidation = new App();
	    boolean result = userValidation.validateEmailId("teju_reddy@gmail.com");
	    Assert.assertTrue(result);
	}
	
	@Test
	public void emailId_WhenNotAtTheSymbol_ShouldReturnFalse()
	{ 
		App userValidation = new App();
	    boolean result = userValidation.validateEmailId("tej.com");
	    Assert.assertFalse(result);
	}
	
	@Test
	public void phoneNo_WhenProper_ShouldReturnTrue()
	{
	    App userValidation = new App();
	    boolean result = userValidation.validatePhoneNum("91 9182884051"); 
	    Assert.assertTrue(result);
	}
	
	@Test
	public void phoneNo_WhenNotProper_ShouldReturnFalse()
	{
	    App userValidation = new App();
	    boolean result = userValidation.validatePhoneNum("566783");
	    Assert.assertFalse(result);
	}
	
	@Test
	public void password_WhenProper_ShouldReturnTrue()
	{  
		App userValidation = new App(); 
		boolean result = userValidation.validatePassword("Tejukta@7");
	    Assert.assertTrue(result);
	}
	
	@Test
	public void password_WhenNotProper_ShouldReturnFalse() 
	{
	    App userValidation = new App();
	    boolean result = userValidation.validatePassword("tejuta3");
	    Assert.assertFalse(result);
	}
}
