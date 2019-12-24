/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.DB;
import View.Home;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class Control {
    
    public int cBk(){
        
        int bc=0;
        
            try{
            Connection con  = DB.createConnection();
            
            Statement stmt = con.createStatement();
                
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM book_data");
     
            rs.next();
            bc=rs.getInt(1);
            //bk1.setText(rowCount);
            }
            catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
        
        return bc;
    }
    public int cMem(){
        
        int bc=0;
        
        try{
            Connection con  = DB.createConnection();
            
            Statement stmt = con.createStatement();
                
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM studata");
     
            rs.next();
            bc=rs.getInt(1);
            //bk1.setText(rowCount);
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
        }
        
        return bc;
    }
    public void clMt(){
        
                 for (Frame frame : Frame.getFrames()) {
                      if (frame.getName().equals("dlib")) {
                        Home Hm=(Home)frame;
                        Hm.clrmT();
                        //Hm.getUtext(Duser,en);
                        
                      }
                  }
    }
    public long calD(String fd,String sd){
        
        long d=0;
        
         SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yy");
            final String f=fd;
            final String s=sd;
            
        try {
            
           java.util.Date date1 = myFormat.parse(f);
           java.util.Date date2 = myFormat.parse(s);
           long diff = date2.getTime() - date1.getTime();
           
            d=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            
        } catch (ParseException e) {
        //e.printStackTrace();
        } 
        
        return d;
    }
}
