
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class computer extends javax.swing.JFrame {

    public static final String x="x";
    public static final String o="o";
    public static int counter=0;
    public static int mode=1;
    public static int person_score=0;
    public static int computer_score=0;
    public static int y=0;
    public static int l1=1;
    public static int l2=1;
    public static int l3=1;
    public static int l4=1;
    public static int l5=1;
    public static int l6=1;
    public static int l7=1;
    public static int l8=1;
    public static int l9=1;
    public static int w1=0;
    public static int w2=0;
    public static int w3=0;
    public static int w4=0;
    public static int w5=0;
    public static int w6=0;
    public static int w7=0;
    public static int w8=0;
    public static int w9=0;
    public static String player1;
    public computer(){
        initComponents();
        player1="";
        jLabel2.setVisible(false);
        btn_Home.setText("Back");
    }
    public computer(String n) {
        
        
       player1=n;
       jLabel2.setText(player1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btn_Home = new javax.swing.JButton();
        label_GameState = new javax.swing.JLabel();
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
        btn_PlayAgain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("0");

        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        label_GameState.setText("Game State Win or Loose");

        innerGamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        postion_1.setBackground(new java.awt.Color(255, 204, 102));
        postion_1.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        postion_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postion_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postion_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postion_1MouseClicked(evt);
            }
        });

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

        btn_PlayAgain.setText("Play Again");
        btn_PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PlayAgainActionPerformed(evt);
            }
        });

        jLabel1.setText("Scores");

        jLabel2.setText("Player 1");

        jLabel3.setText("computer");

        jLabel4.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btn_Home)
                                    .addGap(18, 18, 18)))
                            .addComponent(btn_PlayAgain))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4)))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_GameState, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_GameState, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_PlayAgain)
                    .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        if(!player1.equals("")){
            HomeFrame home= new HomeFrame(player1);
            home.setVisible(true);
            home.setLocationRelativeTo(this);
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
    public String won()
    {
        if(w1==1&&w2==1&&w3==1||
           w4==1&&w5==1&&w6==1||
            w7==1&&w8==1&&w9==1||
            w1==1&&w5==1&&w9==1||
            w3==1&&w5==1&&w7==1||
            w1==1&&w4==1&&w7==1||
            w2==1&&w5==1&&w8==1||
            w3==1&&w6==1&&w9==1)
        {
            label_GameState.setText("you won");
            person_score+=1;
            jLabel4.setText(""+person_score);
            mode=0;
            y=1;
        }
        else if(w1==2&&w2==2&&w3==2||
            w4==2&&w5==2&&w6==2||
            w7==2&&w8==2&&w9==2||
            w1==2&&w5==2&&w9==2||
            w3==2&&w5==2&&w7==2||
            w1==2&&w4==2&&w7==2||
            w2==2&&w5==2&&w8==2||
            w3==2&&w6==2&&w9==2)
        {
            label_GameState.setText("computer won");
            computer_score+=1;
            jLabel5.setText(""+computer_score);
             mode=0;
        }
        else if(counter>=9)
        {
            label_GameState.setText("no one Won");
            mode=0;
        }
        return "";
    }
    public void com()
    {
        
        if(l3==1&&mode==0&&w1==1&&w2==1)
        {
            postion_3.setText("o");
            l3=0;
            counter++;
            w3=2;
               mode=1;
            won();
        }
        else if(l2==1&&mode==0&&w1==1&&w3==1)
        {
            postion_2.setText("o");
            l2=0;
            counter++;
            w2=2;
               mode=1;
            won();
        }
        else if(l1==1&&mode==0&&w2==1&&w3==1)
        {
            postion_1.setText("o");
            l1=0;
            counter++;
            w1=2;
               mode=1;
            won();
        }
        else if(l4==1&&mode==0&&w5==1&&w6==1)
        {
            postion_4.setText("o");
            l4=0;
            counter++;
            w4=2;
               mode=1;
            won();
        }
        else if(l5==1&&mode==0&&w4==1&&w6==1)
        {
            postion_5.setText("o");
            l5=0;
            counter++;
            w5=2;
               mode=1;
            won();
        }
        else if(l6==1&&mode==0&&w5==1&&w4==1)
        {
            postion_6.setText("o");
            l6=0;
            counter++;
            w6=2;
               mode=1;
            won();
        }
        else if(l7==1&&mode==0&&w9==1&&w8==1)
        {
            postion_7.setText("o");
            l7=0;
            counter++;
            w7=2;
               mode=1;
            won();
        }
        else if(l8==1&&mode==0&&w7==1&&w9==1)
        {
            postion_8.setText("o");
            l8=0;
            counter++;
            w8=2;
               mode=1;
            won();
        }
        else if(l9==1&&mode==0&&w7==1&&w8==1)
        {
            postion_9.setText("o");
            l9=0;
            counter++;
            w9=2;
               mode=1;
            won();
        }
        else if(l1==1&&mode==0&&w9==1&&w5==1)
        {
            postion_1.setText("o");
            l1=0;
            counter++;
            w1=2;
               mode=1;
            won();
        }
        else if(l5==1&&mode==0&&w1==1&&w9==1)
        {
            postion_5.setText("o");
            l5=0;
            counter++;
            w5=2;
               mode=1;
            won();
        }
        else if(l9==1&&mode==0&&w5==1&&w1==1)
        {
            postion_9.setText("o");
            l9=0;
            counter++;
            w9=2;
               mode=1;
            won();
        }
        else if(l3==1&&mode==0&&w5==1&&w7==1)
        {
            postion_3.setText("o");
            l3=0;
            counter++;
            w3=2;
               mode=1;
            won();
        }
        else if(l5==1&&mode==0&&w5==1&&w7==1)
        {
            postion_5.setText("o");
            l5=0;
            counter++;
            w5=2;
               mode=1;
            won();
        }
        else if(l7==1&&mode==0&&w7==1&&w5==1)
        {
            postion_7.setText("o");
            l7=0;
            counter++;
            w7=2;
               mode=1;
            won();
        }
        else if(l1==1&&mode==0&&w4==1&&w7==1)
        {
            postion_1.setText("o");
            l1=0;
            counter++;
            w1=2;
               mode=1;
            won();
        }
        else if(l4==1&&mode==0&&w1==1&&w7==1)
        {
            postion_4.setText("o");
            l4=0;
            counter++;
            w4=2;
               mode=1;
            won();
        }
        else if(l7==1&&mode==0&&w1==1&&w4==1)
        {
            postion_7.setText("o");
            l7=0;
            counter++;
            w7=2;
               mode=1;
            won();
        }
        else if(l2==1&&mode==0&&w5==1&&w8==1)
        {
            postion_2.setText("o");
            l2=0;
            counter++;
            w2=2;
               mode=1;
            won();
        }
        else if(l5==1&&mode==0&&w2==1&&w8==1)
        {
            postion_5.setText("o");
            l5=0;
            counter++;
            w5=2;
               mode=1;
            won();
        }
        else if(l8==1&&mode==0&&w2==1&&w5==1)
        {
            postion_8.setText("o");
            l8=0;
            counter++;
            w8=2;
               mode=1;
            won();
        }
        else if(l3==1&&mode==0&&w6==1&&w9==1)
        {
            postion_3.setText("o");
            l3=0;
            counter++;
            w3=2;
               mode=1;
            won();
        }
        else if(l6==1&&mode==0&&w3==1&&w9==1)
        {
            postion_6.setText("o");
            l6=0;
            counter++;
            w6=2;
               mode=1;
            won();
        }
        else if(l9==1&&mode==0&&w3==1&&w6==1)
        {
            postion_9.setText("o");
            l9=0;
            counter++;
            w9=2;
               mode=1;
            won();
        } 
       else if(l1==1&&mode==0) 
        {
            postion_1.setText("o");
            l1=0;
            counter++;
            w1=2;
               mode=1;
            won();
        }
         else if(l3==1&&mode==0)
        {
            postion_3.setText("o");
            l3=0; 
             w3=2;
            counter++;
               mode=1;
            won();
        }
        else if(l2==1&&mode==0)
        {
            postion_2.setText("o");
            l2=0;
            counter++;
             w2=2;
                mode=1;
             won();
        }
       else if(l5==1&&mode==0)
        {
            postion_5.setText("o");
            l5=0;
             w5=2;
            counter++;
               mode=1;
            won();
        }
       else if(l7==1&&mode==0)
        {
            postion_7.setText("o");
            l7=0; 
             w7=2;
            counter++;
               mode=1;
            won();
        }
        else if(l4==1&&mode==0)
        {
            postion_4.setText("o");
            l4=0;
             w4=2;
            counter++;
               mode=1;
            won();
        }
        else if(l6==1&&mode==0)
        {
            postion_6.setText("o");
            l6=0;
             w6=2;
            counter++;
               mode=1;
            won();
        }
        
        else if(l8==1&&mode==0)
        {
            postion_8.setText("o");
            l8=0;
             w8=2;
            counter++;
               mode=1;
            won();
            
        }
        else if(l9==1&&mode==0)
        {
            postion_9.setText("o");
            l9=0;
             w9=2;
                mode=1;
            counter++;
            won();
        }
        
     
        
    }
    private void postion_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_1MouseClicked
        if(counter<9&&mode==1&&l1==1)
        {
            postion_1.setText("x");
            mode=0;
            l1=0;
            w1=1;
            counter++;
              won();
              if(y==0)
               com();
     
        }
    }//GEN-LAST:event_postion_1MouseClicked

    private void postion_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_2MouseClicked
       if(counter<9&&mode==1&&l2==1)
        {
            postion_2.setText("x");
            mode=0;
            l2=0;
            w2=1;
            counter++;
             won();
              if(y==0)
               com();
        }
    }//GEN-LAST:event_postion_2MouseClicked

    private void postion_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_3MouseClicked

       if(counter<9&&mode==1&&l3==1)
        {
            postion_3.setText("x");
            mode=0;
            l3=0;
            w3=1;
            counter++;
           won();
            if(y==0)
               com();
        }
    }//GEN-LAST:event_postion_3MouseClicked

    private void postion_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_4MouseClicked

       if(counter<9&&mode==1&&l4==1)
        {
            postion_4.setText("x");
            mode=0;
            l4=0;
            w4=1;
            counter++;
             won();
             if(y==0)
               com();
        }
       
    }//GEN-LAST:event_postion_4MouseClicked

    private void postion_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_5MouseClicked
        if(counter<9&&mode==1&&l5==1)
        {
            postion_5.setText("x");
            mode=0;
            l5=0;
            w5=1;
            counter++;
            won();
           if(y==0)
               com();

        }
    }//GEN-LAST:event_postion_5MouseClicked

    private void postion_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_6MouseClicked

        if(counter<9&&mode==1&&l6==1)
        {
            postion_6.setText("x");
            mode=0;
            l6=0;
            w6=1;
            counter++;
            won();
             if(y==0)
               com();

        }
       
    }//GEN-LAST:event_postion_6MouseClicked

    private void postion_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_7MouseClicked
        if(counter<9&&mode==1&&l7==1)
        {
            postion_7.setText("x");
            mode=0;
            l7=0;
            w7=1;
            counter++;
             won();
            if(y==0)
               com();
        }
     
    }//GEN-LAST:event_postion_7MouseClicked

    private void postion_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_8MouseClicked

       if(counter<9&&mode==1&&l8==1)
        {
            postion_8.setText("x");
            mode=0;
            l8=0;
            w8=1;
            counter++;
           won();
         if(y==0)
               com();
        }
       
    }//GEN-LAST:event_postion_8MouseClicked

    private void postion_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_9MouseClicked

        if(counter<9&&mode==1&&l9==1)
        {
            postion_9.setText("x");
            mode=0;
            l9=0;
            w9=1;
            counter++;
             won();
            if(y==0)
               com();

        }
        
    }//GEN-LAST:event_postion_9MouseClicked

    private void btn_PlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PlayAgainActionPerformed
           
      postion_1.setText("");
       postion_2.setText("");
       postion_3.setText("");
       postion_4.setText(""); 
       postion_5.setText("");
       postion_6.setText("");
       postion_7.setText("");
       postion_8.setText("");
       postion_9.setText("");
       label_GameState.setText("Game State Win or Loose");

       counter=0;
       mode=1;
       y=0;
     l1=1;
     l2=1;
     l3=1;
     l4=1;
     l5=1;
     l6=1;
     l7=1;
     l8=1;
     l9=1;
     w1=0;
     w2=0;
     w3=0;
     w4=0;
     w5=0;
     w6=0;
     w7=0;
     w8=0;
     w9=0;
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
            java.util.logging.Logger.getLogger(computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new computer(player1).setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_PlayAgain;
    private javax.swing.JPanel innerGamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_GameState;
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
