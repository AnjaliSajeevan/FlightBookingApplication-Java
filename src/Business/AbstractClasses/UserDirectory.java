/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AbstractClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manasa
 */
public class UserDirectory {
    
  
    private List<User> users;
    
    public UserDirectory() {
        users = new ArrayList<>();
        
    }

    public List<User> getUser() {
        return users;
    }

    public void setUser(List<User> users) {
        this.users = users;
    }
    
   public void addUser(User u){
        users.add(u);
   }
   
    public void deleteUser(User u){
    users.remove(u);
    }



}
    
   
