package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("");
			
		}catch(FileNotFoundException e)
		{
			System.out.println("Exception class");
		}catch(IOException e)
		{
			
		}

	}

}
