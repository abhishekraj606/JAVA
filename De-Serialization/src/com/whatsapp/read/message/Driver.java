package com.whatsapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Message;

public class Driver
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rajck\\Desktop\\KodeWala\\Class and Self Practice\\Workspace\\Serialization\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message message = (Message) ois.readObject();
		
		System.out.println("De Ser: " + message.getMessage() + " and user ID " + message.getUserId());
		
		ois.close();

	}

}
