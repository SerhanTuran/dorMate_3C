package deneme;

import Start.DatabaseHandler;
import chat.chat_server;
import static deneme.Profile.userId;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class EditPreferences extends javax.swing.JFrame {

    User p = null;
    
    static int userID;
    DatabaseHandler handler = null;
    public EditPreferences(int userid) {
        initComponents();
        userID = userid;
        handler = DatabaseHandler.getInstance();
        p = handler.makeUser(userID);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bedTime = new javax.swing.JLabel();
        eating = new javax.swing.JLabel();
        phoneCall = new javax.swing.JLabel();
        playingGames = new javax.swing.JLabel();
        studyingRoom = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        bedTimeChooser = new javax.swing.JComboBox<>();
        eatingChooser = new javax.swing.JComboBox<>();
        saveChanges = new javax.swing.JButton();
        playingGamesChooser = new javax.swing.JComboBox<>();
        studyingChooser = new javax.swing.JComboBox<>();
        phoneCallChooser = new javax.swing.JComboBox<>();
        cancelChanges = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        goProfile = new javax.swing.JButton();
        goEditing = new javax.swing.JButton();
        goOtherUsers = new javax.swing.JButton();
        goMessages = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bedTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bedTime.setText("Bed Time:");

        eating.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eating.setText("Eating in the Dorm:");

        phoneCall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneCall.setText("Having Phone Call in Room:");

        playingGames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playingGames.setText("Playing Games:");

        studyingRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studyingRoom.setText("Studying in Room:");

        title.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 51));
        title.setText("DorMate");

        bedTimeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Before 10.00 p.m", "Between 10.00 p.m - 00.00 a.m", "After 00.00 a.m" }));
        bedTimeChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedTimeChooserActionPerformed(evt);
            }
        });

        eatingChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I generally eat in the room.", "I generally use the dorm's kitchen.", "I never use dorm kitchen and room for eating." }));
        eatingChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eatingChooserActionPerformed(evt);
            }
        });

        saveChanges.setText("Save Changes");
        saveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesActionPerformed(evt);
            }
        });

        cancelChanges.setText("Cancel");
        cancelChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelChangesActionPerformed(evt);
            }
        });

        goProfile.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        goProfile.setText("Profile");
        goProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goProfileActionPerformed(evt);
            }
        });

        goEditing.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        goEditing.setText("Edit Preferences");
        goEditing.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                goEditingStateChanged(evt);
            }
        });
        goEditing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goEditingActionPerformed(evt);
            }
        });

        goOtherUsers.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        goOtherUsers.setText("Other Users");
        goOtherUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goOtherUsersActionPerformed(evt);
            }
        });

        goMessages.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        goMessages.setText("Messages");
        goMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goMessagesActionPerformed(evt);
            }
        });

        playingGamesChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I don't like playing video games.",  "I rarely play games.", "I am addicted to computer games."}));
        playingGamesChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playingGamesChooserActionPerformed(evt);
            }
        });

        studyingChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I never use the room for studying.", "Only in exam weeks.", "I always study in the room (I prefer a silent room)." }));
        studyingChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyingChooserActionPerformed(evt);
            }
        });

        phoneCallChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I go out when my phone rings.", "I may have short meetings in the room.", "I always have my phonecalls in the room." }));
        phoneCallChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneCallChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelChanges)
                                .addGap(34, 34, 34)
                                .addComponent(saveChanges)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(goProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(goEditing, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(goOtherUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(goMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phoneCall)
                                .addGap(26, 26, 26)
                                .addComponent(phoneCallChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playingGames)
                                .addGap(94, 94, 94)
                                .addComponent(playingGamesChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eating))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bedTimeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eatingChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studyingRoom)
                                .addGap(75, 75, 75)
                                .addComponent(studyingChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goEditing, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goOtherUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedTime)
                    .addComponent(bedTimeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eating, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eatingChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneCall)
                    .addComponent(phoneCallChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playingGames)
                    .addComponent(playingGamesChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studyingRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studyingChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelChanges)
                    .addComponent(saveChanges))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>                        

    protected void playingGamesChooserActionPerformed(ActionEvent evt) {
        String playingGamesS = playingGamesChooser.getSelectedItem().toString();                                            
        if(playingGamesS.equals("I don't like playing video games."))
        {
            p.setGamingFrequency(0);
            
        }
        else if(playingGamesS.equals("I rarely play games."))
        {
            p.setGamingFrequency(1);
        }
        else if(playingGamesS.equals("I am addicted to computer games."))
        {
            p.setGamingFrequency(2);
        }
    }

    private void bedTimeChooserActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String bedTimeS = bedTimeChooser.getSelectedItem().toString();                                             
        if(bedTimeS.equals("Before 10.00 p.m"))
        {
            p.setBedTime(0);
            
        }
        else if(bedTimeS.equals("Between 10.00 p.m - 00.00 a.m"))
        {
            p.setBedTime(1);
        }
        else if(bedTimeS.equals("After 00.00 a.m"))
        {
            p.setBedTime(2);
        }
    }                                              

    private void eatingChooserActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String eatingChooserS = eatingChooser.getSelectedItem().toString(); 
        if(eatingChooserS.equals("I never use dorm kitchen and room for eating."))
        {
            p.setEatingFrequency(0);
        }
        else if(eatingChooserS.equals("I generally use the dorm's kitchen."))
        {
            p.setEatingFrequency(1);
        }
        else if(eatingChooserS.equals("I generally eat in the room."))
        {
            p.setEatingFrequency(2);
        }
    }  

    private void phoneCallChooserActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        String phoneCallS = phoneCallChooser.getSelectedItem().toString(); 
        if(phoneCallS.equals("I go out when my phone rings."))
        {
            p.setPhonecall(0);
        }
        else if(phoneCallS.equals("I may have short meetings in the room."))
        {
            p.setPhonecall(1);
        }
        else if(phoneCallS.equals("I always have my phonecalls in the room."))
        {
            p.setPhonecall(2);
        }
    }                                                

    private void studyingChooserActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String studyingS = studyingChooser.getSelectedItem().toString(); 
        if(studyingS.equals("I never use the room for studying."))
        {
            p.setStudyFrequency(0);
        }
        else if(studyingS.equals("Only in exam weeks."))
        {
            p.setStudyFrequency(1);
        }
        else if(studyingS.equals("I always study in the room (I prefer a silent room)."))
        {
            p.setStudyFrequency(2);
        }
    }      

    private void cancelChangesActionPerformed(java.awt.event.ActionEvent evt) {                                              
        EditPreferences ep = new EditPreferences(userID);
        ep.pack();
        ep.setLocationRelativeTo(null);
        ep.setVisible(true);
        
        this.dispose();
    }                                             

    private void saveChangesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        handler.insertPreferences(userID,p.getPrefereces()[0], p.getPrefereces()[2], p.getPrefereces()[1], p.getPrefereces()[3], p.getPrefereces()[4]);
        JOptionPane.showMessageDialog(null, "Changes Saved Successfuly!", "Nice", JOptionPane.INFORMATION_MESSAGE);
        Profile prof = new Profile(userID);
        prof.pack();
        prof.setLocationRelativeTo(null);
        prof.setVisible(true); 
        
        this.dispose();
    }   

    private void goEditingActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }   
    
    private void goProfileActionPerformed(java.awt.event.ActionEvent evt){
        Profile prof = new Profile(userID);
        prof.pack();
        prof.setLocationRelativeTo(null);
        prof.setVisible(true); 
        
        this.dispose();
    }

    private void goMessagesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        chat_server cs = new chat_server(userId);
        cs.pack();
        cs.setLocationRelativeTo(null);
        cs.setVisible(true);
    }                                          

    private void goEditingStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        // TODO add your handling code here:
    }
    
    private void goOtherUsersActionPerformed(java.awt.event.ActionEvent evt) {                                           
        OtherUsers cc = new OtherUsers(userID);
        cc.pack();
        cc.setLocationRelativeTo(null);
        cc.setVisible(true);
            
        this.dispose();
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
            java.util.logging.Logger.getLogger(EditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPreferences.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPreferences(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel bedTime;
    private javax.swing.JComboBox<String> bedTimeChooser;
    private javax.swing.JButton cancelChanges;
    private javax.swing.JLabel eating;
    private javax.swing.JComboBox<String> eatingChooser;
    private javax.swing.JButton goEditing;
    private javax.swing.JButton goMessages;
    private javax.swing.JButton goOtherUsers;
    private javax.swing.JButton goProfile;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel phoneCall;
    private javax.swing.JComboBox<String> phoneCallChooser;
    private javax.swing.JLabel playingGames;
    private javax.swing.JComboBox<String> playingGamesChooser;
    private javax.swing.JButton saveChanges;
    private javax.swing.JComboBox<String> studyingChooser;
    private javax.swing.JLabel studyingRoom;
    private javax.swing.JLabel title;
    // End of variables declaration                   
}