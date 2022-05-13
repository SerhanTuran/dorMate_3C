package Start;


import deneme.Profile;
import deneme.User;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class StartEditPreferences extends javax.swing.JFrame {

    DatabaseHandler handler = null;
    static int userid;
    User p = null;
    public StartEditPreferences(int userID) {
        
        userid = userID;
        handler = DatabaseHandler.getInstance();
        p = handler.makeUser(userid);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bedTime = new javax.swing.JComboBox<>();
        kitchen = new javax.swing.JComboBox<>();
        phone = new javax.swing.JComboBox<>();
        games = new javax.swing.JComboBox<>();
        study = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Bed Time:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Kitchen:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Phone Calls");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Playing Games:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Studying:");

        bedTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Before 10.00 PM", "Between 10.00 - 12.00", "After Midnight"}));
        bedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedTimeActionPerformed(evt);
            }
        });

        kitchen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I generally eat in the room", "I generally use the dorm's kitchen", "I don't eat in the dorm"}));
        kitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenActionPerformed(evt);
            }
        });

        phone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I go out when my phone rings", "I may have short meetings in the room", "I always have my calls in the room"}));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        games.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"I don't like playing video games", "I rarely play games", "I always play games" }));
        games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesActionPerformed(evt);
            }
        });

        study.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I never use room for studying", "Only in exam weeks", "I always study in the room" }));
        study.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(games, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitchen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(study, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(study, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("DorMate");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedTimeActionPerformed
        String bedTimeS = bedTime.getSelectedItem().toString();                                            
        if(bedTimeS.equals("Before 10.00 PM"))
        {
            p.setBedTime(0);
        }
        else if(bedTimeS.equals("Between 10.00 - 12.00"))
        {
            p.setBedTime(1);
        }
        else if(bedTimeS.equals("After Midnight"))
        {
            p.setBedTime(2);
        }
    }//GEN-LAST:event_bedTimeActionPerformed

    private void gamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesActionPerformed
        String playingGamesS = games.getSelectedItem().toString();                                            
        if(playingGamesS.equals("I don't like playing video games"))
        {
            p.setGamingFrequency(0);
            
        }
        else if(playingGamesS.equals("I rarely play games"))
        {
            p.setGamingFrequency(1);
        }
        else if(playingGamesS.equals("I always play games"))
        {
            p.setGamingFrequency(2);
        }
    }//GEN-LAST:event_gamesActionPerformed

    private void kitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitchenActionPerformed
                String eatingChooserS = kitchen.getSelectedItem().toString();
        if(eatingChooserS.equals("I don't eat in the dorm"))
        {
            p.setEatingFrequency(0);
        }
        else if(eatingChooserS.equals("I generally use the dorm's kitchen"))
        {
            p.setEatingFrequency(1);
        }
        else if(eatingChooserS.equals("I generally eat in the room"))
        {
            p.setEatingFrequency(2);
        }
    }//GEN-LAST:event_kitchenActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
                String phoneCallS = phone.getSelectedItem().toString();
        if(phoneCallS.equals("I go out when my phone rings"))
        {
            p.setPhonecall(0);
        }
        else if(phoneCallS.equals("I may have short meetings in the room"))
        {
            p.setPhonecall(1);
        }
        else if(phoneCallS.equals("I always have my calls in the room"))
        {
            p.setPhonecall(2);
        }
    }//GEN-LAST:event_phoneActionPerformed

    private void studyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyActionPerformed
        String studyingS = study.getSelectedItem().toString();
        if(studyingS.equals("I never use room for studying"))
        {
            p.setStudyFrequency(0);
            JOptionPane.showMessageDialog(null, "Successfully signed up!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(studyingS.equals("Only in exam weeks"))
        {
            p.setStudyFrequency(1);
        }
        else if(studyingS.equals("I always study in the room"))
        {
            p.setStudyFrequency(2);
        }
    }//GEN-LAST:event_studyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        handler.insertPreferences(userid,p.getPrefereces()[0], p.getPrefereces()[2], p.getPrefereces()[1], p.getPrefereces()[3], p.getPrefereces()[4]);
        Profile prof = new Profile(userid);
        prof.pack();
        prof.setLocationRelativeTo(null);
        prof.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StartEditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartEditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartEditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartEditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartEditPreferences(userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bedTime;
    private javax.swing.JComboBox<String> games;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> kitchen;
    private javax.swing.JComboBox<String> phone;
    private javax.swing.JComboBox<String> study;
    // End of variables declaration//GEN-END:variables
}
