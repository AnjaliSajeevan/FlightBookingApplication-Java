/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AbstractClasses.User;
import Business.CustomerDirectory;

/**
 *
 * @author Anjali
 */
public class CustomerLog extends User implements Comparable<CustomerLog> {

    private CustomerDirectory customerDirectory;

    public CustomerLog(String password, String userName) {
        super(password, userName, "Customer");
        customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
        
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    @Override 
    public int compareTo(CustomerLog o) {
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
