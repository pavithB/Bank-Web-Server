/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csacw;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPWord = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        txtPWord = new javax.swing.JPasswordField();
        lblUName = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmCusList = new javax.swing.JMenuItem();
        itmEmpLst = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmLogOut = new javax.swing.JMenuItem();
        itmLogin = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));

        lblPWord.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPWord.setText("PASSWORD :");

        txtUName.setToolTipText("");
        txtUName.setPreferredSize(new java.awt.Dimension(140, 32));
        txtUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNameActionPerformed(evt);
            }
        });

        txtPWord.setToolTipText("Enter your password");
        txtPWord.setPreferredSize(new java.awt.Dimension(140, 32));

        lblUName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblUName.setText("USER_NAME :");

        btnLogin.setText("LogIn");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        lblLogin.setText("XXXX BANK WEB SERVICE");

        jMenu1.setText("File");

        itmCusList.setText("Customer List");
        itmCusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCusListActionPerformed(evt);
            }
        });
        jMenu1.add(itmCusList);

        itmEmpLst.setText("Employee List");
        itmEmpLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEmpLstActionPerformed(evt);
            }
        });
        jMenu1.add(itmEmpLst);

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        jMenu1.add(itmExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MyAccount");

        itmLogOut.setText("LogOut");
        itmLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogOutActionPerformed(evt);
            }
        });
        jMenu2.add(itmLogOut);

        itmLogin.setText("LogIn");
        jMenu2.add(itmLogin);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblPWord, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUName, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(txtPWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPWord, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        checkLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void itmLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmLogOutActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        EmployeeList eList = new EmployeeList();
        eList.show(true);
        this.hide();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void itmEmpLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmpLstActionPerformed
        EmployeeList eList = new EmployeeList();
        eList.show(true);
        this.hide();
    }//GEN-LAST:event_itmEmpLstActionPerformed

    private void itmCusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCusListActionPerformed
        CustomerList customerList = new CustomerList();
        customerList.show(true);
        this.hide();
    }//GEN-LAST:event_itmCusListActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

    public void checkLogin(){
        if(txtUName.getText() == null ||txtPWord.getPassword().length == 0){
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        }
        else{
            String uName = txtUName.getText();
            String pWord = String.valueOf(txtPWord.getText());
            login(uName, pWord);
            CustomerList cList = new CustomerList();
            cList.show(true);
            this.hide();
        }
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogin;
    private javax.swing.JMenuItem itmCusList;
    private javax.swing.JMenuItem itmEmpLst;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmLogOut;
    private javax.swing.JMenuItem itmLogin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPWord;
    private javax.swing.JLabel lblUName;
    private javax.swing.JPasswordField txtPWord;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables

    private static boolean login(java.lang.String uName, java.lang.String pWord) {
        bankemployee.BankEmployee_Service service = new bankemployee.BankEmployee_Service();
        bankemployee.BankEmployee port = service.getBankEmployeePort();
        return port.login(uName, pWord);
    }
}
