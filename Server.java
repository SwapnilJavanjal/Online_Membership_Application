import java.io.*;
import java.net.*;
import java.sql.*;

public class Server{
	public static void main(String[] arg){

		DataObject myObject = null;

		try{
			
			ServerSocket myServerSocket = new ServerSocket(33007);
			System.out.println("Socket Created");

			Socket incoming = myServerSocket.accept();
			System.out.println("Socket Accepted");
      
      String connectionURL = "jdbc:mysql://sql1.njit.edu:3306/sj498";
Connection connection = null;
Statement statement = null;
ResultSet rs = null;



Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(connectionURL, "sj498", "M9K8rw1uw");
statement = connection.createStatement();

			ObjectOutputStream myOutputStream =
				new ObjectOutputStream(incoming.getOutputStream());

			ObjectInputStream myInputStream =
				new ObjectInputStream(incoming.getInputStream());

			myObject = (DataObject)myInputStream.readObject();
      try{
      if((myObject.getQuery()).contains("update"))
      {
      System.out.println("Query is "+myObject.getQuery());
      int i = statement.executeUpdate(myObject.getQuery());
      System.out.println(i+" rows updated");
      }
      else
      rs = statement.executeQuery(myObject.getQuery());
    }catch(Exception e){System.out.println(e);}
/*while (rs.next()) {                  //display on server

}*/

rs.next();

      if((myObject.getQuery()).contains("Members")){
      myObject.setMemberId(Integer.parseInt(rs.getString("Member_Id")));
      myObject.setMemberFname(rs.getString("FName"));
      myObject.setMemberLname(rs.getString("LName"));
      myObject.setMemberAddress1(rs.getString("Address1"));
      myObject.setMemberContact(rs.getString("Contact"));
      myObject.setMemberCity(rs.getString("City"));
      myObject.setMemberState(rs.getString("State"));
      myObject.setMemberPincode(Integer.parseInt(rs.getString("PinCode")));
      myObject.setMemberCountry(rs.getString("Country"));
      myObject.setMemberUserName(rs.getString("UserName"));
      myObject.setMemberPassword(rs.getString("Password"));
      }
      if((myObject.getQuery()).contains("Admin")){
      myObject.setAdminUserName(rs.getString("UserName"));
     
      myObject.setAdminPassword(rs.getString("Password"));
     
      
      }
      



System.out.println("Message sending");
		
myOutputStream.writeObject(myObject);


      rs.close();
			myOutputStream.close();
			
			myInputStream.close();

			myServerSocket.close();

	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
