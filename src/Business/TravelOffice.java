/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class TravelOffice {
    private ArrayList<CustomerDirectory> customerDirectory;
    
    public TravelOffice()
    {
        customerDirectory = new ArrayList<CustomerDirectory>();
    }

    public ArrayList<CustomerDirectory> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<CustomerDirectory> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
     public CustomerDirectory addCustomer(CustomerDirectory c)
    {
        customerDirectory.add(c);
        return c;
    }
    
    public void deleteCustomer(CustomerDirectory c)
    {  customerDirectory.remove(c);
    }

   }
