/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import View.Home;
import View.Login;
/**
 *
 * @author Student
 */
public class Main {
    public String un;
      public static void main(String[] args) {
        Home mw=new Home();
        mw.setVisible(true);
        new Login(mw,true).setVisible(true);
    }
      public static void dDe(){
          
      }
}   

