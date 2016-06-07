/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEINMLogic;

/**
 *
 * @author Minos
 */
public class user {
    
    //This class implements the user system on the SIGEINM system.
    private String id;
    private String name;
    private String password;
    private String role;
    
    public user(String id, String name, String password, String role)
    {
        
        this.id=id; //The user id is the login authentication that the user uses to log in.
        this.name=name;
        this.password=password;
        this.role=role;
    }
    
    public String getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getRole()
    {
        return this.role;
    }
    public boolean checkFields()
    {
        return true;
    }
}
