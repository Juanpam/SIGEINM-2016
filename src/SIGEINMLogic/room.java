/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEINMLogic;

import java.util.ArrayList;

/**
 *
 * @author Minos
 */
public class room {
    
    //This class implements the user system on the SIGEINM system.
    
    private ArrayList<item> itemList;
    private Integer code;
    private String type;
    
    public room(String type){
        
        this.type = type;
    }
    public String getType(){
        
        return type;
    }
    public Integer getCode(){
        return code;
    }
    public void addItem(item Item){
        itemList.add(Item);
    }
}
