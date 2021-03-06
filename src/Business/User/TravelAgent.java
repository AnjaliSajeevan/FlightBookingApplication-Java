/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AbstractClasses.User;

/**
 *
 * @author Anjali
 */
public class TravelAgent extends User implements Comparable<TravelAgent>{
    

    public TravelAgent(String password, String userName) {
        super(password, userName, "TravelAgent");
    }
    
    @Override 
    public int compareTo(TravelAgent o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }

    
        
}
