package DBconnect;

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
	private boolean Connected;
	public DBconnect(){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Build Successful");
			con = DriverManager.getConnection("jdbc:mysql://192.168.250.173:3306/test?autoReconnect=true&useSSL=false","root","root");
			st = con.createStatement();
                        Connected=true;
			
		}catch(Exception ex){
			
			//System.out.println("Error: "+ex);
                        Connected=false;
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
        public boolean verifyUser(String userId, String password ){
		try{
			boolean ans=false;
			String query = "select * from user where (id=\""+userId+"\" AND password=\""+password+"\")";
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
        public String getRole(String userId){
            
            /*This method gets a user role from the DB given his id
            Precondition: The user exists on the DB*/
            try{
                String ans;
                String query = "select * from user where (id=\""+userId+"\")";
                rs = st.executeQuery(query);
                //System.out.println("Records from database");
                rs.next();
                ans=rs.getString("role");
                return ans;
            }catch(Exception ex) {
                System.out.println(ex);
                return "";
            }
        }
        
        public String getName(String userId){
            
            /*This method gets a user role from the DB given his id
            Precondition: The user exists on the DB*/
            try{
                String ans;
                String query = "select * from user where (id=\""+userId+"\")";
                rs = st.executeQuery(query);
                //System.out.println("Records from database");
                rs.next();
                ans=rs.getString("name");
                return ans;
            }catch(Exception ex) {
                System.out.println(ex);
                return "";
            }
        }
        public boolean isConnected(){
            return Connected;
        }
}