/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;


public class ManvsManFram extends javax.swing.JFrame {
    int XOrO = 0;
    String winner ;
    Boolean win=false;
    int xScore,oScore;
    Component [] component ;
    String userName;
    boolean network=true;
    public ManvsManFram(){
        initComponents();
        component = innerGamePanel.getComponents();
        addAction();
        btn_Home.setBackground(new java.awt.Color(255, 204, 255));
        btn_Home.setText("Back");
        userName="";
        network=false;
        
        
    }
    public ManvsManFram(String user_Name) {
        initComponents();
        userName=user_Name;
         component = innerGamePanel.getComponents();
         addAction();
       
    }
    
    public int getLength(){
        
        String allTxt ="";
        
        for(Component coms:component ){
                if(coms instanceof JButton){ 
                    JButton button = (JButton) coms;
                    allTxt=allTxt+button.getText();
                }
        }
        System.out.println(allTxt.length());
        return allTxt.length();
    
    }
    public void enablesButtons(){
        for(Component coms:component ){
                if(coms instanceof JButton){ 
                    JButton button = (JButton) coms;
                    if(button.getText().equals("")){
                    button.setEnabled(false);
                    
                    }   
                }
        }
    }
    
    
    public void getWinner(){
        if(!jButton1.getText().equals("")&&
                jButton1.getText().equals(jButton2.getText())&&
                jButton1.getText().equals(jButton3.getText())){
                winner = jButton1.getText();
                setScore(winner);
                jLabelWinner.setText(winner+"is the winner");
                enablesButtons();
                
               
        
        }
        if(!jButton4.getText().equals("")&&
                jButton4.getText().equals(jButton5.getText())&&
                jButton4.getText().equals(jButton6.getText())){
            winner = jButton4.getText();
            jLabelWinner.setText(winner+"is the winner");
            win=true;
            enablesButtons();
            setScore(winner);
            
        }
        
        if(!jButton7.getText().equals("")&&
                jButton7.getText().equals(jButton8.getText())&&
                jButton7.getText().equals(jButton9.getText())){
                winner = jButton7.getText();
                jLabelWinner.setText(winner+"is the winner");
                win=true;
                enablesButtons();
                setScore(winner);
        }
        
        if(!jButton1.getText().equals("")&&
                jButton1.getText().equals(jButton4.getText())&&
                jButton1.getText().equals(jButton7.getText())){
                winner = jButton1.getText();
                jLabelWinner.setText(winner+"  is the winner");
                win=true;
                enablesButtons();
                setScore(winner);
        }
        
        if(!jButton2.getText().equals("")&&
                jButton2.getText().equals(jButton6.getText())&&
                jButton2.getText().equals(jButton8.getText())){
                winner = jButton2.getText();
                jLabelWinner.setText(winner+"is the winner");
                win=true;
                enablesButtons();
                setScore(winner);
        }
        if(!jButton3.getText().equals("")&&
                jButton3.getText().equals(jButton5.getText())&&
                jButton3.getText().equals(jButton9.getText())){
                winner = jButton3.getText();
                jLabelWinner.setText(winner+"is the winner");
                win=true;
                enablesButtons();
                setScore(winner);
        }
        if(!jButton1.getText().equals("")&&
                jButton1.getText().equals(jButton6.getText())&&
                jButton1.getText().equals(jButton9.getText())){
                winner = jButton1.getText();
                jLabelWinner.setText(winner+"is the winner");
                win=true;
                enablesButtons();
                setScore(winner);
        }
        
        if(!jButton3.getText().equals("")&&
                jButton3.getText().equals(jButton6.getText())&&
                jButton3.getText().equals(jButton7.getText())){
                winner = jButton3.getText();
                jLabelWinner.setText(winner+"is the winner");
                win=true;
                enablesButtons();
                setScore(winner);
        }
        else if(win==false&&getLength()==9){
            jLabelWinner.setText("No one won.Please play again");
        }
    
    }
    
    void setScore(String winner){
        
        if(winner.equals("X")){
            xScore++;
            jLabelXScore.setText(""+xScore);
        }
        else if(winner.equals("O")){
            oScore++;
            jLabelOScore.setText(""+oScore);
        }
    }
    
    
    
    
    public  ActionListener creatActionListener( JButton button){
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
                if(button.getText().equals("")){
                    if((XOrO % 2) == 0){
                        button.setText("X");
                        button.setForeground(Color.RED);
                        jLabelWinner.setText("now is the turn of O");
                        getWinner();
                    }
                    else{
                        button.setText("O");
                        button.setForeground(Color.BLUE);
                        jLabelWinner.setText("now is the turn of X");
                        getWinner();
                    }
                XOrO++;
                }
            }
            
         };
        return a;
    }
    public void addAction(){
        
        for(Component coms:component ){
                if(coms instanceof JButton){ 
                    JButton button = (JButton) coms;
                    button.addActionListener(creatActionListener(button));
                }
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        innerGamePanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btn_PlayAgain = new javax.swing.JButton();
        jLabelXScore = new javax.swing.JLabel();
        jLabelOScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Home = new javax.swing.JButton();
        jLabelWinner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        innerGamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 204, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton6.setBackground(new java.awt.Color(255, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton7.setBackground(new java.awt.Color(255, 204, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton8.setBackground(new java.awt.Color(255, 204, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton9.setBackground(new java.awt.Color(255, 204, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        javax.swing.GroupLayout innerGamePanelLayout = new javax.swing.GroupLayout(innerGamePanel);
        innerGamePanel.setLayout(innerGamePanelLayout);
        innerGamePanelLayout.setHorizontalGroup(
            innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerGamePanelLayout.createSequentialGroup()
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerGamePanelLayout.createSequentialGroup()
                        .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(innerGamePanelLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        innerGamePanelLayout.setVerticalGroup(
            innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerGamePanelLayout.createSequentialGroup()
                .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(innerGamePanelLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(innerGamePanelLayout.createSequentialGroup()
                        .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(innerGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(innerGamePanelLayout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(innerGamePanelLayout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );

        btn_PlayAgain.setBackground(new java.awt.Color(255, 204, 255));
        btn_PlayAgain.setText("Play Again");
        btn_PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PlayAgainActionPerformed(evt);
            }
        });

        jLabelXScore.setText("0");

        jLabelOScore.setText("0");

        jLabel3.setText("O Player ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Scores");

        jLabel2.setText("X Player ");

        btn_Home.setBackground(new java.awt.Color(255, 204, 255));
        btn_Home.setText("Home");
        btn_Home.setToolTipText("");
        btn_Home.setMaximumSize(new java.awt.Dimension(83, 23));
        btn_Home.setMinimumSize(new java.awt.Dimension(83, 23));
        btn_Home.setPreferredSize(new java.awt.Dimension(83, 23));
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        jLabelWinner.setBackground(new java.awt.Color(255, 204, 255));
        jLabelWinner.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabelWinner.setText("Player");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelOScore, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabelXScore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)))
                            .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_PlayAgain))))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelXScore))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelOScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_PlayAgain))
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // Go to home frame
        if(network){
            HomeFrame homeFrame= new HomeFrame(userName);
            homeFrame.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        }else{
            XO_Game xo=new XO_Game();
            xo.setVisible(true);
            xo.setLocationRelativeTo(this);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        }

    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_PlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PlayAgainActionPerformed
        
        win=false;
        for(Component coms:component ){
                if(coms instanceof JButton){ 
                    JButton button = (JButton) coms;
                    button.setEnabled(true);
                    button.setText("");
                    jLabelWinner.setText("Play");
                }
        }
        
    }//GEN-LAST:event_btn_PlayAgainActionPerformed

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
            java.util.logging.Logger.getLogger(ManvsManFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManvsManFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManvsManFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManvsManFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_PlayAgain;
    private javax.swing.JPanel innerGamePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelOScore;
    private javax.swing.JLabel jLabelWinner;
    private javax.swing.JLabel jLabelXScore;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
