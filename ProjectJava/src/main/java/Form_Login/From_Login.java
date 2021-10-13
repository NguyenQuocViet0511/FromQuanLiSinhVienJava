/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form_Login;

import Hiberneat.User.User;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class From_Login extends javax.swing.JFrame {

    /**
     * Creates new form From_Login
     */
    private User user = new User();

    ;

    public From_Login() {
        initComponents();
        check();
        setSize(1285, 860);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnSignin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        checkboxRemember = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        btnforget = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_user_20px_3.png"));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 330, 20, 20);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtUserName);
        txtUserName.setBounds(520, 330, 290, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(520, 380, 290, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_lock_20px_1.png"));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 390, 20, 20);

        btnSignin.setBackground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Sign In");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignin);
        btnSignin.setBounds(520, 470, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(610, 240, 110, 60);

        checkboxRemember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkboxRemember.setMaximumSize(new java.awt.Dimension(14, 15));
        checkboxRemember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkboxRememberMouseClicked(evt);
            }
        });
        checkboxRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxRememberActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxRemember);
        checkboxRemember.setBounds(520, 430, 17, 15);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Remember me");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 423, 110, 30);

        btnsignup.setBackground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup);
        btnsignup.setBounds(720, 470, 90, 30);

        btnforget.setForeground(new java.awt.Color(255, 255, 255));
        btnforget.setText("Forget Password");
        btnforget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnforget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnforgetMouseClicked(evt);
            }
        });
        getContentPane().add(btnforget);
        btnforget.setBounds(710, 423, 110, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_user_group_100px.png"));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(610, 170, 110, 70);

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\ProjectJava\\src\\main\\java\\img\\hinh-nen-toi-cho-dien-thoai-dep.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1280, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxRememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxRememberActionPerformed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained

    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained

    }//GEN-LAST:event_txtPasswordFocusGained

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        if (txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng Không Được Để Trống");
        } else {
            LoadDate();
            if (checklogin()) {
                if (checkTrangThai()) {
                    Form_Main formMain = new Form_Main();
                    formMain.beckLogin = true;
                    checkRemeber();
                    formMain.show();
                    this.hide();

                } else {
                    JOptionPane.showMessageDialog(this, "Tài Khoản Đang Bị khóa Vui lòng liên Hệ Admin ");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Sai Tên Tài Khoản Hoặc Mật Khẩu");
            }

        }

    }//GEN-LAST:event_btnSigninActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoadDate();
            if (checklogin()) {
                if (checkTrangThai()) {
                    Form_Main formMain = new Form_Main();
                    formMain.beckLogin = true;

                    formMain.show();
                    this.hide();

                } else {
                    JOptionPane.showMessageDialog(this, "Tài Khoản Đang Bị khóa Vui lòng liên Hệ Admin ");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Sai Tên Tài Khoản Hoặc Mật Khẩu");
            }

        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoadDate();
            if (checklogin()) {
                if (checkTrangThai()) {
                    Form_Main formMain = new Form_Main();
                    formMain.beckLogin = true;

                    formMain.show();
                    this.hide();

                } else {
                    JOptionPane.showMessageDialog(this, "Tài Khoản Đang Bị khóa Vui lòng liên Hệ Admin ");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Sai Tên Tài Khoản Hoặc Mật Khẩu");
            }

        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void btnforgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnforgetMouseClicked
        Form_ForgetPassword forgetPassword = new Form_ForgetPassword();
        forgetPassword.Window();

    }//GEN-LAST:event_btnforgetMouseClicked

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        Form_DangKyUser dangKyUser = new Form_DangKyUser();
        dangKyUser.LoadWindow();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void checkboxRememberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkboxRememberMouseClicked


    }//GEN-LAST:event_checkboxRememberMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private boolean checklogin() {
        for (int i = 0; i < Const.ListUser.size(); i++) {
            String UserName = txtUserName.getText();
            String Password = txtPassword.getText();
            String Position;
            if (Const.ListUser.get(i).getUserName().equals(UserName) && Const.ListUser.get(i).getPassword().equals(Password)) {
                Const.user = Const.ListUser.get(i);
                Const.userRemember = Const.user;
                return true;
            }

        }

        return false;

    }

    public void Remember() {
        if (Const.Checkremeber == true) {
            checkboxRemember.setSelected(true);

        } else {
            checkboxRemember.setSelected(false);

        }

    }

    private void checkRemeber() {
        if (checkboxRemember.isSelected() == true) {
            Const.Checkremeber = true;
        } else {
            Const.Checkremeber = false;
        }
    }

    public void check() {
        if (checkboxRemember.isSelected() == true) {
            txtUserName.setText(Const.userRemember.getUserName());
            txtPassword.setText(Const.userRemember.getPassword());
        } else {

            txtUserName.setText("");
            txtPassword.setText("");
        }
    }

    private boolean checkTrangThai() {
        for (int i = 0; i < Const.ListUser.size(); i++) {
            String UserName = txtUserName.getText();
            String Password = txtPassword.getText();
            if (Const.ListUser.get(i).getUserName().equals(UserName) && Const.ListUser.get(i).getPassword().equals(Password) && Const.ListUser.get(i).getTrangThai().equals("Bình Thường")) {

                return true;
            }

        }

        return false;

    }

    private void LoadDate() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(From_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new From_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin;
    private javax.swing.JLabel btnforget;
    private javax.swing.JButton btnsignup;
    private javax.swing.JCheckBox checkboxRemember;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
