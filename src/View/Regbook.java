/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import Controller.Control;
import Model.DB;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Regbook extends javax.swing.JDialog {
    String si;
    //boolean Em=false; 
    /**
     * Creates new form Regbook
     */
    Control c= new Control();
    public Regbook(java.awt.Frame parent, boolean modal,boolean eM) {
        super(parent, modal);
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/null.png")));
        
        uMode(eM);
    }
    private void setUi(){
                
                int bc=0;
                int in=0;
                boolean x=false;
                
                in=c.cBk()+1;
           
            try{
                
            Connection con  = DB.createConnection();
            
            Statement stmt = con.createStatement();
            
            do{    
                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM book_data WHERE id='"+in+"'");
     
                rs.next();
                bc=rs.getInt(1);
            
                if(bc>0){
                    in=in+1;
                }
                else{
                    x=true;
                }
                }while(x==false);
       
                bk1.setText(String.valueOf(in));
            
            }
            catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
       
    }
    public void uMode(boolean umod){
        if(umod==true){
            btnSub.setEnabled(false);
       }
        else{
            btnDel.setEnabled(false);
            btnedit.setEnabled(false);
            btnSub.setText("Submit");
            btnokcan.setText("Cancel");
            setUi();//bk1.setText(String.valueOf(c.cBk()+1));
            
        }
    }
    private void coR1(){
    
    
        }
        public void sDt(int index){
    
        try{
            Connection con  = DB.createConnection();
            
            Statement stmt = con.createStatement();
                
            ResultSet rs = stmt.executeQuery("SELECT * FROM book_data WHERE id='"+index+"'");
     //id,name,auth,regd,cat,pub,ppub,copy,edi,isbn,doner,avbl
           
            tEnbl(false);
            
            while(rs.next())
             {
                 bk1.setText(rs.getString("id"));
                 bk2.setText(rs.getString("name"));
                 bk3.setText(rs.getString("auth"));
                 bk4.setText(rs.getString("regd"));
                 si=rs.getString("cat");
                 bk5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {si}));
                 bk6.setText(rs.getString("pub"));
                 bk7.setText(rs.getString("ppub"));
                 bk8.setText(rs.getString("copy"));
                 bk9.setText(rs.getString("edi"));
                 bk10.setText(rs.getString("isbn"));
                 bk11.setText(rs.getString("doner"));
                 
             }  
        }
        catch(Exception e)
        {
           // System.out.println(e.getMessage());
        }
    }
        private void tEnbl(boolean en){
            bk2.setEditable(en);
            bk3.setEditable(en);
            bk4.setEditable(en);
            bk5.setEditable(en);
            bk6.setEditable(en);
            bk7.setEditable(en);
            bk8.setEditable(en);
            bk9.setEditable(en);
            bk10.setEditable(en);
            bk11.setEditable(en);
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSub = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bk1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bk5 = new javax.swing.JComboBox();
        btnedit = new javax.swing.JButton();
        bk2 = new javax.swing.JFormattedTextField();
        bk3 = new javax.swing.JFormattedTextField();
        bk4 = new javax.swing.JFormattedTextField();
        bk6 = new javax.swing.JFormattedTextField();
        bk7 = new javax.swing.JFormattedTextField();
        bk8 = new javax.swing.JFormattedTextField();
        bk9 = new javax.swing.JFormattedTextField();
        bk10 = new javax.swing.JFormattedTextField();
        bk11 = new javax.swing.JFormattedTextField();
        btnDel = new javax.swing.JButton();
        btnokcan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Book");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Book ID");

        jLabel2.setText("Category");

        jLabel3.setText("Publisher");

        jLabel4.setText("Place of Pub.");

        jLabel5.setText("Copyright year");

        btnSub.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSub.setText("Update");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        jLabel6.setText("Author");

        jLabel7.setText("Reg Date");

        jLabel8.setText("Book Name ");

        bk1.setBackground(new java.awt.Color(204, 204, 204));
        bk1.setText("001");

        jLabel9.setText("Edition");

        jLabel10.setText("ISBN NO");

        jLabel12.setText("Doner Name");

        bk5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adventure", "Antiques & Collectibles", "Architecture", "Art", "Bibles", "Biography & Autobiography", "Business & Economics", "Comics & Graphic Novels", "Computers", "Cooking", "Crafts & Hobbies", "Design", "Drama", "Education", "Encyclopedia", "Erotic", "Esotericism", "Essay", "Fairy Tale", "Family & Relationships", "Fantasy", "Fiction", "Foreign Language Study", "Games", "Gardening", "Health & Fitness", "History", "Horror", "House & Home", "Humor", "Juvenile Fiction", "Juvenile Nonfiction", "Language & Literature", "Law", "Letters", "Literary Collections", "Literary Criticism", "Mathematics", "Medical", "Music", "Mystery & Crime", "Nature", "Performing Arts", "Pets", "Philosophy", "Photography", "Poetry", "Political Science", "Psychology", "Religion", "Romance", "Satire", "Science", "Science Fiction", "Self-Help", "Short Story", "Social Science", "Sports & Recreation", "Study Aids", "Technology & Engineering", "Thriller", "Transportation", "Travel", "True Crime" }));
        bk5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bk5MouseClicked(evt);
            }
        });
        bk5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bk5ItemStateChanged(evt);
            }
        });
        bk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk5ActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnokcan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnokcan.setText("  OK   ");
        btnokcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokcanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bk11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bk10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bk9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bk8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bk6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bk5, 0, 242, Short.MAX_VALUE)
                        .addComponent(bk3)
                        .addComponent(bk2)
                        .addComponent(bk4))
                    .addComponent(bk7))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnDel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnokcan)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bk1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bk5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bk6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bk7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bk8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bk9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bk10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bk11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSub)
                    .addComponent(btnedit)
                    .addComponent(btnokcan)
                    .addComponent(btnDel))
                .addGap(158, 158, 158))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Book ID   :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed

        if(btnSub.getText().equals("Submit")){
            snw();
        }
        else{
            upd();
            btnokcan.setText("  OK   ");
        }
        c.clMt();
    }//GEN-LAST:event_btnSubActionPerformed
    private void snw(){
        try{

            //String snm  =   bk3.getText();

            if(bk3.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Name Cannot be Empty","Submit",JOptionPane.WARNING_MESSAGE);
            }

            Connection con  = DB.createConnection();
            String SQL="INSERT INTO book_data (id,name,auth,regd,cat,pub,ppub,copy,edi,isbn,doner,avbl,mid,gd,rd) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt  = con.prepareStatement(SQL);

            pstmt.setString(1, bk1.getText());
            pstmt.setString(2, bk2.getText());
            pstmt.setString(3, bk3.getText());
            pstmt.setString(4, bk4.getText());
            pstmt.setString(5, bk5.getSelectedItem().toString());
            pstmt.setString(6, bk6.getText());
            pstmt.setString(7, bk7.getText());
            pstmt.setString(8, bk8.getText());
            pstmt.setString(9, bk9.getText());
            pstmt.setString(10, bk10.getText());
            pstmt.setString(11, bk11.getText());
            pstmt.setString(12, "Yes");
            pstmt.setString(13, "-");
            pstmt.setString(14, "-");
            pstmt.setString(15, "-");
            
            pstmt.executeUpdate();
            pstmt.close();

            JOptionPane.showMessageDialog(this,"Data sucsesfuly submited ","Submit",JOptionPane.INFORMATION_MESSAGE);
            
            bk1.setText("");
            bk2.setText("");
            bk3.setText("");
            bk4.setText("");
            bk6.setText("");
            bk7.setText("");
            bk8.setText("");
            bk9.setText("");
            bk10.setText("");
            bk11.setText("");
            setUi();
            

        }

        catch(Exception e){
            //tem.out.println(e.getMessage());
        }
    }
     private void upd(){
         if(bk3.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Name Cannot be Empty","Edit",JOptionPane.WARNING_MESSAGE);
         }
         else{
             
             
             try{
                 
                int nid= Integer.parseInt(bk1.getText());
                
                Connection con = DB.createConnection();
                
                Statement stmt = con.createStatement();
                //name,auth,regd,cat,pub,ppub,copy,edi,isbn,doner
                stmt.executeUpdate("update book_data set name='"+bk2.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set auth='"+bk3.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set regd='"+bk4.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set cat='"+bk5.getSelectedItem().toString()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set pub='"+bk6.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set ppub='"+bk7.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set copy='"+bk8.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set edi='"+bk9.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set isbn='"+bk10.getText()+"' where id='"+nid+"'");
                stmt.executeUpdate("update book_data set doner='"+bk8.getText()+"' where id='"+nid+"'");
                
                JOptionPane.showMessageDialog(this,"Data sucsesfuly updated","Edit",JOptionPane.INFORMATION_MESSAGE);
                tEnbl(false);
                btnSub.setEnabled(false);
                btnedit.setEnabled(true);
                btnDel.setEnabled(true);
                
            }
            catch(Exception e){
                   // System.out.println(e);
                }
             
         }
     }
    
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
       int result = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?", "Delete",JOptionPane.YES_NO_OPTION);
                int nid= Integer.parseInt(bk1.getText());
        if(result==0){
            
            try{
                Connection con = DB.createConnection();
                Statement stmt = con.createStatement();
                stmt.executeUpdate("delete from book_data WHERE id='"+nid+"'"); 
                JOptionPane.showMessageDialog(this,"Recode sucsesfuly deleted","Delete",JOptionPane.INFORMATION_MESSAGE);
                c.clMt();
                this.dispose();
            }
            catch(Exception e){
            
            }
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
                tEnbl(true);
                btnSub.setEnabled(true);
                btnedit.setEnabled(false);
                btnDel.setEnabled(false);
                btnokcan.setText("Cancel");
                bk5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adventure", "Antiques & Collectibles", "Architecture", "Art", "Bibles", "Biography & Autobiography", "Business & Economics", "Comics & Graphic Novels", "Computers", "Cooking", "Crafts & Hobbies", "Design", "Drama", "Education", "Encyclopedia", "Erotic", "Esotericism", "Essay", "Fairy Tale", "Family & Relationships", "Fantasy", "Fiction", "Foreign Language Study", "Games", "Gardening", "Health & Fitness", "History", "Horror", "House & Home", "Humor", "Juvenile Fiction", "Juvenile Nonfiction", "Language & Literature", "Law", "Letters", "Literary Collections", "Literary Criticism", "Mathematics", "Medical", "Music", "Mystery & Crime", "Nature", "Performing Arts", "Pets", "Philosophy", "Photography", "Poetry", "Political Science", "Psychology", "Religion", "Romance", "Satire", "Science", "Science Fiction", "Self-Help", "Short Story", "Social Science", "Sports & Recreation", "Study Aids", "Technology & Engineering", "Thriller", "Transportation", "Travel", "True Crime" }));
                for(int i=0;i<bk5.getItemCount();i++){   
                    if(bk5.getItemAt(i).toString().equals(si)){
                        bk5.setSelectedIndex(i);
                        break;
                    }
                }    
    }//GEN-LAST:event_btneditActionPerformed

    private void bk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk5ActionPerformed

    private void bk5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bk5ItemStateChanged
       
    }//GEN-LAST:event_bk5ItemStateChanged

    private void bk5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bk5MouseClicked
       
    }//GEN-LAST:event_bk5MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnokcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokcanActionPerformed
        if(btnokcan.getText().equals("Cancel")){
            if(btnSub.getText().equals("Submit")){
                this.dispose();
            }    
            else{
                btnokcan.setText("  OK   ");
                tEnbl(false);
                btnSub.setEnabled(false);
                btnedit.setEnabled(true);
                btnDel.setEnabled(true);
            }
        }
        else{
            this.dispose();
        }

    }//GEN-LAST:event_btnokcanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Regbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Regbook dialog = new Regbook(new javax.swing.JFrame(), true,false);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bk1;
    private javax.swing.JFormattedTextField bk10;
    private javax.swing.JFormattedTextField bk11;
    private javax.swing.JFormattedTextField bk2;
    private javax.swing.JFormattedTextField bk3;
    private javax.swing.JFormattedTextField bk4;
    private javax.swing.JComboBox bk5;
    private javax.swing.JFormattedTextField bk6;
    private javax.swing.JFormattedTextField bk7;
    private javax.swing.JFormattedTextField bk8;
    private javax.swing.JFormattedTextField bk9;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnokcan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
