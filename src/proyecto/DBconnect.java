package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paula
 */
import java.sql.*;

public class DBconnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBconnect(){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Build Successful");
			
			con = DriverManager.getConnection("jdbc:mysql://172.17.65.133:3306/test?autoReconnect=true&useSSL=false","root","root");
			st = con.createStatement();
			
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
				
		}
	}
	
	public void getData(){
		try{
			
			String query = "select * from people";
			rs = st.executeQuery(query);
			System.out.println("Records from database");
			while(rs.next()){
				String name = rs.getString("name");
				String age = rs.getString("age");
				System.out.println("Name:"+name+"  "+"Age: "+age);
			}
			
		}catch(Exception ex){
			System.out.println(ex);
		}
		
		
	}
        public boolean verifyUser(String user, String password ){
		try{
			boolean ans=false;
			String query = "select * from people where (id="+user+"AND password="+password+")";
			rs = st.executeQuery(query);
			//System.out.println("Records from database");
			if (rs.next()){
                            ans=true;
			}
                        return ans;
			
		}catch(Exception ex){
			System.out.println(ex);
                        return false;
		}
		
		
	}
        
       

}