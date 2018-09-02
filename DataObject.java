import java.io.*;
import java.util.*;


class DataObject implements Serializable{
		String message;
		public DataObject(){
			message = null;
		}
		public void setMessage(String m){
			message = m;
		}
		public String getMessage(){
			return message;
		}
	}
