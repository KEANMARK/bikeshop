/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpage;
import myfirstja.logi1;
import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class setting extends javax.swing.JInternalFrame {

    /**
     * Creates new form settingspage
     */
    public setting() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
BasicInternalFrameUI ip = (BasicInternalFrameUI)this.getUI();
ip.setNorthPane(null);
        setSize(800,420);
    }
  Color navcolor = new Color(102,0,255);
    Color headercolor = new Color(51,255,204);
    Color bodycolor = new Color(204,204,255);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        manager = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(760, 420));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONSFOLDER/icons8-username-100.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERNAME");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel12);
        jPanel12.setBounds(580, 10, 150, 140);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("EMAIL:");
        jPanel3.add(jLabel48);
        jLabel48.setBounds(70, 90, 50, 20);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel49.setText("ACCOUNT SETTINGS");
        jPanel3.add(jLabel49);
        jLabel49.setBounds(10, 10, 200, 20);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("ACCOUNT NAME:");
        jPanel3.add(jLabel50);
        jLabel50.setBounds(10, 40, 120, 30);

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("ADDRESS:");
        jPanel3.add(jLabel51);
        jLabel51.setBounds(310, 80, 70, 20);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("POSITION:");
        jPanel3.add(jLabel52);
        jLabel52.setBounds(310, 40, 70, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(380, 80, 180, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel3.add(jTextField2);
        jTextField2.setBounds(120, 40, 180, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(380, 40, 180, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(120, 90, 180, 30);

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));
        jPanel11.setLayout(null);

        logout.setBackground(new java.awt.Color(102, 153, 255));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText(" LOG OUT");
        logout.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 20));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONSFOLDER/icons8-log-out-100.png"))); // NOI18N
        logout.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 130));

        jPanel11.add(logout);
        logout.setBounds(460, 30, 190, 160);

        manager.setBackground(new java.awt.Color(102, 153, 255));
        manager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managerMouseExited(evt);
            }
        });
        manager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("EDIT PROFILE");
        manager.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONSFOLDER/icons8-writer-male-100.png"))); // NOI18N
        manager.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 130));

        jPanel11.add(manager);
        manager.setBounds(150, 30, 190, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(bodycolor);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(navcolor);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseExited

    private void managerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerMouseEntered
        manager.setBackground(bodycolor);        // TODO add your handling code here:
    }//GEN-LAST:event_managerMouseEntered

    private void managerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerMouseExited
        manager.setBackground(navcolor);        // TODO add your handling code here:
    }//GEN-LAST:event_managerMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
JFrame mainFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
mainFrame.dispose();
logi1 l=new logi1();
l.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel manager;
    // End of variables declaration//GEN-END:variables

    private static class loginpage {

        public loginpage() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class loginform {

        public loginform() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
