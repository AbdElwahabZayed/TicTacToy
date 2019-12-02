
package gameserver;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GameServer extends javax.swing.JFrame {


    public GameServer() {
        initComponents();
        
        //this listeners for handling closing the server while clients playing 
        addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {
                
                }

                @Override
                public void windowClosing(WindowEvent e) {

                }

                @Override
                public void windowClosed(WindowEvent e) {
                     try {
                            new GameHandler().exit="Server is shutdown";
                            //new GameHandler().sendMsgToAll("server is shutdown");
                            new GameSocket().serverSocket.close();
                             // d.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                }
                //these Listeners is not used
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameServer().setVisible(true);
            }
        });
        GameSocket g=new GameSocket();
    }
    
//Socket Class
    
    static class GameSocket {
        public ServerSocket serverSocket;
        
        public GameSocket(){
            try {
                serverSocket=new ServerSocket(5009);
                while(true){
                    Socket socket=serverSocket.accept();
                    new GameHandler(socket);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
class GameHandler extends Thread {

    InputStreamReader dis;
    PrintStream        ps;
    BufferedReader      d;
    String           exit;
    static String   query;
    public Thread       t;
    String       userName;
    String       loginUserName;
    String       homeUserName;
    String       activePeopleUserName;
    String       recordedGamesUserName;
    String      P1;
    String     P2;
    Game           myGame;
    String[]          msg;
    int[][] P1_Steps=new int[3][3];
    int[][] P2_Steps=new int[3][3];
    boolean firstTime= true;
    static ArrayList<Game> currentGames=new ArrayList<Game>() ;
    static ArrayList<GameHandler> clientHandler=new ArrayList<GameHandler>();
    static ArrayList<String> avalible =new ArrayList<>();
    static HashMap<String,PrintStream> clientSteams=new HashMap<String,PrintStream>();
    static HashMap<String,String> couple=new HashMap<String,String>();
    private boolean turnFlag=true;
    
    public GameHandler(){}
    public GameHandler(Socket socket) {
        try {
            homeUserName="";
            loginUserName="";
            activePeopleUserName="";
            recordedGamesUserName="";
            P1="";
            P2="";
            System.out.println("in sever constructor");
            dis =new InputStreamReader(socket.getInputStream());
            d= new BufferedReader(dis);
            this.ps= new PrintStream(socket.getOutputStream());
            clientHandler.add(this);
            t=this;
            myGame=new Game();//??
            start();
        } catch (IOException ex) {
            Logger.getLogger(GameHandler.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void run(){
        while(true){
            
            try {
                query = d.readLine();
                if(query!=null){
                    msg=query.split("-");
                    checkQuery(msg);
                    System.out.println("readLine    "+Arrays.toString(msg));
                }
            } catch (IOException ex) {
                System.out.println("Client Closed the session   ");
                clientHandler.remove(this);
                t.stop();
            }
        }
    }
        //send Transaction to the two player of the same game///V 0.0.3 Edit
    public  void sendTrans(String msg) {
       /*for(GameHandler ch : clientHandler ){
           //if(ch.myGame.P1_UserName !=null &&ch.myGame.P2_UserName !=null)
               System.out.println(""+ch.userName+" =  "+userName+"       "+ch.competitor+"     =  "+competitor);
            if(ch.userName.equals(userName) || ch.competitor.equals(competitor))
                ch.ps.println(msg);
        }*/
       for(Map.Entry m :couple.entrySet()){
                System.out.println(m.getKey()+" "+P1+"  "+P2+"  "+m.getValue());//???
            if(m.getKey().equals(P1) && m.getValue().equals(P2)){ 
                if(clientSteams.containsKey(P1) && clientSteams.containsKey(P2)){
                    clientSteams.get(P1).println(msg);
                    clientSteams.get(P2).println(msg);
                }
           }
       }
   }
    //This Method is for setting two dimesions Array for each player for Calculating the winer and tie mode 
    public void recordStep(String trans){
        switch(trans){
            case "11":
                P1_Steps[0][0]=1;
                break;
            case "21":
                P1_Steps[0][1]=1;
                break;
            case "31":
                P1_Steps[0][2]=1;
                break;
            case "41":
                P1_Steps[1][0]=1;
                break;
            case "51":
                P1_Steps[1][1]=1;
                break;
            case "61":
                P1_Steps[1][2]=1;
                break;
            case "71":
                P1_Steps[2][0]=1;
                break;
            case "81":
                P1_Steps[2][1]=1;
                break;
            case "91":
                P1_Steps[2][2]=1;
                break;
            case "12":
                P2_Steps[0][0]=1;
                break;
            case "22":
                P2_Steps[0][1]=1;
                break;
             case "32":
                P2_Steps[0][2]=1;
                break;
            case "42":
                P2_Steps[1][0]=1;
                break;
            case "52":
                P2_Steps[1][1]=1;
                break;
            case "62":
                P2_Steps[1][2]=1;
                break;
            case "72":
                P2_Steps[2][0]=1;
                break;
            case "82":
                P2_Steps[2][1]=1;
                break;
            case "92":
                P2_Steps[2][2]=1;
                break;
        }
    }
            /////V 0.0.3 Edited
    public void checkQuery(String[] msg) {
        switch(msg[0]){
            case "newConnection"://newConnection-username
               userName=msg[1];
               clientSteams.put(userName, ps);
               P1=msg[2];
               P2=msg[3];
               System.out.println(userName+"<- un   newConnection  p1-. "+P1+"   ->"+P2+"            "+Arrays.toString(msg));
               break;
            case "reqestGame"://reqestGame-firstUserName-SecondUserName//??
               myGame=new Game(msg[1], msg[2]);
               P1=msg[1];
               P2=msg[2];
               System.out.println(userName+"<- un    reqestGame     p1-. "+P1+"   ->"+P2+"   "+Arrays.toString(msg));
               sendRequest(msg);
               break;
            case "trans"://trans-12
               myGame.setStep(msg[1]);
               recordStep(msg[1]);
               System.out.println(" "+(myGame.getStepLength()));
               sendTrans(msg[1]);
               System.out.println(" checkQuery  "+msg[1]);
               if(myGame.someoneWin(P1_Steps,P2_Steps)==1){
                   sendTrans("P1_Win");
               }
               if(myGame.someoneWin(P1_Steps,P2_Steps)==2){
                   sendTrans("P2_Win");
                   
               }
               if(myGame.someoneWin(P1_Steps,P2_Steps)==3){
                   sendTrans("tie");
                   
               }
                System.out.println(userName+"<- un    trans     p1-. "+P1+"   ->"+P2);
               break;
            case "acceptRequest"://acceptRequest-acceptor-requester
                myGame=new Game(msg[2], msg[1]);
                P1=msg[1];
                //userName=msg[2];
                //clientSteams.put(msg[1], ps);
                P2=msg[2];
                couple.put(msg[1], msg[2]);
                System.out.println(userName+"<- un    acceptRequest     p1-. "+P1+"   ->"+P2);
                sendConfirm(msg,"accepted");
                break;
            case "play_Again":
               playAgain();
               break;
            case "login":
               checkLogin(msg);
               break;
            case "signUp":
                signUp(msg);
                break;
            case "available":
                setAvailable(msg);
                break;
            case "getAvailable" :
                getAvailableClients();    
                break;
            case "getAvailabeRecord":
                getAvailabeRecord(msg[1]);
                break;
            case "newHome":
                homeUserName=msg[1];
                break;
            case "newActivePeople":
                activePeopleUserName=msg[1];
                break;
            case "newRecordedGamesList":
                recordedGamesUserName=msg[1];
                break;
            case "rejected":
                sendConfirm(msg,"rejected");
                break;
            case "checkIf_P2_WantToRecordTheGame":
                
                for(Map.Entry m :couple.entrySet()){
                    if(m.getKey().equals(msg[1])){// i think this is the true one
                        clientSteams.get(m.getValue()).println("Do_You_Want_To_Save_The_Game");////<--------look
                    }
                }
                
                break;
            case "Yes_P2_Want_To_Record_The_Game":
                for(Map.Entry m :couple.entrySet()){
                    if(m.getValue().equals(msg[1])){//getValue because i want to send to player 1
                        clientSteams.get(m.getKey()).println("Yes_P2_Want_To_Record_The_Game");
                    }
                }
                break;
            case "No_P2_Doesnt_Want_To_Record_The_Game":
                for(Map.Entry m :couple.entrySet()){
                    if(m.getValue().equals(msg[1])){
                        clientSteams.get(m.getKey()).println("No_P2_Doesnt_Want_To_Record_The_Game");
                    }
                }
                break;  
            case "recordGame"://query="recordGame-"+player1+"-"+player2+"-"+recorededGame;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        
                        int x=msg.length;
                        String[] steps=new String[9];
                        int j=0;
                        for(int i = 3;i<msg.length;i++){
                            
                            steps[j]=msg[i];
                            System.out.println("--------- "+steps[j]);
                            j++;
                        }
                        for(int z=msg.length-3; z<9;z++){
                            steps[z]="NULL";
                        }
                        DBClass db =new DBClass();
                        db.setGame(msg[1], msg[2],steps);
                    }
                }).start();
                break;
            case "ScorePlus":
                DBClass db =new DBClass();
                db.plusScore(userName);
                break;
            case "getScores":
                DBClass d =new DBClass();
                String score1;
                String score2;
                score1=d.getScore(msg[1]);
                score2=d.getScore(msg[2]);
                sendTrans("Scores-"+msg[1]+"-"+msg[2]+"-"+score1+"-"+score2);
                System.out.println("Scores-"+msg[1]+"-"+msg[2]+"-"+score1+"-"+score2);
                //ps.println("Scores-"+msg[1]+"-"+msg[2]+"-"+score1+"-"+score2);
                break;
            case "removeCouple"://removes the two players from couple list and adding the two players to avilable list to be able to accept new request
                removeCouple(msg);
                break;
            default:
                System.out.println("Wrong Qurey"+msg[0]);
       }
    }

    private void playAgain() {
        
        for(Map.Entry m :couple.entrySet()){
           if(m.getKey().equals(P1) && m.getValue().equals(P2)){//i think wrong code
               clientSteams.get(P1).println("play_Again");
               clientSteams.get(P2).println("play_Again");
           }
       }
       for(GameHandler ch : clientHandler ){
               if(ch.userName.equals(userName) || ch.P2.equals(P2))
                    Arrays.fill(ch.P1_Steps, 0);
                    Arrays.fill(ch.P2_Steps, 0);
                    ch.myGame.Steps.clear();
                    
                
               }
    }

    private void checkLogin(String[] ms) {
        int result=1;
        for(GameHandler g :clientHandler){
            if(g.loginUserName.equals(msg[1])){
               result=3;
            }
        }
        if(result!=3){
            DBClass db=new DBClass();
            result= db.login(ms[1], ms[2]);
           
        }
        switch(result){
            case 0:
                loginUserName=msg[1];
                break;
        }
        ps.println(""+result);
        System.out.println("-> "+result);
    }

    private void signUp(String[] msg) {
       DBClass db=new DBClass();
       int result=db.isAlreadySigned(msg[1]);
       if(result==DBClass.IS_ALREADY_SIGNED){
           ps.println(""+result);
       }else{
           db.setPlayer(msg[1],msg[2]);
           if(db.isAlreadySigned(msg[1])==DBClass.IS_ALREADY_SIGNED){
               System.out.println(" ");
               ps.println("1");//Signed Up SucessFully 
           }
       }
    }

    private void setAvailable(String[] ms) {
        if(!avalible.contains(ms[1])){
            DBClass db=new DBClass();
            db.setAvailable(ms[1]);
            avalible.add(ms[1]);
            System.out.println("    av  "+ms[1]);
            clientSteams.remove(ms[1]);
        }
    }

    private void getAvailableClients() { 
        String sum="avalible-";
        for(String x :avalible){
           if(!couple.containsKey(x) && !couple.containsValue(x))
            sum=sum+x+"-";
        }
        System.out.println(avalible.size()+"    "+sum);
        ps.println(sum);
    }

    private void sendRequest(String[] req){//Send Name Of Reqester P1 how sent the request
       for(GameHandler g : clientHandler){
           if(g.homeUserName.equals(req[2]))//send to P2 ---> P1 name
               g.ps.println("request-"+req[1]);//P1 requset to play with you \\sends P1 Name
            }
       
    }
    
    

    private void sendConfirm(String[] string, String type) {
        if(type.equals("accepted")){
            for(GameHandler g: clientHandler){
                System.out.println("    "+g.activePeopleUserName+"     |sendConfirm|  "+string[1]);
                if(g.activePeopleUserName.equals(string[1])){//send to the player how request the game"P1" that the compatitor "P2" accepted the game
                    g.ps.println("accepted");
                }
            }
        }else if(type.equals("rejected")){
            for(GameHandler g: clientHandler){
                System.out.println("    "+g.activePeopleUserName+"     |sendConfirm|  "+string[1]);
                if(g.activePeopleUserName.equals(string[1])){//send to the player how request the game"P1" that the compatitor "P2" accepted the game
                    g.ps.println("rejected");
                }
            }
        }
    }

    private void getAvailabeRecord(String name) {
       DBClass db=new DBClass();
       String query=db.getAvilabileRecordes(name);
       ps.println(query);
    }

    private void removeCouple(String[] msg) {
        if(couple.containsKey(msg[1]))
            couple.remove(msg[1]);
        /*for(GameHandler g: clientHandler){
            if(g.activePeopleUserName.equals(msg[1]))
                clientHandler.remove(g);
        }*/
    for (Iterator<GameHandler> it = clientHandler.iterator(); it.hasNext(); ) {
        GameHandler gameHandler = it.next();
    if (gameHandler.activePeopleUserName.equals(msg[1])) {
        it.remove();
    }
}

        /*avalible.add(msg[1]);
        avalible.add(msg[2]);*/
    }
}
class Game{
    String P1_UserName;
    String P2_UserName;
    ArrayList<String> Steps=new ArrayList<String>();
    boolean P1_Recored;
    boolean P2_Recored;
    GameHandler P1;
    GameHandler P2;
    public Game(){}
    public Game(String P1_UserName,String P2_UserName){
        this.P1_UserName=P1_UserName;
        this.P2_UserName=P2_UserName;
    }
    public void setStep(String step){
        Steps.add(step);
        System.out.println(P1_UserName+"    "+step);
    }
    public void setRecordOption(boolean P1_Recored,boolean P2_Recored){
    this.P1_Recored=P1_Recored;
    this.P2_Recored=P2_Recored;
    }
    public void setPlayer1(String P1_UserName){
    this.P1_UserName=P1_UserName;
    }
    public void setPlayer2(String P2_UserName){
    this.P2_UserName=P2_UserName;
    }
    public int getStepLength(){
        return Steps.lastIndexOf(Steps);
    }
    public int someoneWin(int[][] p1, int[][] p2){
        //  0   0   1
        //  0   1   0
        //  1   0   0   
        //0+0+0+0+0+1
        int result=0;
        if(((p1[0][0]*p1[0][1]*p1[0][2])+(p1[1][0]*p1[1][1]*p1[1][2])+(p1[2][0]*p1[2][1]*p1[2][2])+(p1[0][0]*p1[1][1]*p1[2][2])+(p1[0][2]*p1[1][1]*p1[2][0])
                +(p1[0][0]*p1[1][0]*p1[2][0])+(p1[0][1]*p1[1][1]*p1[2][1])+(p1[0][2]*p1[1][2]*p1[2][2]))>0){
           result=1;
        }
        if(((p2[0][0]*p2[0][1]*p2[0][2])+(p2[1][0]*p2[1][1]*p2[1][2])+(p2[2][0]*p2[2][1]*p2[2][2])+(p2[0][0]*p2[1][1]*p2[2][2])+(p2[0][2]*p2[1][1]*p2[2][0])
                +(p2[0][0]*p2[1][0]*p2[2][0])+(p2[0][1]*p2[1][1]*p2[2][1])+(p2[0][2]*p2[1][2]*p2[2][2]))>0){
           result=2;
        }
        System.out.println(""+Steps.size());
        if(Steps.size()==5 && result==0){
             result=3;
        }
        return result;
    }
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

