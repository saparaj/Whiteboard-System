import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
 
public class DataObject 
{
	private String message;
	public DataObject(){}

	public DataObject(String message){
		setMessage(message);
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String getMessage(){
		return message;
	}
}

