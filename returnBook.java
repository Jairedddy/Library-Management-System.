/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licensedefault.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Jframe.java to
edit this template
*/
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JoptionPane;
/**
 *
 * @author JAISHUK REDDY
 */
public class returnBook extends javax.swing.Jframe {
    /**
     * Creates new form returnBook
     */
    public returnBook() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the
     form.
     * WARNING: Do NOT modify this code. The content of this method is
     always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked”)
    // <editor-fold defaultstate=”collapsed” desc=”Generated Code”>
    private void initComponents() {
        jLabel1 = new javax.swing.Jlabel();
        jLabel2 = new javax.swing.Jlabel();
        jLabel3 = new javax.swing.Jlabel();
        jLabel4 = new javax.swing.Jlabel();
        jTextField1 = new javax.swing.JtextField();
        jTextField2 = new javax.swing.JtextField();
        jButton1 = new javax.swing.Jbutton();
        jButton2 = new javax.swing.Jbutton();
        jButton3 = new javax.swing.Jbutton();
        jTextField3 = new javax.swing.JtextField();
        jTextField4 = new javax.swing.JtextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setText("Book ID”);
        jLabel2.setText("Student ID”);
        jLabel3.setText("Issue Date”);
        jLabel4.setText("Due Date”);
        jButton1.setText("Return Book”);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("Close”);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setText("Search”);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new
                javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68,
                                                        Short.MAX_VALUE)

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2)
                                                        .addComponent(jTextField3)

                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String bookID = jTextField1.getText();
        String studentID = jTextField2.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from issue where bookID = '"+bookID+"' and studentID = '"+studentID+"'");
            if(rs.next()){
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
            }else{
                JoptionPane.showMessageDialog(null,"Incorrect Book ID or Student ID”);
                setVisible(false);
                new returnBook().setVisible(true);
            }
        }catch(Exception e){
            JoptionPane.showMessageDialog(null,”Exception caught : “ + e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String bookID = jTextField1.getText();
        String studentID = jTextField2.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();st.executeUpdate("update issue set returnBook = 'Yes' where studentID = '"+studentID+"' and bookID = '"+bookID+"'");
            JoptionPane.showMessageDialog(null,"Book returned Successfully”);
            setVisible(false);
            new returnBook().setVisible(true);
        }catch(Exception e){
            JoptionPane.showMessageDialog(null,"Exception caught : “ + e);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate=”collapsed” desc=” Look and feel
        setting code (optional) ">
 /* If Nimbus (introduced in Java SE 6) is not available, stay with
the default look and feel.
 * For details see
http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
 */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus”.equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);}
        });
    }
    // Variables declaration – do not modify
    private javax.swing.Jbutton jButton1;
    private javax.swing.Jbutton jButton2;
    private javax.swing.Jbutton jButton3;
    private javax.swing.Jlabel jLabel1;
    private javax.swing.Jlabel jLabel2;
    private javax.swing.Jlabel jLabel3;
    private javax.swing.Jlabel jLabel4;
    private javax.swing.JtextField jTextField1;
    private javax.swing.JtextField jTextField2;
    private javax.swing.JtextField jTextField3;
    private javax.swing.JtextField jTextField4;
    // End of variables declaration
}
