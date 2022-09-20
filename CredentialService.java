package com.gl.Santosh_FOPJava_LabOOPS1;

import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(String firstName, String lastName, String dept) 
	{
		return  firstName + lastName + "@" + dept + ".greatlearning.com";
	}
	public char[] generatePassword() 
	{
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*_=+-/.?<>";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) 
		{
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;	
	} 

	public void showCredentials(Employee e, String email, char[] generatedPassword) 
	{
		System.out.println(" Dear  " + e.getFirstName() +   "  your generated credentials are as follows  " );
		System.out.println("email is:  " +email);
		System.out.println("password is:  "  +generatedPassword);
	}
}