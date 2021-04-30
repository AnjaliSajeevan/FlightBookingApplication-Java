/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AbstractClasses.User;
import Business.CustomerDirectory;
import Business.User.TravelAgent;

/**
 *
 * @author Anjali
 */
public class Admin extends User {
    public TravelAgentDirectory agentDirectory;
    public CustomerLoginDirectory custloginDir;
    
    public Admin() {
        super("", "", "Admin");
        agentDirectory =new TravelAgentDirectory();
        custloginDir = new CustomerLoginDirectory();
         
    }

    public TravelAgentDirectory getAgentDirectory() {
        return agentDirectory;
    }

    public void setAgentDirectory(TravelAgentDirectory agentDirectory) {
        this.agentDirectory = agentDirectory;
    }

    public CustomerLoginDirectory getCustDir() {
        return custloginDir;
    }

    public void setCustDir(CustomerLoginDirectory custDir) {
        this.custloginDir = custDir;
    }

    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
