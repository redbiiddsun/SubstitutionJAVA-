package Substitution;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Teachers {
    
    private static int Teacher_ID;
    private static String Teacher_Name = null;
    private static String Teacher_Lastname = null;
    private static String Teacher_Subject = null;
    
    
//Methods to Change Value in Program ***NOT FOR DATABASE 
    public static void setID(int ID){   //Change a Teacher ID
        ID = Teacher_ID;
    }
    public static void setName(String setname){   //Change a Teacher name 
        setname = Teacher_Name;
    }
    public static  void setLastname(String setLname){  //Change a Teacher Lastname
        setLname = Teacher_Lastname;
    }
    public static void setSubject(String setsub){   //Change a Teacher Subject 
        setsub = Teacher_Subject;
    }
    
    
    
    
    public static void getTeacherID(String tname){     //Find TeacherID with Name
        ResultSet rs;
        PreparedStatement ps;
        
        try{
           ps = DBconnection.getConnection().prepareStatement("SELECT * FROM `teachers` WHERE `Teacher_Name` = " + "'" + tname + "'");
           rs = ps.executeQuery();
           
           while (rs.next()){
               setID(rs.getInt(1)); //A value sent back Teacher_ID
           }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
        
    } 
    
    
}
