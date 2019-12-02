/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author a
 */
public class video extends JApplet {
    static Media m;
    static MediaPlayer mediaPanel;
    MediaPlayer player;
    Media media;
    MediaView MV;
    Thread t;
    Stage primaryStage;
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
                
                JFrame frame = new JFrame("you won");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                JApplet applet = new video();
                applet.init();
                
                frame.setContentPane(applet.getContentPane());
                
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                applet.start();
                
            }
        });
   
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                createScene();
            }
        });
    }
    
    private void createScene() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
                try{
            
            File file = new File("1.mp4");//Video Folder Should Be in the Same Of .java File path
            if(file != null){
                String mediaUrl = file.toURI().toString();
                System.out.println(""+mediaUrl);
                mediaUrl="file:/E:/All/Me/Faculty/ITD/projects/Java_Advanced/Day3/Game_Frame/src/1.mp4";
                if(mediaUrl !=null){
                    
                    media = new Media(mediaUrl);
                    player = new MediaPlayer(media);
                    MV=new MediaView(player);
                    StackPane root=new StackPane();
                    root.getChildren().add(MV);
                    fxContainer.setScene(new Scene(root));
                    /*primaryStage.setScene(new Scene(root,480,294));
                    primaryStage.setMaxHeight(294);
                    primaryStage.setMaxWidth(480);
                    primaryStage.setTitle("Congratulations For Wining");  
                    primaryStage.show(); */
                    player.play();
                   
                   
                    
                
                }else{
                    System.out.println("File Not Found");
                }
            }else{
                System.out.println("File Not Found");
            }
        }catch(Exception ex){
            System.out.println("File Not Found");
        }

        
    }
    
}
