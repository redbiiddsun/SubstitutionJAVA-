package Substitution;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class information {
    
    /**
     *
     */
    public information(){
        DBconnection.getConnection();
    }
    
    
    public static int InfoID = 0 ;
    public static String InfoName = null ;
    public static String InfoEmail = null ;
    public static String InfoSurName = null ;
    public static String InfoPhone = null ;
    public static byte[] InfoPhoto;
    
    
    public static void getID(int ID){
        
        InfoID = ID;
        System.out.println(ID);
        
    }
    
    public static void getName(String Name){
        
        InfoName = Name;
    
    }
    
    public static void getSurname(String Surname){
        
        InfoSurName = Surname;
    
    }
    
    public static void getEmail(String email){
        
        InfoEmail = email;
    
    }
    
    public static void getPhone(String phone){
        
        InfoPhone = phone;
    
    }
    
    
    
    public static void getInfo(){
        
        ResultSet rs;
        PreparedStatement ps;
        
    
        try{
           ps = DBconnection.getConnection().prepareStatement("SELECT * FROM user where id =" + InfoID );
           rs = ps.executeQuery();
          
           
           while (rs.next()){
              getName(rs.getString(2));
              getSurname(rs.getString(3));
              getEmail(rs.getString(4));
              getPhone(rs.getString(7));
              InfoPhoto = rs.getBytes(8);
              

            }
           //System.out.println(InfoID);
           //System.out.println(InfoName);
           //System.out.println(InfoSurName);
           //System.out.println(InfoEmail);
           //System.out.println(InfoPhone);
           //System.out.println(InfoPhoto);
           
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
}