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
import SIGEINMLogic.property;
import SIGEINMLogic.user;
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
                    con = DriverManager.getConnection("jdbc:mysql://10.147.17.226:3306/test?autoReconnect=true&useSSL=false","root","root");
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
        public boolean createUser(user usuario)
        {
            try{
                String query = "INSERT INTO user VALUES ("+"'"+usuario.getId()+"',"+"'"+usuario.getName()+"',"
                        +"'"+usuario.getPassword()+"',"+"'"+usuario.getRole()+"'"+")";
                PreparedStatement pstm = this.con.prepareStatement(query);
                pstm.execute();
                pstm.close();
                return true;
			
		}
            catch(Exception ex){
                System.out.println(ex);
                return false;
		}
        }
        public boolean deleteUser(String ID)
        {
            try{
                String query = "DELETE FROM user WHERE (id=\""+ID+"\")";
                PreparedStatement pstm = this.con.prepareStatement(query);
                pstm.execute();
                pstm.close();
                return true;
		}
            catch(Exception ex){
                System.out.println(ex);
                return false;
		}
        }
        public boolean createProperty(property propiedad)
        {
            try{
                
                Integer maxCode = 0;
                String query = "SELECT * FROM property ORDER BY code DESC";
                rs = st.executeQuery(query);
                if (rs.next()){
                    maxCode=rs.getInt("code");
                }
                maxCode = maxCode + 1;
                query = "INSERT INTO property VALUES ("+maxCode.toString()+","+"'"+propiedad.getOwner()+"',"
                        +propiedad.getArea().toString()+","+propiedad.getPrice().toString()+","+propiedad.getNumFloors().toString()+","
                        +propiedad.getNumRooms().toString()+",'"+propiedad.getAddress()+"')";
                PreparedStatement pstm = this.con.prepareStatement(query);
                pstm.execute();
                pstm.close();
                propiedad.setCode(maxCode);
                return true;

		}catch(Exception ex){
                    System.out.println(ex);
                    return false;
		}
        }
        public boolean deleteProperty(String code)
        {
            try{
                String query = "DELETE FROM property WHERE (code=\""+code+"\")";
                PreparedStatement pstm = this.con.prepareStatement(query);
                pstm.execute();
                pstm.close();
                return true;
			
		}catch(Exception ex){
			System.out.println(ex);
                        return false;
		}
        }
        public boolean verifyProperty(String address){
		try{
                    boolean ans=false;
                    String query = "select * from property where (address=\""+address+"\")";
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
        public boolean verifyUserPassword(String userId, String password ){
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
        public boolean verifyUser(String userId){
		try{
                    boolean ans=false;
                    String query = "select * from user where (id=\""+userId+"\")";
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
            
            /*This method gets a user name from the DB given his id
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
        
        public int countColumnsTable(String tableName){
            
            try{
                int ans;
                String query = "SELECT COUNT(*) FROM INFORMATION_SCHEMA.COLUMNS " +
                                "WHERE table_schema = 'test'" +
                                "AND table_name ='"+tableName+"'";
                rs = st.executeQuery(query);
                //System.out.println("Records from database");
                rs.next();
                ans=rs.getInt(1);
                return ans;
            }catch(Exception ex) {
                System.out.println(ex);
                return 0;
            }
        }
        public int countRowsTable(String tableName){
            
            try{
                int ans;
                String query = "select count(*) from "+tableName+";";
                rs = st.executeQuery(query);
                //System.out.println("Records from database");
                rs.next();
                ans=rs.getInt(1);
                return ans;
            }catch(Exception ex) {
                System.out.println(ex);
                return 0;
            }
        }
        public String getValueByIndex(int rowIndex, int columnIndex, String tableName){
            
            try{
                String ans;
                String query = "select * from "+tableName+";";
                rs = st.executeQuery(query);
                //System.out.println("Records from database");
                rs.absolute(rowIndex+1);
                ans=rs.getString(columnIndex);
                return ans;
            }catch(Exception ex) {
                System.out.println(ex);
                return "";
            }
        }
}