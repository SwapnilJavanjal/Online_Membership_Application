import java.io.*;
import java.net.*;

public class AdminClient{
	public static void main(String[] arg){
		try{
			DataObject myObject = new DataObject();

			//myObject.setMessage("Did you get this?");
			
			myObject.setQuery("SELECT * FROM Admin");

			System.out.println("Message sent : " + myObject.getQuery());

			//Socket socketToServer = new Socket("127.0.0.1", 34007);
		Socket socketToServer = new Socket("afsconnect1.njit.edu", 34007);
		

			ObjectOutputStream myOutputStream =
				new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream =
				new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObject)myInputStream.readObject();

//                        System.out.println("Member ID : " + myObject.getMemberId());
                        System.out.println("UserName : " + myObject.getAdminUserName());
			System.out.println("Password : " + myObject.getAdminPassword());

			myOutputStream.close();
			
			myInputStream.close();

            		socketToServer.close();
					
					
	
		}
		catch(Exception e){
			System.out.println(e);
        		}
	}
}