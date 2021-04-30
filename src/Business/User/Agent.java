/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AbstractClasses.User;
import java.util.Date;

/**
 *
 * @author Manasa
 */
public class Agent extends User{
    private Date createDate;
    public Agent(String userName, String password) {
        super(password, userName, "AGENT");       
    }
    public void setCreateDate() {
        this.createDate = new Date();
    }
    @Override
    public boolean verify(String password) {
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
