/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form_Login;

import Hiberneat.User.User;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import net.bytebuddy.utility.RandomString;

/**
 *
 * @author admin
 */
public class Form_DangKyUser extends javax.swing.JFrame {

    /**
     * Creates new form Form_UpdateUser
     *
     */
    private String CheckCode;
    private String randomCode;

    public Form_DangKyUser() {

        initComponents();

    }

    private boolean checkCode() {

        if (txtverycode.getText().equals(CheckCode)) {
            return true;
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPDKTK = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        txtHoveTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTendangnhap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        rdnnu = new javax.swing.JRadioButton();
        rdnnam = new javax.swing.JRadioButton();
        txtmatkhau1 = new javax.swing.JPasswordField();
        txtnhaplaimatkhau = new javax.swing.JPasswordField();
        jcombonam = new javax.swing.JComboBox<>();
        jcombongay = new javax.swing.JComboBox<>();
        jcombothang = new javax.swing.JComboBox<>();
        btndangky = new javax.swing.JButton();
        btnhuybo = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cknCheckCreate = new javax.swing.JCheckBox();
        JPDKTCode = new javax.swing.JPanel();
        jTextPane3 = new javax.swing.JTextPane();
        jTextPane2 = new javax.swing.JTextPane();
        btncode = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtverycode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(null);

        JPDKTK.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));
        JPDKTK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPDKTK.setLayout(null);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Họ Và Tên");
        jPanel6.add(jLabel4);

        jPanel5.add(jPanel6);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Email");
        jPanel9.add(jLabel13);

        jPanel5.add(jPanel9);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Tên Đăng Nhập");
        jPanel8.add(jLabel9);

        jPanel5.add(jPanel8);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mật Khẩu");
        jPanel7.add(jLabel5);

        jPanel5.add(jPanel7);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nhập Lại Mật Khẩu");
        jPanel4.add(jLabel3);

        jPanel5.add(jPanel4);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Ngày Sinh");
        jPanel14.add(jLabel14);

        jPanel5.add(jPanel14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Giới Tính");
        jPanel12.add(jLabel11);

        jPanel5.add(jPanel12);

        JPDKTK.add(jPanel5);
        jPanel5.setBounds(10, 30, 230, 290);

        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.Y_AXIS));

        jPanel21.setAlignmentX(15.0F);
        jPanel21.setLayout(null);

        txtHoveTen.setAlignmentY(0.0F);
        jPanel21.add(txtHoveTen);
        txtHoveTen.setBounds(10, 10, 410, 30);

        txtEmail.setAlignmentY(0.0F);
        jPanel21.add(txtEmail);
        txtEmail.setBounds(10, 50, 410, 30);

        txtTendangnhap.setAlignmentY(0.0F);
        jPanel21.add(txtTendangnhap);
        txtTendangnhap.setBounds(10, 90, 410, 30);

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        jPanel21.add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 410, 110);

        rdnnu.setText("Nữ");
        jPanel21.add(rdnnu);
        rdnnu.setBounds(110, 260, 170, 23);

        rdnnam.setText("Nam");
        rdnnam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rdnnamMouseReleased(evt);
            }
        });
        jPanel21.add(rdnnam);
        rdnnam.setBounds(10, 260, 110, 23);
        jPanel21.add(txtmatkhau1);
        txtmatkhau1.setBounds(10, 130, 410, 30);
        jPanel21.add(txtnhaplaimatkhau);
        txtnhaplaimatkhau.setBounds(10, 170, 410, 30);

        jcombonam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", " " }));
        jcombonam.setAlignmentX(0.0F);
        jcombonam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombonamActionPerformed(evt);
            }
        });
        jPanel21.add(jcombonam);
        jcombonam.setBounds(220, 220, 70, 30);

        jcombongay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " ", " ", " " }));
        jcombongay.setAlignmentX(0.0F);
        jcombongay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombongayActionPerformed(evt);
            }
        });
        jPanel21.add(jcombongay);
        jcombongay.setBounds(10, 220, 60, 30);

        jcombothang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jcombothang.setAlignmentX(0.0F);
        jcombothang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombothangActionPerformed(evt);
            }
        });
        jPanel21.add(jcombothang);
        jcombothang.setBounds(110, 220, 60, 30);

        jPanel13.add(jPanel21);

        JPDKTK.add(jPanel13);
        jPanel13.setBounds(240, 20, 430, 430);

        btndangky.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_checkmark_20px_1.png"));
        btndangky.setText("Đăng Ký");
        btndangky.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        btndangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangkyActionPerformed(evt);
            }
        });
        JPDKTK.add(btndangky);
        btndangky.setBounds(250, 500, 140, 30);

        btnhuybo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_cross_mark_20px.png"));
        btnhuybo.setText("Hủy Bỏ");
        btnhuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyboActionPerformed(evt);
            }
        });
        JPDKTK.add(btnhuybo);
        btnhuybo.setBounds(520, 500, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Địa Chỉ");
        jPanel11.add(jLabel12);

        JPDKTK.add(jPanel11);
        jPanel11.setBounds(10, 330, 230, 50);

        cknCheckCreate.setText("Chấp Nhận Thỏa Thuận");
        JPDKTK.add(cknCheckCreate);
        cknCheckCreate.setBounds(250, 450, 160, 23);

        getContentPane().add(JPDKTK);
        JPDKTK.setBounds(10, 106, 720, 550);

        JPDKTCode.setBackground(new java.awt.Color(255, 255, 255));
        JPDKTCode.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""))));
        JPDKTCode.setLayout(null);

        jTextPane3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextPane3.setText("Please Enter the  Code you were sent by Email");
        jTextPane3.setToolTipText("");
        jTextPane3.setEnabled(false);
        JPDKTCode.add(jTextPane3);
        jTextPane3.setBounds(190, 160, 360, 60);

        jTextPane2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jTextPane2.setText("Enter Your Code ");
        jTextPane2.setEnabled(false);
        JPDKTCode.add(jTextPane2);
        jTextPane2.setBounds(190, 120, 360, 100);

        btncode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncode.setText("Verify Code");
        btncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncodeActionPerformed(evt);
            }
        });
        JPDKTCode.add(btncode);
        btncode.setBounds(190, 350, 360, 38);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("src\\main\\java\\img\\icons8_send_email_20px.png"));
        jPanel10.add(jLabel6);
        jLabel6.setBounds(20, 17, 30, 20);

        txtverycode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtverycode.setText("Code");
        txtverycode.setBorder(null);
        txtverycode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtverycodeMouseClicked(evt);
            }
        });
        jPanel10.add(txtverycode);
        txtverycode.setBounds(60, 1, 295, 45);

        JPDKTCode.add(jPanel10);
        jPanel10.setBounds(190, 260, 360, 50);

        jLabel2.setText("Vui Lòng Nhập Code Được Gửi Tới Email Để Hoàn Thành Đăng Ký");
        JPDKTCode.add(jLabel2);
        jLabel2.setBounds(20, 10, 380, 20);

        getContentPane().add(JPDKTCode);
        JPDKTCode.setBounds(10, 110, 720, 540);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Đăng Ký Tài Khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 749, 88);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyboActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnhuyboActionPerformed

    private void rdnnamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdnnamMouseReleased
        rdnnam.setSelected(true);
        rdnnu.setSelected(false);
    }//GEN-LAST:event_rdnnamMouseReleased

    private void btndangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangkyActionPerformed
        if (txtHoveTen.getText().isEmpty() || txtEmail.getText().isEmpty() || txtTendangnhap.getText().isEmpty() || txtmatkhau1.getText().isEmpty() || txtnhaplaimatkhau.getText().isEmpty()
                || txtdiachi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng Nhập Đầy Đủ không Để Trống");
        } else {
            if (cknCheckCreate.isSelected()) {
                if (ChecktypeMail()) {
                    if (CheckUserName()) {
                          JOptionPane.showMessageDialog(this, "Tài Khoản  Này Đã Tồn Tại Vui Lòng Thử Lại Tài Khoản  Khác");
                    } else {
                        if (txtmatkhau1.getText().equals(txtnhaplaimatkhau.getText())) {
                            if (CheckEMail()) {
                                JOptionPane.showMessageDialog(this, "Email Này Đã Tồn Tại Vui Lòng Thử Lại  Email Khác");
                            } else {

                                if (checkSendMail()) {
                                    JPDKTCode.show();
                                    JPDKTK.hide();
                                }

                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Mật Khẩu Không Giống Nhau Vui Lòng Nhập Lại");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Email Không Đúng Định Dạng Vui Lòng Thử lại");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Bạn Chưa Chấp Nhận Thỏa Thuận");
            }
        }


    }//GEN-LAST:event_btndangkyActionPerformed

    private void btncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncodeActionPerformed
        if (txtverycode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng Nhập Vào Mã Code Được Gửi đến Email Của Bạn");
        } else {
            if (checkCode()) {
                User user = new User();
                user.setHovaTen(txtHoveTen.getText());
                user.setEmail(txtEmail.getText());
                user.setUserName(txtTendangnhap.getText());
                user.setPassword(txtmatkhau1.getText());
                user.setQuyen("User");
                user.setTrangThai("Bình Thường");
                String NgaySinh = jcombonam.getSelectedItem() + "-" + jcombothang.getSelectedItem() + "-" + jcombongay.getSelectedItem();
                user.setNgaySinh(java.sql.Date.valueOf(NgaySinh));
                if (rdnnam.isSelected()) {
                    user.setGioitinh("Nam");
                } else {
                    user.setGioitinh("Nữ");
                }
                user.setDiaChi(txtdiachi.getText());

                Const.session.getTransaction().begin();
                Const.session.save(user);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Đăng Ký Thành Công");
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Code Bạn Nhập Sai Vui lòng Nhập Lại");
            }
        }
    }//GEN-LAST:event_btncodeActionPerformed

    private void txtverycodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtverycodeMouseClicked
        txtverycode.setText("");
    }//GEN-LAST:event_txtverycodeMouseClicked

    private void jcombonamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombonamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombonamActionPerformed

    private void jcombongayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombongayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombongayActionPerformed

    private void jcombothangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombothangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombothangActionPerformed
    private boolean CheckEMail() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        String Email = txtEmail.getText();
        for (int i = 0; i < Const.ListUser.size(); i++) {

            if (Email.equals(Const.ListUser.get(i).getEmail())) {

                return true;
            }

        }
        return false;
    }

    private boolean ChecktypeMail() {
        Pattern Check = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Email = txtEmail.getText();
        if (Check.matcher(Email).find()) {

            return true;

        }

        return false;
    }

    private boolean checkSendMail() {
        RandomString random = new RandomString(6);
        randomCode = random.nextString();
        final String fromEmail = "thuykieunguyen310@gmail.com"; //Email Gửi
//      final String Password = "etqhxcumxrodcatq"; //MK Ung Dung(etqhxcumxrodcatq)
        final String toEmail = txtEmail.getText();
        final String subject = "Create New Account";
        final String message = "Your Create New Code is " + randomCode;

        MimeMessage msg = new MimeMessage(Const.SessionEMail);
        try {
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            try {
                msg.setFrom(new InternetAddress(fromEmail, "NoReply-JD"));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Form_ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
            msg.setReplyTo(InternetAddress.parse(fromEmail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(message, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
            CheckCode = randomCode;
            return true;

        } catch (MessagingException ex) {
            Logger.getLogger(Form_ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    private boolean CheckUserName() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        Vector<Object> CheckuserName = new Vector<>();;
        for (int i = 0; i < Const.ListUser.size(); i++) {

            CheckuserName.add(Const.ListUser.get(i).getUserName());
        }
        for (int i = 0; i < CheckuserName.size(); i++) {
            if (txtTendangnhap.getText().equals(CheckuserName.get(i))) {
                return true;
            }

        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPDKTCode;
    private javax.swing.JPanel JPDKTK;
    private javax.swing.JButton btncode;
    private javax.swing.JButton btndangky;
    private javax.swing.JButton btnhuybo;
    private javax.swing.JCheckBox cknCheckCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JComboBox<String> jcombonam;
    private javax.swing.JComboBox<String> jcombongay;
    private javax.swing.JComboBox<String> jcombothang;
    private javax.swing.JRadioButton rdnnam;
    private javax.swing.JRadioButton rdnnu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoveTen;
    private javax.swing.JTextField txtTendangnhap;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JPasswordField txtmatkhau1;
    private javax.swing.JPasswordField txtnhaplaimatkhau;
    private javax.swing.JTextField txtverycode;
    // End of variables declaration//GEN-END:variables

    public void LoadWindow() {
        JPDKTCode.hide();
        setSize(760, 720);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

    }
}
