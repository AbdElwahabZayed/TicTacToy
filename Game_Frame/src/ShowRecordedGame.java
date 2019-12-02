
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
public class ShowRecordedGame extends javax.swing.JFrame {
    String userName;
    String[] tran;
    PrintStep ps;
    HomeFrame hf;
    /**
     * Creates new form ShowRecordedGame
     */
    public ShowRecordedGame(String game ,String userName,HomeFrame hf) {
        initComponents();
        label_UserName.setText("Rcorded Game for : "+userName);
        tran=game.split("-");
        System.out.println("ShowRecordedGame "+game);
        ps=new PrintStep();
        ps.start();
        this.hf=hf;
    }
    class PrintStep extends Thread
	{
		@Override
		public void run()
		{
                    for(String x:tran){
                        if(!x.equals("NULL")){
                            stepchecker(x);
                            System.out.println("   "+x);
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ShowRecordedGame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }	
	}
		

    public void stepchecker(String trans){
        switch(trans){
            case "11":
                System.out.println("   "+" in 11");
                if(postion_1.getText().equals("")){
                    postion_1.setText("X");
                    postion_1.setOpaque(true);
                    postion_1.setBackground(Color.WHITE);
                 }
                break;
            case "21":
             
                if(postion_2.getText().equals("")){
                      postion_2.setText("X");
                      postion_2.setOpaque(true);
                      postion_2.setBackground(Color.WHITE);
                 
                }
                break;
            case "31":
                
                if(postion_3.getText().equals("")){
                      postion_3.setText("X");
                      postion_3.setOpaque(true);
                      postion_3.setBackground(Color.WHITE);
                     
                }
                break;
            case "41":
                
                if(postion_4.getText().equals("")){
                      postion_4.setText("X");
                      postion_4.setOpaque(true);
                      postion_4.setBackground(Color.WHITE);
                      
                }
                break;
            case "51":
                
                if(postion_5.getText().equals("")){
                      postion_5.setText("X");
                      postion_5.setOpaque(true);
                      postion_5.setBackground(Color.WHITE);
                      
                }
                break;
            case "61":
                
                if(postion_6.getText().equals("")){
                      postion_6.setText("X");
                      postion_6.setOpaque(true);
                      postion_6.setBackground(Color.WHITE);
                      
                }
                break;
            case "71":
                
                if(postion_7.getText().equals("")){
                      postion_7.setText("X");
                      postion_7.setOpaque(true);
                      postion_7.setBackground(Color.WHITE);
                      
                }
                break;
            case "81":
                
                if(postion_8.getText().equals("")){
                      postion_8.setText("X");
                      postion_8.setOpaque(true);
                      postion_8.setBackground(Color.WHITE);
                      
                }
                break;
            case "91":
                
                if(postion_9.getText().equals("")){
                      postion_9.setText("X");
                      postion_9.setOpaque(true);
                      postion_9.setBackground(Color.WHITE);
                     
                }
                break;
            case "12":
                
                if(postion_1.getText().equals("")){
                    postion_1.setText("O");
                    postion_1.setOpaque(true);
             
                }
                break;
            case "22":
                 
                if(postion_2.getText().equals("")){
                    postion_2.setText("O");
                    postion_2.setOpaque(true);
                    postion_2.setBackground(Color.WHITE);
                  
                }
                break;
             case "32":
                
                if(postion_3.getText().equals("")){
                    postion_3.setText("O");
                    postion_3.setOpaque(true);
                    postion_3.setBackground(Color.WHITE);
                   
                }
                break;
            case "42":
                
                if(postion_4.getText().equals("")){
                    postion_4.setText("O");
                    postion_4.setOpaque(true);
                    postion_4.setBackground(Color.WHITE);
                   
                }
                break;
            case "52":

                if(postion_5.getText().equals("")){
                    postion_5.setText("O");
                    postion_5.setOpaque(true);
                    postion_5.setBackground(Color.WHITE);
                    
                }
                break;
            case "62":
                
                if(postion_6.getText().equals("")){
                    postion_6.setText("O");
                    postion_6.setOpaque(true);
                    postion_6.setBackground(Color.WHITE);
                  
                }
                break;
            case "72":
                 
                if(postion_7.getText().equals("")){
                    postion_7.setText("O");
                    postion_7.setOpaque(true);
                    postion_7.setBackground(Color.WHITE);
                  
                }
                break;
            case "82":
             
                if(postion_8.getText().equals("")){
                    postion_8.setText("O");
                    postion_8.setOpaque(true);
                    postion_8.setBackground(Color.WHITE);
                  
                }
                break;
            case "92":
                
                if(postion_9.getText().equals("")){
                    postion_9.setText("O");
                    postion_9.setOpaque(true);
                    postion_9.setBackground(Color.WHITE);
              
                }
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameMainPanel = new javax.swing.JPanel();
        btn_Home = new javax.swing.JButton();
        innerGamePanel = new javax.swing.JPanel();
        postion_1 = new javax.swing.JLabel();
        postion_2 = new javax.swing.JLabel();
        postion_3 = new javax.swing.JLabel();
        postion_4 = new javax.swing.JLabel();
        postion_5 = new javax.swing.JLabel();
        postion_6 = new javax.swing.JLabel();
        postion_7 = new javax.swing.JLabel();
        postion_8 = new javax.swing.JLabel();
        postion_9 = new javax.swing.JLabel();
        label_PlayerTurn = new javax.swing.JLabel();
        label_UserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        innerGamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        postion_1.setBackground(new java.awt.Color(255, 204, 102));
        postion_1.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        postion_2.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_2MouseClicked(evt);
            }
        });

        postion_3.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_3MouseClicked(evt);
            }
        });

        postion_4.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_4MouseClicked(evt);
            }
        });

        postion_5.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_5MouseClicked(evt);
            }
        });

        postion_6.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_6MouseClicked(evt);
            }
        });

        postion_7.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_7MouseClicked(evt);
            }
        });

        postion_8.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_8MouseClicked(evt);
            }
        });

        postion_9.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout innerGamePanelLayout = new javax.swing.GroupLayout(innerGamePanel);
        innerGamePanel.setLayout(innerGamePanelLayout);
        innerGamePanelLayout.setHorizontalGroup(
            innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerGamePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerGamePanelLayout.createSequentialGroup()
                        .addComponent(postion_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(postion_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(postion_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerGamePanelLayout.createSequentialGroup()
                        .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerGamePanelLayout.createSequentialGroup()
                                .addComponent(postion_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(postion_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerGamePanelLayout.createSequentialGroup()
                                .addComponent(postion_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(postion_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postion_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postion_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        innerGamePanelLayout.setVerticalGroup(
            innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerGamePanelLayout.createSequentialGroup()
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postion_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postion_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postion_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(postion_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(postion_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(postion_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(postion_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(postion_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(postion_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        label_UserName.setText("jLabel6");

        javax.swing.GroupLayout gameMainPanelLayout = new javax.swing.GroupLayout(gameMainPanel);
        gameMainPanel.setLayout(gameMainPanelLayout);
        gameMainPanelLayout.setHorizontalGroup(
            gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameMainPanelLayout.createSequentialGroup()
                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label_PlayerTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_UserName)
                        .addGap(151, 151, 151)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameMainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Home)
                .addGap(138, 138, 138))
        );
        gameMainPanelLayout.setVerticalGroup(
            gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_PlayerTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(gameMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        
        hf.setLocationRelativeTo(this);
        hf.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_btn_HomeActionPerformed

    private void postion_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_2MouseClicked
        // when pos 2 "clicked" with mouse \

    }//GEN-LAST:event_postion_2MouseClicked

    private void postion_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_3MouseClicked

      
    }//GEN-LAST:event_postion_3MouseClicked

    private void postion_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_4MouseClicked

       
    }//GEN-LAST:event_postion_4MouseClicked

    private void postion_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_5MouseClicked
      

    }//GEN-LAST:event_postion_5MouseClicked

    private void postion_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_6MouseClicked

    }//GEN-LAST:event_postion_6MouseClicked

    private void postion_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_7MouseClicked
       
    }//GEN-LAST:event_postion_7MouseClicked

    private void postion_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_8MouseClicked

       
    }//GEN-LAST:event_postion_8MouseClicked

    private void postion_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_9MouseClicked

      
    }//GEN-LAST:event_postion_9MouseClicked

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
            java.util.logging.Logger.getLogger(ShowRecordedGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowRecordedGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowRecordedGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowRecordedGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Home;
    private javax.swing.JPanel gameMainPanel;
    private javax.swing.JPanel innerGamePanel;
    private javax.swing.JLabel label_PlayerTurn;
    private javax.swing.JLabel label_UserName;
    private javax.swing.JLabel postion_1;
    private javax.swing.JLabel postion_2;
    private javax.swing.JLabel postion_3;
    private javax.swing.JLabel postion_4;
    private javax.swing.JLabel postion_5;
    private javax.swing.JLabel postion_6;
    private javax.swing.JLabel postion_7;
    private javax.swing.JLabel postion_8;
    private javax.swing.JLabel postion_9;
    // End of variables declaration//GEN-END:variables
}
