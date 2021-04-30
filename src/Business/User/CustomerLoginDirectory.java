/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AbstractClasses.User;
import java.util.List;
import Business.User.CustomerLog;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class CustomerLoginDirectory {
    private List<User>customerLoginList;

    public CustomerLoginDirectory(){
        customerLoginList=new ArrayList<>();
    }
    public List<User> getCustomerLoginList() {
        return customerLoginList;
    }

    public void setCustomerLoginList(List<User> customerLoginList) {
        this.customerLoginList = customerLoginList;
    }
    
       public CustomerLog addCustomerLogin(String newPassword, String newCustomerId) {
        CustomerLog cus = new CustomerLog(newPassword,newCustomerId);
        customerLoginList.add(cus);
        return cus;
    }  
}
