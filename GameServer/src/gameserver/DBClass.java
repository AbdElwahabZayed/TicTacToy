
package gameserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.ClientDriver;
/**
 *
 * @author dell
 */
public class DBClass {
    Connection con;
    Statement stat;
    PreparedStatement pst;
    String queryString;
    ResultSet rs;
    public static final int SUCESSFUL_LOGIN=0;
    public static final int FAILD_LOGIN=1;
    public static final int IS_ALREADY_SIGNED=0;
    public static final int NEW_SIGN_UP=1;
    
   // PlayerClass player;
   public static int i=1;
  
   
    public void setPlayer(String name,String pass )
    {    
        try {
             DriverManager.registerDriver(new ClientDriver());
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement("insert into ROOT.PLAYER(username,password,score,islogined)values(?,?,?,false)");  
            pst.setString(1, name);
            pst.setString(2,pass);
            pst.setInt(3, 0);
            pst.executeUpdate();
            con.commit();
            con.close();
            if(stat!=null)
            {
                stat.close();
            }
            if(pst!=null)
            {
                pst.close();
            }
            if(con != null)
            {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int isAlreadySigned(String userName){
        int result=0;
            queryString="select * from ROOT.PLAYER where username = ? ";
        try {
            DriverManager.registerDriver(new ClientDriver());
       
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement(queryString);
            pst.setString(1, userName);
            rs= pst.executeQuery();
            if(rs.next()){
                result=IS_ALREADY_SIGNED;
            }else{
                result=NEW_SIGN_UP;
            }
            System.out.println("    "+queryString);
            System.out.println("    "+result);
            
         } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    public int login(String s,String pass)
    {
          int result = 1;
        queryString="select * from ROOT.PLAYER where username = ? and password = ?";
        try {
            DriverManager.registerDriver(new ClientDriver());
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement(queryString);
            pst.setString(1, s);
            pst.setString(2, pass);
            rs= pst.executeQuery();
            System.out.println("    "+queryString);
            System.out.println(s+"    "+pass);
            //System.out.println("    "+rs.getString(1));
             if(rs.next())
                {
                    result=SUCESSFUL_LOGIN;
                }
            else
               {
                   result=FAILD_LOGIN;
               }
//            String found_name=rs.getString(2);
//            String found_pass=rs.getString(3);
//            if(found_name!=null&&found_pass!=null)
//            {
//                x=0;
//            }
//            else if(found_name!=null&&found_pass==null)
//            {
//                x=1;
//            }
//            else
//            {
//                x=2;
//            }

            if(stat!=null)
            {
                stat.close();
            }
            if(pst!=null)
            {
                pst.close();
            }
            if(con != null)
            {
                con.close();
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
            return result;
    }
    public int setAvailable(String userName){
        
        int result=0;
            queryString="update ROOT.PLAYER set islogined = ? where username = ? ";
        try {
            DriverManager.registerDriver(new ClientDriver());
       
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement(queryString);
            pst.setString(1,"true");
            pst.setString(2, userName);
            pst.executeUpdate();
            con.commit();
            con.close();
            System.out.println("    "+queryString);
            System.out.println("    "+result);
            
         } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    public void setGame(String P1_Name,String P2_Name,String[] steps){
        try {
            DriverManager.registerDriver(new ClientDriver());
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement("insert into ROOT.GAMERECORD(user_name1,user_name2,step_1,step_2,step_3,step_4,step_5,step_6,step_7,step_8,step_9)values(?,?,?,?,?,?,?,?,?,?,?)");  
            pst.setString(1, P1_Name);
            pst.setString(2,P2_Name);
            pst.setString(3, steps[0]);
            pst.setString(4, steps[1]);
            pst.setString(5, steps[2]);
            pst.setString(6, steps[3]);
            pst.setString(7, steps[4]);
            pst.setString(8, steps[5]);
            pst.setString(9, steps[6]);
            pst.setString(10,steps[7]);
            pst.setString(11, steps[8]);
            pst.executeUpdate();
            con.commit();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getAvilabileRecordes(String userName){
        String rcordes="rcordes/";
        try {
            queryString="select * from ROOT.GAMERECORD where user_name1 = ? or user_name2 = ? ";
            DriverManager.registerDriver(new ClientDriver());
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement(queryString, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, userName);
            pst.setString(2, userName);
            ResultSet rs=pst.executeQuery();
            //rs.absolute(1);
            while(rs.next()){
                rcordes=rcordes+rs.getString(3)+"-"+rs.getString(4)+"-"+rs.getString(5)+"-"+rs.getString(6)+"-"+rs.getString(7)+"-"+rs.getString(8)+"-"+rs.getString(9)+"-"+rs.getString(10)+"-"+rs.getString(11)+"/";
            }
            con.commit();
            con.close();
            System.out.println("   "+rcordes);
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rcordes;
    }
    public void plusScore(String userName){
        queryString="update ROOT.PLAYER set score = score + 1 where username = ? ";
        try {
            DriverManager.registerDriver(new ClientDriver());
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement(queryString);
            pst.setString(1, userName);
            pst.executeUpdate();
           
            System.out.println("    "+queryString);
            con.commit();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public String getScore(String userName) {
        queryString="select * from ROOT.PLAYER where username = ? ";
        String result="";
        try {
            DriverManager.registerDriver(new ClientDriver());
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Game_DB","root","root");
            pst=con.prepareStatement(queryString);
            pst.setString(1, userName);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
               result= String.valueOf(rs.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
