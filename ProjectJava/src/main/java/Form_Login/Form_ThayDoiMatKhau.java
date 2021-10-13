/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form_Login;

import Hiberneat.User.User;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Form_ThayDoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form Form_ThayDoiMatKhau
     */
    public Form_ThayDoiMatKhau() {
        initComponents();
         window();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmatkhaucu = new javax.swing.JPasswordField();
        txtnhaplaimatkhau = new javax.swing.JPasswordField();
        txtmaykhaumoi = new javax.swing.JPasswordField();
        checkdoimatkhau = new javax.swing.JCheckBox();
        btnhuybo = new javax.swing.JButton();
        btnthaydoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 100, 610, 14);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_hotel_room_key_50px.png"));
        jLabel1.setText("Thay Đổi Mật khẩu Của Bạn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 89);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nhập Mật Khẩu Cũ :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 160, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nhập Lại Mật Khẩu :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 140, 160, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nhập Mật Khẩu Mới :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 80, 160, 29);
        jPanel2.add(txtmatkhaucu);
        txtmatkhaucu.setBounds(180, 20, 380, 30);
        jPanel2.add(txtnhaplaimatkhau);
        txtnhaplaimatkhau.setBounds(180, 140, 380, 30);
        jPanel2.add(txtmaykhaumoi);
        txtmaykhaumoi.setBounds(180, 80, 380, 30);

        checkdoimatkhau.setText("Hiện Mật Khẩu");
        checkdoimatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkdoimatkhauMouseClicked(evt);
            }
        });
        jPanel2.add(checkdoimatkhau);
        checkdoimatkhau.setBounds(180, 180, 110, 23);

        btnhuybo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_cross_mark_20px.png"));
        btnhuybo.setText("hủy bỏ");
        btnhuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyboActionPerformed(evt);
            }
        });
        jPanel2.add(btnhuybo);
        btnhuybo.setBounds(430, 220, 130, 30);

        btnthaydoi.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_change_20px_1.png"));
        btnthaydoi.setText("Thay Đổi");
        btnthaydoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthaydoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnthaydoi);
        btnthaydoi.setBounds(180, 220, 130, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 110, 580, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyboActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnhuyboActionPerformed

    private void btnthaydoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthaydoiActionPerformed
      int optision =   JOptionPane.showConfirmDialog(this, "Bạn có muốn Thay Đổi Mật Khẩu không");
      if(optision == 0)
      {
        ChangePassword();
      }
      else
      {
          
      }
        
    }//GEN-LAST:event_btnthaydoiActionPerformed

    private void checkdoimatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkdoimatkhauMouseClicked
      if(checkdoimatkhau.isSelected())
      {
          txtmaykhaumoi.setEchoChar((char)0);
          txtnhaplaimatkhau.setEchoChar((char)0);
      }
      else
      {
            txtmaykhaumoi.setEchoChar('*');
          txtnhaplaimatkhau.setEchoChar('*');
      }
    }//GEN-LAST:event_checkdoimatkhauMouseClicked

    /**
     * @param args the command line arguments
     */
   
    private void ChangePassword()
    {
        User  user = Const.user;
        if(txtmatkhaucu.getText().isEmpty() || txtmaykhaumoi.getText().isEmpty() || txtnhaplaimatkhau.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Không Được Để Trống Vui Lòng Nhập Vô");
        }
        else
        {
          if(txtmatkhaucu.getText().equals(user.getPassword()))
        {
            if(txtmaykhaumoi.getText().equals(txtnhaplaimatkhau.getText()))
            {
                User ChangePassword = Const.session.get(User.class,user.getId());
                ChangePassword.setPassword(txtmaykhaumoi.getText());
                Const.session.getTransaction().begin();
                Const.session.save(ChangePassword);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Thay Đổi Thành Công");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Nhập Lại Mật Khẩu Không Giống Nhau");
            }
        }
          else
          {
             JOptionPane.showMessageDialog(this, "Mật Khẩu Cũ Sai Vui Lòng Thử Lại"); 
          }
        }
      
    }
    private void window()
    {
        setSize(625, 465);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhuybo;
    private javax.swing.JButton btnthaydoi;
    private javax.swing.JCheckBox checkdoimatkhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtmatkhaucu;
    private javax.swing.JPasswordField txtmaykhaumoi;
    private javax.swing.JPasswordField txtnhaplaimatkhau;
    // End of variables declaration//GEN-END:variables
}