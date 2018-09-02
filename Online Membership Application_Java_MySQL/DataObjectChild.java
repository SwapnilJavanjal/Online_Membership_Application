import java.io.*;
import java.util.*;


public class DataObjectChild extends DataObject{

	protected String MemberFname, MemberLname, MemberAddress1, MemberContact, Query, MemberCity, MemberState, MemberCountry, MemberUserName, MemberPassword;
	protected String AdminUserName, AdminPassword;
	protected int MemberId, MemberPincode;
	protected int Admin_Id;

	DataObjectChild(){
		MemberFname = "";
		MemberId = -1;
		MemberPincode = -1;
		Admin_Id = -1;
		MemberLname= "";
		MemberAddress1= "";
		MemberContact = "";
		Query ="";
		MemberCity= "";
		MemberState = "";
		MemberCountry="";
		AdminUserName = "";
		AdminPassword = "";
		MemberUserName="";
		MemberPassword="";
	}

	public int getMemberId(){
		return MemberId;
	}

	public void setMemberId(int inMemberId){
		MemberId = inMemberId;
	}

	public String getMemberFname(){
		return MemberFname;
	}

	public void setMemberFname(String inMemberFname){
		MemberFname = inMemberFname;
	}


	public String getMemberLname(){
		return MemberLname;
	}
	
	public String getMemberUserName(){
		return MemberUserName;
	}
	
	
	public void setMemberUserName(String inMemberUserName){
		MemberUserName = inMemberUserName;
	}

	public void setMemberLname(String inMemberLname){
		MemberLname = inMemberLname;
	}
	
	public String getMemberPassword(){
		return MemberPassword;
	}
	
	
	public void setMemberPassword(String inMemberPassword){
		MemberPassword = inMemberPassword;
	}
 
	public String getMemberContact(){
		return MemberContact;
	}

	public void setMemberContact(String inMemberContact){
		MemberContact = inMemberContact;
	}
 
	public String getMemberAddress1(){
		return MemberAddress1;
	}

	public void setMemberAddress1(String inMemberAddress1){
		MemberAddress1 = inMemberAddress1;
	}
 
	public String getMemberCity(){
		return MemberCity;
	}

	public void setMemberCity(String inMemberCity){
		MemberCity = inMemberCity;
	}

	public String getMemberState(){
		return MemberState;
	}

	public void setMemberState(String inMemberState){
		MemberState = inMemberState;
	}
 
 
 	public String getQuery(){
		return Query;
	}

	public void setQuery(String inQuery){
		Query = inQuery;
	}

	public int getMemberPincode(){
		return MemberPincode;
	}

	public void setMemberPincode(int inMemberPincode){
		MemberPincode = inMemberPincode;
	}
 
	public String getMemberCountry(){
		return MemberCountry;
	}

	public void setMemberCountry(String inMemberCountry){
		MemberCountry = inMemberCountry;
	}

	public String getAdminUserName(){
		return AdminUserName;
	}

	public void setAdminUserName(String inAdminUserName){
		AdminUserName = inAdminUserName;
	}

	public String getAdminPassword(){
		return AdminPassword;
	}

	public void setAdminPassword(String inAdminPassword){
		AdminPassword = inAdminPassword;
	}
 
}