
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Vector;
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
public class RecordedGamesList extends javax.swing.JFrame {

    /**
     * Creates new form ActiveList
     */

    Socket s;
    PrintStream        ps;
    BufferedReader      d;
    InputStreamReader dis;
    String            respond;
    Thread t;
    String userName;
    String P2;
    String[] games;
    ClientGameFrame clientFrame;
    HomeFrame myHf;
    
    int ok;
    //Vector Of Active there should be Thrid updating the vector Contiously and set Data Again
     Vector<String> availableGames=new Vector<>();

    public RecordedGamesList(String avlGames,String user_Name,int cout,HomeFrame hf) {
        initComponents();
        userName=user_Name;
        myHf=hf;
        //availableGames=avlGames;
        label_userName.setText(userName);
        System.out.println(""+avlGames);
        games=avlGames.split("/");
                
        for(int i=1;i<=cout;i++){
            availableGames.add("Game "+i);
        }
        list_ActivePeople.setListData(availableGames);
            try {
                        s=new Socket("127.0.0.1",5009);
                        ps=new PrintStream(s.getOutputStream());
                        dis=new InputStreamReader(s.getInputStream());
                        d= new BufferedReader(dis);
                        ps.println("newRecordedGamesList-"+user_Name);
                        
                        
                    } catch (IOException ex) {
                        Logger.getLogger(LoginFram.class.getName()).log(Level.SEVERE, null, ex);
                    }  
            t= new Thread(new Runnable() {
                @Override
                public void run() {
                    
                  try {
                     while(true&& d !=null  && s != null && !s.isClosed()  && s.isConnected() && !s.isInputShutdown() && !s.isOutputShutdown()){
                            respond = d.readLine();
                            //checkRespond(respond);
                        }  
                     } catch (IOException ex) {
                            System.out.println("Recorded Game Ceck your connection");
                            t.stop();
                        }
             }
            });
            t.start();
       
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        list_ActivePeople = new javax.swing.JList<>();
        btn_Home = new javax.swing.JButton();
        label_userName = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(350, 350));
        setPreferredSize(new java.awt.Dimension(360, 360));

        list_ActivePeople.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        list_ActivePeople.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        list_ActivePeople.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_ActivePeople.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_ActivePeople.setToolTipText("");
        list_ActivePeople.setFixedCellWidth(10);
        list_ActivePeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_ActivePeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list_ActivePeople);

        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        label_userName.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btn_Home))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(label_userName)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_userName)
                .addGap(1, 1, 1)
                .addComponent(btn_Home)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void list_ActivePeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_ActivePeopleMouseClicked
        // .getSelected Value is the UserName Selected
        int index =this.list_ActivePeople.getAnchorSelectionIndex();
        System.out.println(index+"    "+games[index+1]);
        ShowRecordedGame srg=new ShowRecordedGame(games[index+1],userName,myHf);
        srg.setLocationRelativeTo(this);
        srg.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
        // new ActivePeople(available,userName).setVisible(true);
        // ClientGameFrame clientFrame= new ClientGameFrame(userName);
        // clientFrame.setVisible(true);
        //new ClientGameFrame(userName).setVisible(true);
      
    }//GEN-LAST:event_list_ActivePeopleMouseClicked

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // Hide This Frame and Then go to Home Frame
        
       // myHf.setLocationRelativeTo(this);
        myHf.setVisible(true);
        this.setVisible(false);
        this.dispose();
        // ClientGameFrame x=new ClientGameFrame();

    }//GEN-LAST:event_btn_HomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_userName;
    private javax.swing.JList<String> list_ActivePeople;
    // End of variables declaration//GEN-END:variables
}