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
public class item {
    private Integer code;
    private String category;
    private String status;
    
    public item(String category,String status){
        this.status = status;
        this.category = category;
    }
    
    public Integer getCode(){
        return code;
    }
    public String getStatus(){
        return status;
    }
    public void setCode(Integer code){
        this.code = code;
    }
}
