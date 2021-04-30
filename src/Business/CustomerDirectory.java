/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.User.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anjali,Manasa
 */
public class CustomerDirectory {
  
    private List<Customer> customers;
    
    public CustomerDirectory() {
        customers = new ArrayList<>();
        
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
   public void addCustomer(Customer c){
        customers.add(c);
   }
   
    public void deleteCustomer(Customer c){
    customers.remove(c);
    }
  
    public Customer searchCustomer(String passwordNo) {
        Customer res = null;
        for (Customer c : customers) {
            if (c.getPassword().equals(passwordNo)) {
                res= c;
            }
        }
        
        return res;
    }

}
    
   
