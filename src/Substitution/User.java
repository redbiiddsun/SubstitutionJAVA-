/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Substitution;

/**
 *
 * @author Phanasorn Srisayam
 */
public class User {
    
    private int id;
    private String firstName = null;
    private String lastName= null;
    private String email = null;
    private String username = null;
    private String password = null;
    private String phone = null;
    
    
    public User(int ID, String FirstName, String LastName, String Email, String Username, String Password, String Phone)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
        this.username = Username;
        this.password = Password;
        this.phone = Phone;
        
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public String getPhone()
    {
        return phone;
    }
    

   
}
