package com.myapp.model;

public class Customer {
    private String firstName;
    private String lastName;
    private String pwd;
    private String email;
    private String confirmation;
    private int customerID;
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPwd(){
        return pwd;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getConfirmation(){
        return confirmation;
    }
    
    public int getCustomerID(){
        return customerID;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setConfirmation(String confirmation){
        this.confirmation = confirmation;
    }
    
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    
    
    
}