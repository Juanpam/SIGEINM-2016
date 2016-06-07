/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEINMLogic;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Minos
 */
public class property {
    private String address;
    private String owner;
    private Integer area;
    private Integer price;
    private Integer numFloors;
    private Integer numRooms;
    private ArrayList<room> roomsList;
    private Integer code;
    
    public property(String address, String owner, Integer area, Integer price, Integer numFloors){
        
        //This class implements the property system on the SIGEINM system.
        this.address = address;
        this.owner = owner;
        this.area = area;
        this.price = price;
        this.numFloors = numFloors;
        this.numRooms = 0;
    
    }
    public String getAddress(){
        return address;
    }
    public String getOwner(){
        return owner;
    }
    public Integer getArea(){
        return area;
    }
    public Integer getPrice(){
        return price;
    }
    public Integer getNumFloors(){
        return numFloors;
    }
    public Integer getNumRooms(){
        return numFloors;
    }
    public Integer getCode(){
        return code;
    }
    public void setCode(Integer code){
        this.code = code;
    }
}
