
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClientGameFrame extends javax.swing.JFrame {
    public static final int PX1=1;//X Playes First
    public static final int PO2=2;//O Playes Second
    public int counter=1;
    public static String recorededGame="";
    String gameRecordName;
    Socket              s;
    InputStreamReader dis;
    PrintStream        ps;
    BufferedReader      d;
    String            msg;
    Thread              t;
    String userName;
    int mode;
    String P1;
    String P2;
    int playerMode;
    HomeFrame hf;
    public ClientGameFrame(String user_Name/*B*/,String P1/*B*/,String P2/*A*/,int mode/*2*/,HomeFrame hf) {
        try {
            initComponents();
            this.hf=hf;
            s=new Socket("127.0.0.1",5009);
            dis=new InputStreamReader(s.getInputStream());
            d= new BufferedReader(dis);
            ps=new PrintStream(s.getOutputStream());
            this.mode=mode;
            if(mode==PX1){//requstor
                userName=user_Name;
                label_UserName.setText("User Name : "+userName);
                this.P1=P1;
                this.P2=P2;
                playerMode=1;
                System.out.println("newConnection-"+userName+"-"+P1+"-"+P2);
                ps.println("newConnection-"+userName+"-"+P1+"-"+P2);
                
               
            }else if(mode==PO2){
                userName=user_Name;
                label_UserName.setText("User Name : "+userName);
                this.P1=P1;
                this.P2=P2;
                playerMode=2;
                ps.println("newConnection-"+userName+"-"+P1+"-"+P2);

            }
            label_Player1.setText(P1);
            label_Player2.setText(P2);
            ps.println("getScores-"+P1+"-"+P2);
            //send user name
           // if(userName.equals("user1"))
            //    ps.println("reqestGame-"+userName+"-"+CompatetorUserName);
            
            t= new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while(true && s.isConnected()){
                            msg = d.readLine();
                           System.out.println("after read "+msg);
                            if(msg != null && !msg.isEmpty()){
                                stepchecker(msg);
                             System.out.println("step "+msg);
                            }
                            
                        }
                    }catch (IOException ex) {                                    
                        System.out.println("Disconecting Server.....");
                        t.stop();
                    }
                }
            });
            t.start();
            
            new Thread (new Runnable() {
                @Override
                public void run() {
                    while(true){
                        if(counter%2==0){
                            label_PlayerTurn.setText("Turn of "+P2);
                        }else if(counter%2 !=0){
                            label_PlayerTurn.setText("Turn of "+P1);                            
                        }
                    }
                }
            }).start();
        } catch (IOException ex) {
            
            Logger.getLogger(ClientGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {
                
                }

                @Override
                public void windowClosing(WindowEvent e) {
                 
                }

                @Override
                public void windowClosed(WindowEvent e) {
                 
                }

                @Override
                public void windowIconified(WindowEvent e) {
                 
                }

                @Override
                public void windowDeiconified(WindowEvent e) {
                  
                }

                @Override
                public void windowActivated(WindowEvent e) {
                    
                }

                @Override
                public void windowDeactivated(WindowEvent e) {
                   
                }

               
            });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        checkBox_RecordGame = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        label_Player1 = new javax.swing.JLabel();
        label_Player2 = new javax.swing.JLabel();
        label_P1_Score = new javax.swing.JLabel();
        label_P2_Score = new javax.swing.JLabel();
        label_UserName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        checkBox_RecordGame.setText("Record Game");
        checkBox_RecordGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_RecordGameActionPerformed(evt);
            }
        });

        jLabel1.setText("Scores");

        label_Player1.setText("Player 1");

        label_Player2.setText("Player 2 ");

        label_P1_Score.setText("0");

        label_P2_Score.setText("0");

        label_UserName.setText("jLabel6");

        jLabel4.setText("userNames");

        javax.swing.GroupLayout gameMainPanelLayout = new javax.swing.GroupLayout(gameMainPanel);
        gameMainPanel.setLayout(gameMainPanelLayout);
        gameMainPanelLayout.setHorizontalGroup(
            gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameMainPanelLayout.createSequentialGroup()
                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label_PlayerTurn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_UserName)
                        .addGap(62, 62, 62)
                        .addComponent(checkBox_RecordGame))
                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gameMainPanelLayout.createSequentialGroup()
                                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Player1)
                                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(label_P1_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gameMainPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(label_P2_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label_Player2)))
                            .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameMainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Home)
                .addGap(151, 151, 151))
        );
        gameMainPanelLayout.setVerticalGroup(
            gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_PlayerTurn)
                    .addComponent(label_UserName)
                    .addComponent(checkBox_RecordGame))
                .addGap(23, 23, 23)
                .addComponent(innerGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Player1)
                    .addComponent(label_Player2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_P2_Score)
                    .addComponent(label_P1_Score)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
        // Go to home 
        
        ps.println("available-"+userName);
        hf.setLocationRelativeTo(this);
        hf.setVisible(true);  
        this.setVisible(false);
        ps.println("removeCouple-"+P1+"-"+P2);
        t.stop();
        ps.close();
        try {
            d.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void checkBox_RecordGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_RecordGameActionPerformed
        // If Selected will Record Game  
        if(checkBox_RecordGame.isSelected()){
            System.out.println("selected");
            checkBox_RecordGame.setEnabled(false);
        }
       /* gameRecordName=JOptionPane.showInputDialog(this, "Enter Record Name");
        System.out.println(""+gameRecordName);*/
        //يجب التأكد أن اللاسم ليس موجود مسبقا في سجلات الاعب
        //يجب التأكد من صحة الإدخال
    }//GEN-LAST:event_checkBox_RecordGameActionPerformed

    private void postion_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_2MouseClicked

        System.out.println("in  "+counter+"  "+playerMode);
        if(playerMode==1 && counter % 2 !=0 && postion_2.getText().equals("")){
            ps.println("trans-21");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_2.getText().equals("")){
            ps.println("trans-22");
        }
        
    }//GEN-LAST:event_postion_2MouseClicked

    private void postion_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_3MouseClicked
 
        if(playerMode==1 && counter % 2 !=0 && postion_3.getText().equals("")){
            ps.println("trans-31");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_3.getText().equals("")){
            ps.println("trans-32");
        }
        
    }//GEN-LAST:event_postion_3MouseClicked

    private void postion_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_4MouseClicked
  
        if(playerMode==1 && counter % 2 !=0 && postion_4.getText().equals("")){
            ps.println("trans-41");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_4.getText().equals("")){
            ps.println("trans-42");
        }
    }//GEN-LAST:event_postion_4MouseClicked

    private void postion_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_5MouseClicked
        if(playerMode==1 && counter % 2 !=0 && postion_5.getText().equals("")){
            ps.println("trans-51");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_5.getText().equals("")){
            ps.println("trans-52");
        }
        
    }//GEN-LAST:event_postion_5MouseClicked

    private void postion_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_6MouseClicked
    
        if(playerMode==1 && counter % 2 !=0 && postion_6.getText().equals("")){
            ps.println("trans-61");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_6.getText().equals("")){
            ps.println("trans-62");
        }
    }//GEN-LAST:event_postion_6MouseClicked

    private void postion_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_7MouseClicked
        if(playerMode==1 && counter % 2 !=0 && postion_7.getText().equals("")){
            ps.println("trans-71");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_7.getText().equals("")){
            ps.println("trans-72");
        }
    }//GEN-LAST:event_postion_7MouseClicked

    private void postion_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_8MouseClicked
   
        if(playerMode==1 && counter % 2 !=0 && postion_8.getText().equals("")){
            ps.println("trans-81");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_8.getText().equals("")){
            ps.println("trans-82");
        }
    }//GEN-LAST:event_postion_8MouseClicked

    private void postion_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_9MouseClicked
        
        if(playerMode==1 && counter % 2 !=0 && postion_9.getText().equals("")){
            ps.println("trans-91");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_9.getText().equals("")){
            ps.println("trans-92");
        }
    }//GEN-LAST:event_postion_9MouseClicked

    private void postion_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postion_1MouseClicked
        if(playerMode==1 && counter % 2 !=0 && postion_1.getText().equals("")){
            ps.println("trans-11-");
        }
        if(playerMode==2 && counter % 2 ==0 && postion_1.getText().equals("")){
            ps.println("trans-12");
        }
    }//GEN-LAST:event_postion_1MouseClicked
    public void stepchecker(String trans){
        String[] ms=trans.split("-");
        trans=ms[0];
        switch(trans){
            case "11":
                System.out.println("   "+" in 11");
                checkBox_RecordGame.setEnabled(false);
                if(postion_1.getText().equals("")){
                    postion_1.setText("X");
                    postion_1.setOpaque(true);
                    postion_1.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                 }
                break;
            case "21":
                checkBox_RecordGame.setEnabled(false);
                if(postion_2.getText().equals("")){
                      postion_2.setText("X");
                      postion_2.setOpaque(true);
                      postion_2.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "31":
                checkBox_RecordGame.setEnabled(false);
                if(postion_3.getText().equals("")){
                      postion_3.setText("X");
                      postion_3.setOpaque(true);
                      postion_3.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "41":
                checkBox_RecordGame.setEnabled(false);
                if(postion_4.getText().equals("")){
                      postion_4.setText("X");
                      postion_4.setOpaque(true);
                      postion_4.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "51":
                checkBox_RecordGame.setEnabled(false);
                if(postion_5.getText().equals("")){
                      postion_5.setText("X");
                      postion_5.setOpaque(true);
                      postion_5.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "61":
                checkBox_RecordGame.setEnabled(false);
                if(postion_6.getText().equals("")){
                      postion_6.setText("X");
                      postion_6.setOpaque(true);
                      postion_6.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "71":
                checkBox_RecordGame.setEnabled(false);
                if(postion_7.getText().equals("")){
                      postion_7.setText("X");
                      postion_7.setOpaque(true);
                      postion_7.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "81":
                checkBox_RecordGame.setEnabled(false);
                if(postion_8.getText().equals("")){
                      postion_8.setText("X");
                      postion_8.setOpaque(true);
                      postion_8.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "91":
                checkBox_RecordGame.setEnabled(false);
                if(postion_9.getText().equals("")){
                      postion_9.setText("X");
                      postion_9.setOpaque(true);
                      postion_9.setBackground(Color.WHITE);
                      recordStep(trans);
                      counter++;
                }
                break;
            case "12":
                checkBox_RecordGame.setEnabled(false);
                if(postion_1.getText().equals("")){
                    postion_1.setText("O");
                    postion_1.setOpaque(true);
                    postion_1.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "22":
                 checkBox_RecordGame.setEnabled(false);
                if(postion_2.getText().equals("")){
                    postion_2.setText("O");
                    postion_2.setOpaque(true);
                    postion_2.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
             case "32":
                
                if(postion_3.getText().equals("")){
                    postion_3.setText("O");
                    postion_3.setOpaque(true);
                    postion_3.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "42":
                checkBox_RecordGame.setEnabled(false);
                if(postion_4.getText().equals("")){
                    postion_4.setText("O");
                    postion_4.setOpaque(true);
                    postion_4.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "52":
                 checkBox_RecordGame.setEnabled(false);
                if(postion_5.getText().equals("")){
                    postion_5.setText("O");
                    postion_5.setOpaque(true);
                    postion_5.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "62":
                checkBox_RecordGame.setEnabled(false);
                if(postion_6.getText().equals("")){
                    postion_6.setText("O");
                    postion_6.setOpaque(true);
                    postion_6.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "72":
                 checkBox_RecordGame.setEnabled(false);
                if(postion_7.getText().equals("")){
                    postion_7.setText("O");
                    postion_7.setOpaque(true);
                    postion_7.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "82":
                checkBox_RecordGame.setEnabled(false);
                if(postion_8.getText().equals("")){
                    postion_8.setText("O");
                    postion_8.setOpaque(true);
                    postion_8.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "92":
                checkBox_RecordGame.setEnabled(false);
                if(postion_9.getText().equals("")){
                    postion_9.setText("O");
                    postion_9.setOpaque(true);
                    postion_9.setBackground(Color.WHITE);
                    recordStep(trans);
                    counter++;
                }
                break;
            case "P1_Win":
                disableTxtView();
                if(mode==1){
                    
                    //win(userName);
            new Thread (new Runnable() {
                @Override
                public void run() {
                    video v=new video();
                    String[] args = {""};
                    v.main(args);}}).start();
                    /*this.setVisible(false);
                    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                    this.dispose();*/
                    ps.println("ScorePlus-"+userName);
                    checkIf_P2_WantToRecordTheGame();
                    ps.println("getScores-"+P1+"-"+P2);

                }else{
                    win(P1);
                } 
                //ps.println("getScores-"+P1+"-"+P2);
                break;
            case "P2_Win":
                disableTxtView();
                
                if(mode==2){
                    
                    //VideoPlayer vp=new VideoPlayer();
                    //vp.start(primaryStage);'
                    //vp.main(arg);
            new Thread (new Runnable() {
                @Override
                public void run() {
                    video v=new video();
                    String[] args = {""};
                    v.main(args);}}).start();
                    ps.println("ScorePlus-"+userName);
                    ps.println("getScores-"+P1+"-"+P2);
                }else{
                    win(P2);
                    checkIf_P2_WantToRecordTheGame();
                }
                ps.println("getScores-"+P1+"-"+P2);
                break;  
            case "tie":
                disableTxtView();
                if(mode==1){
                    checkIf_P2_WantToRecordTheGame();
                }   
                
                tie();
                    //System.out.println(""+recorededGame);
                
            break; 
                case "Do_You_Want_To_Save_The_Game":System.out.println(" in case Do_You_Want_To_Save_The_Game  "+userName);
                    if(mode==2 && !checkBox_RecordGame.isSelected()){
                        int result =JOptionPane.showConfirmDialog(this, "Do you want to record this game", "Request",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(result==JOptionPane.YES_OPTION){
                            ps.println("Yes_P2_Want_To_Record_The_Game-"+userName);
                        }else if(result ==JOptionPane.NO_OPTION){
                            ps.println("No_P2_Doesnt_Want_To_Record_The_Game-"+userName);
                        }
                        
                    }else if(mode == 2 && checkBox_RecordGame.isSelected()){//userName of P2
                        ps.println("Yes_P2_Want_To_Record_The_Game-"+userName);
                    }
                    
                    break;
                case "Yes_P2_Want_To_Record_The_Game":System.out.println("in case Yes_P2_Want_To_Record_The_Game  "+userName);
                    if(checkBox_RecordGame.isSelected()){
                        sendRecord(true,true);
                    }else{
                        int result =JOptionPane.showConfirmDialog(this, "Do you want to record this game", "Request",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(result==JOptionPane.YES_OPTION){
                            sendRecord(true,true);
                        }else if(result==JOptionPane.NO_OPTION){
                            sendRecord(false,true);
                        }
                    }
                    break;
                case "No_P2_Doesnt_Want_To_Record_The_Game":
                    if(checkBox_RecordGame.isSelected()){
                        sendRecord(true,false);
                    }else{
                        int result =JOptionPane.showConfirmDialog(this, "Do you want to record this game", "Request",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(result==JOptionPane.YES_OPTION){
                            sendRecord(true,false);
                        }else{} /*if(result==JOptionPane.NO_OPTION){
                            //do nothing
                        }*/
                    }
                    break;
                    case "Scores":
                if(P1.equals(ms[1]) && P2.equals(ms[2])){
                    label_P1_Score.setText(""+ms[3]);
                    label_P2_Score.setText(""+ms[4]);
                }
                break;
                
                    
            default:
                System.out.println("Wrong Code");
        }
    }
    public void recordStep(String current_Step){
        recorededGame=recorededGame+""+current_Step+"-";
    }
    public void win(String userName1){
        
        JOptionPane.showMessageDialog(this,userName1+" Won .");
        
    }
    public void tie(){
        JOptionPane.showMessageDialog(this,"Tie No One Win");
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new ClientGameFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Home;
    private javax.swing.JCheckBox checkBox_RecordGame;
    private javax.swing.JPanel gameMainPanel;
    private javax.swing.JPanel innerGamePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_P1_Score;
    private javax.swing.JLabel label_P2_Score;
    private javax.swing.JLabel label_Player1;
    private javax.swing.JLabel label_Player2;
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

    private void sendRecord(boolean P1_Accepted, boolean P2_Accepted) {
        String player1="NULL",player2="NULL";
        if(P1_Accepted){
            player1=P1;
        }
        if(P2_Accepted){
            player2=P2;
        }  
            String query="recordGame-"+player1+"-"+player2+"-"+recorededGame;
            System.out.println(" "+query);
            ps.println(query);
    }

    private void checkIf_P2_WantToRecordTheGame() {//where username is for P1 requestor of the game
        ps.println("checkIf_P2_WantToRecordTheGame-"+userName);
    }

    private void disableTxtView() {
        postion_1.setEnabled(false);
        postion_2.setEnabled(false);
        postion_3.setEnabled(false);
        postion_4.setEnabled(false);
        postion_5.setEnabled(false);
        postion_6.setEnabled(false);
        postion_7.setEnabled(false);
        postion_8.setEnabled(false);
        postion_9.setEnabled(false);
    }
}
/*class  Player {
 
   class step{
       int postion;
       int playerType;
       int stepNum;
       
   }
}*/
