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
 * @author Anjali, Manasa
 */
public class Customer extends User {
     //  private ProductDirectory directory;
         private String firstName;
     private String lastName;
     private String dateOfBirth;
     private String passportNumber;
     private String address;
     private String contactNumber;
     private String emailID;
       private Date createDate;
       private Date updateDate;

        public Customer(String userName, String password) {
        super(password, userName, "CUSTOMER");
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate() {
        this.createDate = new Date();
    }
        public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate() {
        this.updateDate = new Date();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
     public String toString()
    {
        return firstName;
    }

    @Override
    public boolean verify(String password) {
        if(password.equals(getPassword()))
            return true;
        return false;
    }
     
}
