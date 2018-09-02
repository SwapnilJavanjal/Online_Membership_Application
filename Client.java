import java.io.*;
import java.net.*;

public class Client{
	public static void main(String[] arg){
		try{
			DataObject myObject = new DataObject();

			//myObject.setMessage("Did you get this?");
			myObject.setQuery("SELECT * FROM Members");

			System.out.println("Message sent : " + myObject.getQuery());

			//Socket socketToServer = new Socket("127.0.0.1", 34007);
		Socket socketToServer = new Socket("afsconnect1.njit.edu", 34007);


			ObjectOutputStream myOutputStream =
				new ObjectOutputStream(socketToServer.getOutputStream());

			ObjectInputStream myInputStream =
				new ObjectInputStream(socketToServer.getInputStream());

			myOutputStream.writeObject(myObject);

			myObject = (DataObject)myInputStream.readObject();

                        System.out.println("Member ID : " + myObject.getMemberId());
                        System.out.println("FName : " + myObject.getMemberFname());
			System.out.println("LName : " + myObject.getMemberLname());
			System.out.println("Address1 : " + myObject.getMemberAddress1());
			System.out.println("Address2 : " + myObject.getMemberAddress2());
			System.out.println("City : " + myObject.getMemberCity());
			System.out.println("State : " + myObject.getMemberState());
			System.out.println("Pincode : " + myObject.getMemberPincode());
			System.out.println("Country : " + myObject.getMemberCountry());

			myOutputStream.close();
			
			myInputStream.close();

            		socketToServer.close();
	
		}
		catch(Exception e){
			System.out.println(e);
        		}
	}
}