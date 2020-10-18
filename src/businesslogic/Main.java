package businesslogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String[] args) throws IOException{
		Connection connection=null;
		try {
			 connection = ConnectionManager.getConnection();
			
			if(connection!=null){
				System.out.println("Connection Established");
			}
			else{
				System.out.println("Check your Connection");
					
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
