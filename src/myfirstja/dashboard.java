package myfirstja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myfirstja.dashboard;
import java.awt.Color;
import internalpage.*;
import internalpage.dashboardpage;
import javax.swing.JOptionPane;
/**
 *
 * @author SCC COMPLAB
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
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

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        reports = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashpane1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dashpane2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userpage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        H = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        acc1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maindesk = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(102, 0, 255));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reports.setBackground(new java.awt.Color(102, 0, 255));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTS");
        reports.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 30));

        navbar.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 50));

        dashpane1.setBackground(new java.awt.Color(102, 0, 255));
        dashpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpane1MouseExited(evt);
            }
        });
        dashpane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DASHBOARD");
        dashpane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 30));

        navbar.add(dashpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 50));

        dashpane2.setBackground(new java.awt.Color(0, 153, 153));
        dashpane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpane2MouseExited(evt);
            }
        });
        dashpane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");
        dashpane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 30));

        navbar.add(dashpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 50));

        userpage.setBackground(new java.awt.Color(102, 0, 255));
        userpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpageMouseExited(evt);
            }
        });
        userpage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER PAGE");
        userpage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 30));

        navbar.add(userpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, 50));

        H.setBackground(new java.awt.Color(102, 0, 255));
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HMouseExited(evt);
            }
        });
        H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HELP?");
        H.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 30));

        navbar.add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, 50));

        acc1.setBackground(new java.awt.Color(102, 0, 255));
        acc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acc1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acc1MouseExited(evt);
            }
        });
        acc1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ACCOUNTS");
        acc1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 30));

        navbar.add(acc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 120, 50));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 120, 470);

        header.setBackground(new java.awt.Color(51, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("welcome to Mountain Bike parts and accessories ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("with original parts");

        mini.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mini.setText("-");
        mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(144, 144, 144)
                .addComponent(mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close)
                .addGap(25, 25, 25))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mini))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(close)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(header);
        header.setBounds(120, 0, 780, 70);

        maindesk.setBackground(new java.awt.Color(204, 204, 255));
        maindesk.setPreferredSize(new java.awt.Dimension(760, 420));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONSFOLDER/Mountain-Bike-Transparent-Free-PNG.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONSFOLDER/244b1748245061ab00ee9070f29ed281.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        maindesk.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        maindesk.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout maindeskLayout = new javax.swing.GroupLayout(maindesk);
        maindesk.setLayout(maindeskLayout);
        maindeskLayout.setHorizontalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maindeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        maindeskLayout.setVerticalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maindeskLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(maindesk);
        maindesk.setBounds(120, 70, 780, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
  reports.setBackground(bodycolor);   
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
  reports.setBackground(navcolor);        
    }//GEN-LAST:event_reportsMouseExited

    private void dashpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseEntered
  dashpane1.setBackground(bodycolor);
    }//GEN-LAST:event_dashpane1MouseEntered

    private void dashpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseExited
dashpane1.setBackground(navcolor); // TODO add your handling code here:
    }//GEN-LAST:event_dashpane1MouseExited

    private void dashpane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane2MouseEntered

    private void dashpane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpane2MouseExited

    private void userpageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpageMouseEntered
  userpage.setBackground(bodycolor);
    }//GEN-LAST:event_userpageMouseEntered

    private void userpageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpageMouseExited
  userpage.setBackground(navcolor);        // TODO add your handling code here:
    }//GEN-LAST:event_userpageMouseExited

    private void userpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpageMouseClicked
   Orders g = new Orders();
   maindesk.add(g).setVisible(true);
    }//GEN-LAST:event_userpageMouseClicked

    private void dashpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseClicked
dashboardpage dbp = new dashboardpage();
maindesk.add(dbp).setVisible(true);// TODO adbpdd your handling code here:
    }//GEN-LAST:event_dashpane1MouseClicked

    private void HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseClicked
        //      userpage up = new userpage();
        //       up.setVisible(true);
    }//GEN-LAST:event_HMouseClicked

    private void HMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseEntered
        H.setBackground(bodycolor);
    }//GEN-LAST:event_HMouseEntered

    private void HMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseExited
        H.setBackground(navcolor);
    }//GEN-LAST:event_HMouseExited

    private void acc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseClicked
     setting dbp = new setting();
maindesk.add(dbp).setVisible(true); 
    }//GEN-LAST:event_acc1MouseClicked

    private void acc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseEntered
       acc1.setBackground(bodycolor);     // TODO add your handling code here:
    }//GEN-LAST:event_acc1MouseEntered

    private void acc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseExited
       acc1.setBackground(navcolor);    // TODO add your handling code here:
    }//GEN-LAST:event_acc1MouseExited

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        setState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a  = JOptionPane.showConfirmDialog(null,"confirm exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);}        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
    Reports dbp = new Reports();
    maindesk.add(dbp).setVisible(true);
    }//GEN-LAST:event_reportsMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel H;
    private javax.swing.JPanel acc1;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpane1;
    private javax.swing.JPanel dashpane2;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesk;
    private javax.swing.JLabel mini;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel userpage;
    // End of variables declaration//GEN-END:variables
}
