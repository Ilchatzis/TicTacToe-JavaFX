/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ilcha
 */
public class Game {
    private final StackPane rootPane ;
    Boolean flag = Menu.getFlag();
    static Boolean player = false;
    static int count = 0;
    static Boolean Xishere1 = false;
    static Boolean Xishere2 = false;
    static Boolean Xishere3 = false;
    static Boolean Xishere4 = false;
    static Boolean Xishere5 = false;
    static Boolean Xishere6 = false;
    static Boolean Xishere7 = false;
    static Boolean Xishere8 = false;
    static Boolean Xishere9 = false;
    static Boolean Oishere1 = false;
    static Boolean Oishere2 = false;
    static Boolean Oishere3 = false;
    static Boolean Oishere4 = false;
    static Boolean Oishere5 = false;
    static Boolean Oishere6 = false;
    static Boolean Oishere7 = false;
    static Boolean Oishere8 = false;
    static Boolean Oishere9 = false;
    static Button btn1 = new Button();
    static Button btn2 = new Button();
    static Button btn3 = new Button();
    static Button btn4 = new Button();
    static Button btn5 = new Button();
    static Button btn6 = new Button();
    static Button btn7 = new Button();
    static Button btn8 = new Button();
    static Button btn9 = new Button();
    
    static Image icon1 = new Image("/images/X.png",120,120,false,true);
    static ImageView Xbtn1 = new ImageView(icon1);
    static ImageView Xbtn2 = new ImageView(icon1);
    static ImageView Xbtn3 = new ImageView(icon1);
    static ImageView Xbtn4 = new ImageView(icon1);
    static ImageView Xbtn5 = new ImageView(icon1);
    static ImageView Xbtn6 = new ImageView(icon1);
    static ImageView Xbtn7 = new ImageView(icon1);
    static ImageView Xbtn8 = new ImageView(icon1);
    static ImageView Xbtn9 = new ImageView(icon1);
    
    static Image icon2 = new Image("/images/O.png",120,120,false,true);
    static ImageView Obtn1 = new ImageView(icon2);
    static ImageView Obtn2 = new ImageView(icon2);
    static ImageView Obtn3 = new ImageView(icon2);
    static ImageView Obtn4 = new ImageView(icon2);
    static ImageView Obtn5 = new ImageView(icon2);
    static ImageView Obtn6 = new ImageView(icon2);
    static ImageView Obtn7 = new ImageView(icon2);
    static ImageView Obtn8 = new ImageView(icon2);
    static ImageView Obtn9 = new ImageView(icon2);
    
    static Image pla = new Image("/images/Player.png",230,30,false,true);
    static ImageView playing = new ImageView(pla);
    static FadeTransition fadeoutplay = new FadeTransition(Duration.millis(1000), playing);
    static Image rarr = new Image("/images/rArrow.png",30,30,false,true);
    static ImageView rArrow = new ImageView(rarr);
    static FadeTransition fadeinrarrow = new FadeTransition(Duration.millis(1000), rArrow);
    static FadeTransition fadeoutrarrow = new FadeTransition(Duration.millis(1200), rArrow);
    static Image larr = new Image("/images/lArrow.png",30,30,false,true);
    static ImageView lArrow = new ImageView(larr);
    static FadeTransition fadeinlarrow = new FadeTransition(Duration.millis(1000), lArrow);
    static FadeTransition fadeoutlarrow = new FadeTransition(Duration.millis(1200), lArrow);
    static Button scoreX = new Button();
    static Button scoreO = new Button();
    static int pointsX = 0;
    static int pointsO = 0;
    static FadeTransition fadeoutscoreX = new FadeTransition(Duration.millis(1000), scoreX);
    static FadeTransition fadeoutscoreO = new FadeTransition(Duration.millis(1000), scoreO);
    
    static Image line = new Image("/images/winline.png",41,465,false,true);
    static ImageView winline1 = new ImageView(line);
    static ImageView winline2 = new ImageView(line);
    static ImageView winline3 = new ImageView(line);
    static Image linehor = new Image("/images/winlinehor.png",465,41,false,true);
    static ImageView winline4 = new ImageView(linehor);
    static ImageView winline5 = new ImageView(linehor);
    static ImageView winline6 = new ImageView(linehor);
    static Image linerot1 = new Image("/images/winlinerot1.png",465,465,false,true);
    static ImageView winline7 = new ImageView(linerot1);
    static Image linerot2 = new Image("/images/winlinerot2.png",465,465,false,true);
    static ImageView winline8 = new ImageView(linerot2);
    
    static ScaleTransition scaleline1 =
            new ScaleTransition(Duration.millis(200), winline1);   
    static ScaleTransition scaleline2 =
            new ScaleTransition(Duration.millis(200), winline2);  
    static ScaleTransition scaleline3 =
            new ScaleTransition(Duration.millis(200), winline3);
    static ScaleTransition scaleline4 =
            new ScaleTransition(Duration.millis(200), winline4);
    static ScaleTransition scaleline5 =
            new ScaleTransition(Duration.millis(200), winline5);
    static ScaleTransition scaleline6 =
            new ScaleTransition(Duration.millis(200), winline6);
    static ScaleTransition scaleline7 =
            new ScaleTransition(Duration.millis(200), winline7);
    static ScaleTransition scaleline8 =
            new ScaleTransition(Duration.millis(200), winline8);
    
    static ScaleTransition scalelinerev1 =
            new ScaleTransition(Duration.millis(200), winline1);   
    static ScaleTransition scalelinerev2 =
            new ScaleTransition(Duration.millis(200), winline2);  
    static ScaleTransition scalelinerev3 =
            new ScaleTransition(Duration.millis(200), winline3);
    static ScaleTransition scalelinerev4 =
            new ScaleTransition(Duration.millis(200), winline4);
    static ScaleTransition scalelinerev5 =
            new ScaleTransition(Duration.millis(200), winline5);
    static ScaleTransition scalelinerev6 =
            new ScaleTransition(Duration.millis(200), winline6);
    static ScaleTransition scalelinerev7 =
            new ScaleTransition(Duration.millis(200), winline7);
    static ScaleTransition scalelinerev8 =
            new ScaleTransition(Duration.millis(200), winline8);
    
        FadeTransition fadeinrevXbtn1 = new FadeTransition(Duration.millis(400), Xbtn1);
        ScaleTransition scalerevXbtn1 =
            new ScaleTransition(Duration.millis(400), Xbtn1);
        FadeTransition fadeinrevXbtn2 = new FadeTransition(Duration.millis(400), Xbtn2);
        ScaleTransition scalerevXbtn2 =
            new ScaleTransition(Duration.millis(400), Xbtn2);
        FadeTransition fadeinrevXbtn3 = new FadeTransition(Duration.millis(400), Xbtn3);
        ScaleTransition scalerevXbtn3 =
            new ScaleTransition(Duration.millis(400), Xbtn3);
        FadeTransition fadeinrevXbtn4 = new FadeTransition(Duration.millis(400), Xbtn4);
        ScaleTransition scalerevXbtn4 =
            new ScaleTransition(Duration.millis(400), Xbtn4);
        FadeTransition fadeinrevXbtn5 = new FadeTransition(Duration.millis(400), Xbtn5);
        ScaleTransition scalerevXbtn5 =
            new ScaleTransition(Duration.millis(400), Xbtn5);
        FadeTransition fadeinrevXbtn6 = new FadeTransition(Duration.millis(400), Xbtn6);
        ScaleTransition scalerevXbtn6 =
            new ScaleTransition(Duration.millis(400), Xbtn6);
        FadeTransition fadeinrevXbtn7 = new FadeTransition(Duration.millis(400), Xbtn7);
        ScaleTransition scalerevXbtn7 =
            new ScaleTransition(Duration.millis(400), Xbtn7);
        FadeTransition fadeinrevXbtn8 = new FadeTransition(Duration.millis(400), Xbtn8);
        ScaleTransition scalerevXbtn8 =
            new ScaleTransition(Duration.millis(400), Xbtn8);
        FadeTransition fadeinrevXbtn9 = new FadeTransition(Duration.millis(400), Xbtn9);
        ScaleTransition scalerevXbtn9 =
            new ScaleTransition(Duration.millis(400), Xbtn9);
        FadeTransition fadeinrevObtn1 = new FadeTransition(Duration.millis(400), Obtn1);
        ScaleTransition scalerevObtn1 =
            new ScaleTransition(Duration.millis(400), Obtn1);
        FadeTransition fadeinrevObtn2 = new FadeTransition(Duration.millis(400), Obtn2);
        ScaleTransition scalerevObtn2 =
            new ScaleTransition(Duration.millis(400), Obtn2);
        FadeTransition fadeinrevObtn3 = new FadeTransition(Duration.millis(400), Obtn3);
        ScaleTransition scalerevObtn3 =
            new ScaleTransition(Duration.millis(400), Obtn3);
        FadeTransition fadeinrevObtn4 = new FadeTransition(Duration.millis(400), Obtn4);
        ScaleTransition scalerevObtn4 =
            new ScaleTransition(Duration.millis(400), Obtn4);
        FadeTransition fadeinrevObtn5 = new FadeTransition(Duration.millis(400), Obtn5);
        ScaleTransition scalerevObtn5 =
            new ScaleTransition(Duration.millis(400), Obtn5);
        FadeTransition fadeinrevObtn6 = new FadeTransition(Duration.millis(400), Obtn6);
        ScaleTransition scalerevObtn6 =
            new ScaleTransition(Duration.millis(400), Obtn6);
        FadeTransition fadeinrevObtn7 = new FadeTransition(Duration.millis(400), Obtn7);
        ScaleTransition scalerevObtn7 =
            new ScaleTransition(Duration.millis(400), Obtn7);
        FadeTransition fadeinrevObtn8 = new FadeTransition(Duration.millis(400), Obtn8);
        ScaleTransition scalerevObtn8 =
            new ScaleTransition(Duration.millis(400), Obtn8);
        FadeTransition fadeinrevObtn9 = new FadeTransition(Duration.millis(400), Obtn9);
        ScaleTransition scalerevObtn9 =
            new ScaleTransition(Duration.millis(400), Obtn9);
    public Game(Stage stage) {
        rootPane = new StackPane();
        BackgroundImage img = new BackgroundImage(new Image("/images/background.png",700,760,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        rootPane.setBackground(new Background(img));
        
        URL path = getClass().getResource("/sounds/mainsound.wav");
        AudioClip main = new AudioClip(path.toString());
        main.setCycleCount(AudioClip.INDEFINITE);
        URL path2 = getClass().getResource("/sounds/onhover.wav");
        AudioClip hover = new AudioClip(path2.toString());
        URL path3 = getClass().getResource("/sounds/click.wav");
        AudioClip click = new AudioClip(path3.toString());
        URL path4 = getClass().getResource("/sounds/Oclick.wav");
        AudioClip Oclick = new AudioClip(path4.toString());
        URL path5 = getClass().getResource("/sounds/Xclick.wav");
        AudioClip Xclick = new AudioClip(path5.toString());
        URL path6 = getClass().getResource("/sounds/winsound.wav");
        AudioClip winsound = new AudioClip(path6.toString());
        Image image = new Image("/images/soundon.png");
        ImageView soundon = new ImageView(image);
        soundon.setPreserveRatio(true);
        Image imageoff = new Image("/images/soundoff.png");
        ImageView soundoff = new ImageView(imageoff);
        soundoff.setPreserveRatio(true);
        Image imagegif = new Image("/images/soundon.gif");
        ImageView soundgif = new ImageView(imagegif);
        soundgif.setPreserveRatio(true);
        Image imagegrid = new Image("/images/grid.png");
        ImageView grid = new ImageView(imagegrid);
        grid.setPreserveRatio(true);
        grid.setOpacity(0);
        grid.setTranslateY(85);
        Image X = new Image("/images/X.png",50,50,false,true);
        ImageView Ximage = new ImageView(X);
        Ximage.setTranslateY(-235);
        Ximage.setOpacity(0);
        Image O = new Image("/images/O.png",50,50,false,true);
        ImageView Oimage = new ImageView(O);
        Oimage.setTranslateY(-235);
        Oimage.setTranslateX(300);
        Oimage.setOpacity(0);
        Image imageline = new Image("/images/line.png");
        ImageView line1 = new ImageView(imageline);
        line1.setTranslateY(-235);
        line1.setTranslateX(-260);
        line1.setOpacity(0);
        ImageView line2 = new ImageView(imageline);
        line2.setTranslateY(-235);
        line2.setTranslateX(260);
        line2.setOpacity(0);
        Image dr = new Image("/images/draw.png",230,30,false,true);
        ImageView draw = new ImageView(dr);
        draw.setTranslateY(-235);
        draw.setOpacity(0);
        Image xw = new Image("/images/Xwon.png",230,30,false,true);
        ImageView Xwon = new ImageView(xw);
        Xwon.setTranslateY(-235);
        Xwon.setOpacity(0);
        Image ow = new Image("/images/Owon.png",230,30,false,true);
        ImageView Owon = new ImageView(ow);
        Owon.setTranslateY(-235);
        Owon.setOpacity(0);
        
        playing.setTranslateY(-235);
        playing.setOpacity(0);

        rArrow.setTranslateY(-235);
        rArrow.setTranslateX(140);
        rArrow.setOpacity(0);
        
        lArrow.setTranslateY(-235);
        lArrow.setTranslateX(-140);
        lArrow.setOpacity(0);
        
        scoreX.setPrefSize(50, 50);
        scoreX.setStyle("-fx-background-color: transparent; -fx-font-size: 5.7em; -fx-font-color: black; -fx-font-family: Candara;");
        scoreX.setText(String.valueOf(pointsX));
        scoreX.setTranslateY(-241);
        scoreX.setTranslateX(-221);
        scoreX.setOpacity(0);
        
        scoreO.setPrefSize(50, 50);
        scoreO.setStyle("-fx-background-color: transparent; -fx-font-size: 5.7em; -fx-font-color: black; -fx-font-family: Candara;");
        scoreO.setText(String.valueOf(pointsO));
        scoreO.setTranslateY(-241);
        scoreO.setTranslateX(221);
        scoreO.setOpacity(0);
        
        winline1.setOpacity(0);
        winline1.setDisable(true);
        winline1.setTranslateX(-160);
        winline1.setTranslateY(85);
        winline2.setOpacity(0);
        winline2.setDisable(true);
        winline2.setTranslateY(85);
        winline3.setOpacity(0);
        winline3.setDisable(true);
        winline3.setTranslateX(160);
        winline3.setTranslateY(85);
        winline4.setOpacity(0);
        winline4.setDisable(true);
        winline4.setTranslateY(-68);
        winline5.setOpacity(0);
        winline5.setDisable(true);
        winline5.setTranslateY(85);
        winline6.setOpacity(0);
        winline6.setDisable(true);
        winline6.setTranslateY(237);
        winline7.setOpacity(0);
        winline7.setDisable(true);
        winline7.setTranslateY(85);
        winline8.setOpacity(0);
        winline8.setDisable(true);
        winline8.setTranslateY(85);
        
        Button soundbtn = new Button();
        soundbtn.setStyle("-fx-background-color: transparent; -fx-cursor: hand;");
        soundbtn.setTranslateX(310);
        soundbtn.setTranslateY(330);
        if (flag == false){
            soundbtn.setGraphic(soundon);
        }else{
            soundbtn.setGraphic(soundoff);
        }
        final AtomicReference<Boolean> soundflag = new AtomicReference<Boolean>(flag);
        soundbtn.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (soundflag.get() == false){
                            click.play();
                            main.stop();
                            soundflag.set(true);
                            flag = soundflag.get();
                            soundbtn.setGraphic(soundoff);
                        }
                        else{
                            click.play();
                            main.play();
                            soundflag.set(false);
                            flag = soundflag.get();
                            soundbtn.setGraphic(soundon);
                        }
                    }
            });
        
        soundbtn.setOnMouseEntered(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        hover.play();
                        if (flag == false){
                            soundbtn.setGraphic(soundgif);
                        }
                    }
            });
        
        soundbtn.setOnMouseExited(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (flag == false){
                            soundbtn.setGraphic(soundon);
                        }
                    }
            });
        
        FadeTransition fadein = new FadeTransition(Duration.millis(1750), grid);
        fadein.setFromValue(0.0);
        fadein.setToValue(1.0);
        fadein.setAutoReverse(false);
        fadein.play();
        
        fadeinlarrow.setFromValue(0.0);
        fadeinlarrow.setToValue(1.0);
        fadeinlarrow.setAutoReverse(true);
        fadeinlarrow.setCycleCount(Timeline.INDEFINITE);
        
        fadeinrarrow.setFromValue(0.0);
        fadeinrarrow.setToValue(1.0);
        fadeinrarrow.setAutoReverse(true);
        fadeinrarrow.setCycleCount(Timeline.INDEFINITE);
        
        FadeTransition fadeinplay = new FadeTransition(Duration.millis(1400), playing);
        fadeinplay.setFromValue(0.0);
        fadeinplay.setToValue(1.0);
        fadeinplay.setAutoReverse(false);
        fadeinplay.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (player == false){
                    fadeinlarrow.play();
                }else{
                    fadeinrarrow.play();
                }
            }
        });
        
        FadeTransition winnerXrev = new FadeTransition(Duration.millis(1000), Xwon);
        winnerXrev.setFromValue(1.0);
        winnerXrev.setToValue(0.0);
        winnerXrev.setAutoReverse(false);
        winnerXrev.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fadeinrevXbtn1.play();
                fadeinrevXbtn2.play();
                fadeinrevXbtn3.play();
                fadeinrevXbtn4.play();
                fadeinrevXbtn5.play();
                fadeinrevXbtn6.play();
                fadeinrevXbtn7.play();
                fadeinrevXbtn8.play();
                fadeinrevXbtn9.play();
                fadeinrevObtn1.play();
                fadeinrevObtn2.play();
                fadeinrevObtn3.play();
                fadeinrevObtn4.play();
                fadeinrevObtn5.play();
                fadeinrevObtn6.play();
                fadeinrevObtn7.play();
                fadeinrevObtn8.play();
                fadeinrevObtn9.play();
                scalerevXbtn1.play();
                scalerevXbtn2.play();
                scalerevXbtn3.play();
                scalerevXbtn4.play();
                scalerevXbtn5.play();
                scalerevXbtn6.play();
                scalerevXbtn7.play();
                scalerevXbtn8.play();
                scalerevXbtn9.play();
                scalerevObtn1.play();
                scalerevObtn2.play();
                scalerevObtn3.play();
                scalerevObtn4.play();
                scalerevObtn5.play();
                scalerevObtn6.play();
                scalerevObtn7.play();
                scalerevObtn8.play();
                scalerevObtn9.play();
                btn1.setDisable(false);
                btn2.setDisable(false);
                btn3.setDisable(false);
                btn4.setDisable(false);
                btn5.setDisable(false);
                btn6.setDisable(false);
                btn7.setDisable(false);
                btn8.setDisable(false);
                btn9.setDisable(false);
                count = 0;
                Xishere1 = false;
                Xishere2 = false;
                Xishere3 = false;
                Xishere4 = false;
                Xishere5 = false;
                Xishere6 = false;
                Xishere7 = false;
                Xishere8 = false;
                Xishere9 = false;
                Oishere1 = false;
                Oishere2 = false;
                Oishere3 = false;
                Oishere4 = false;
                Oishere5 = false;
                Oishere6 = false;
                Oishere7 = false;
                Oishere8 = false;
                Oishere9 = false;
                winline1.setDisable(true);
                winline2.setDisable(true);
                winline3.setDisable(true);
                winline4.setDisable(true);
                winline5.setDisable(true);
                winline6.setDisable(true);
                winline7.setDisable(true);
                winline8.setDisable(true);
                winline1.setOpacity(0);
                winline2.setOpacity(0);
                winline3.setOpacity(0);
                winline4.setOpacity(0);
                winline5.setOpacity(0);
                winline6.setOpacity(0);
                winline7.setOpacity(0);
                winline8.setOpacity(0);
                Check.id = 0;
                fadeinplay.play();
            }
        });
        
        FadeTransition winnerX = new FadeTransition(Duration.millis(1000), Xwon);
        winnerX.setFromValue(0.0);
        winnerX.setToValue(1.0);
        winnerX.setAutoReverse(false);
        winnerX.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scalelinerev1.play();
                scalelinerev2.play();
                scalelinerev3.play();
                scalelinerev4.play();
                scalelinerev5.play();
                scalelinerev6.play();
                scalelinerev7.play();
                scalelinerev8.play();
                if (count % 2 == 0){
                    player = false;
                }
                winnerXrev.play();
            }
        });
        
        FadeTransition winnerOrev = new FadeTransition(Duration.millis(1000), Owon);
        winnerOrev.setFromValue(1.0);
        winnerOrev.setToValue(0.0);
        winnerOrev.setAutoReverse(false);
        winnerOrev.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fadeinrevXbtn1.play();
                fadeinrevXbtn2.play();
                fadeinrevXbtn3.play();
                fadeinrevXbtn4.play();
                fadeinrevXbtn5.play();
                fadeinrevXbtn6.play();
                fadeinrevXbtn7.play();
                fadeinrevXbtn8.play();
                fadeinrevXbtn9.play();
                fadeinrevObtn1.play();
                fadeinrevObtn2.play();
                fadeinrevObtn3.play();
                fadeinrevObtn4.play();
                fadeinrevObtn5.play();
                fadeinrevObtn6.play();
                fadeinrevObtn7.play();
                fadeinrevObtn8.play();
                fadeinrevObtn9.play();
                scalerevXbtn1.play();
                scalerevXbtn2.play();
                scalerevXbtn3.play();
                scalerevXbtn4.play();
                scalerevXbtn5.play();
                scalerevXbtn6.play();
                scalerevXbtn7.play();
                scalerevXbtn8.play();
                scalerevXbtn9.play();
                scalerevObtn1.play();
                scalerevObtn2.play();
                scalerevObtn3.play();
                scalerevObtn4.play();
                scalerevObtn5.play();
                scalerevObtn6.play();
                scalerevObtn7.play();
                scalerevObtn8.play();
                scalerevObtn9.play();
                btn1.setDisable(false);
                btn2.setDisable(false);
                btn3.setDisable(false);
                btn4.setDisable(false);
                btn5.setDisable(false);
                btn6.setDisable(false);
                btn7.setDisable(false);
                btn8.setDisable(false);
                btn9.setDisable(false);
                count = 0;
                Xishere1 = false;
                Xishere2 = false;
                Xishere3 = false;
                Xishere4 = false;
                Xishere5 = false;
                Xishere6 = false;
                Xishere7 = false;
                Xishere8 = false;
                Xishere9 = false;
                Oishere1 = false;
                Oishere2 = false;
                Oishere3 = false;
                Oishere4 = false;
                Oishere5 = false;
                Oishere6 = false;
                Oishere7 = false;
                Oishere8 = false;
                Oishere9 = false;
                winline1.setDisable(true);
                winline2.setDisable(true);
                winline3.setDisable(true);
                winline4.setDisable(true);
                winline5.setDisable(true);
                winline6.setDisable(true);
                winline7.setDisable(true);
                winline8.setDisable(true);
                winline1.setOpacity(0);
                winline2.setOpacity(0);
                winline3.setOpacity(0);
                winline4.setOpacity(0);
                winline5.setOpacity(0);
                winline6.setOpacity(0);
                winline7.setOpacity(0);
                winline8.setOpacity(0);
                Check.id = 0;
                fadeinplay.play();
            }
        });
        
        FadeTransition winnerO = new FadeTransition(Duration.millis(1000), Owon);
        winnerO.setFromValue(0.0);
        winnerO.setToValue(1.0);
        winnerO.setAutoReverse(false);
        winnerO.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scalelinerev1.play();
                scalelinerev2.play();
                scalelinerev3.play();
                scalelinerev4.play();
                scalelinerev5.play();
                scalelinerev6.play();
                scalelinerev7.play();
                scalelinerev8.play();
                if (count % 2 == 0){
                    player = true;
                }
                winnerOrev.play();
            }
        });
        
        FadeTransition winnerdrawrev = new FadeTransition(Duration.millis(1000), draw);
        winnerdrawrev.setFromValue(1.0);
        winnerdrawrev.setToValue(0.0);
        winnerdrawrev.setAutoReverse(false);
        winnerdrawrev.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fadeinrevXbtn1.play();
                fadeinrevXbtn2.play();
                fadeinrevXbtn3.play();
                fadeinrevXbtn4.play();
                fadeinrevXbtn5.play();
                fadeinrevXbtn6.play();
                fadeinrevXbtn7.play();
                fadeinrevXbtn8.play();
                fadeinrevXbtn9.play();
                fadeinrevObtn1.play();
                fadeinrevObtn2.play();
                fadeinrevObtn3.play();
                fadeinrevObtn4.play();
                fadeinrevObtn5.play();
                fadeinrevObtn6.play();
                fadeinrevObtn7.play();
                fadeinrevObtn8.play();
                fadeinrevObtn9.play();
                scalerevXbtn1.play();
                scalerevXbtn2.play();
                scalerevXbtn3.play();
                scalerevXbtn4.play();
                scalerevXbtn5.play();
                scalerevXbtn6.play();
                scalerevXbtn7.play();
                scalerevXbtn8.play();
                scalerevXbtn9.play();
                scalerevObtn1.play();
                scalerevObtn2.play();
                scalerevObtn3.play();
                scalerevObtn4.play();
                scalerevObtn5.play();
                scalerevObtn6.play();
                scalerevObtn7.play();
                scalerevObtn8.play();
                scalerevObtn9.play();
                btn1.setDisable(false);
                btn2.setDisable(false);
                btn3.setDisable(false);
                btn4.setDisable(false);
                btn5.setDisable(false);
                btn6.setDisable(false);
                btn7.setDisable(false);
                btn8.setDisable(false);
                btn9.setDisable(false);
                count = 0;
                Xishere1 = false;
                Xishere2 = false;
                Xishere3 = false;
                Xishere4 = false;
                Xishere5 = false;
                Xishere6 = false;
                Xishere7 = false;
                Xishere8 = false;
                Xishere9 = false;
                Oishere1 = false;
                Oishere2 = false;
                Oishere3 = false;
                Oishere4 = false;
                Oishere5 = false;
                Oishere6 = false;
                Oishere7 = false;
                Oishere8 = false;
                Oishere9 = false;
                winline1.setDisable(true);
                winline2.setDisable(true);
                winline3.setDisable(true);
                winline4.setDisable(true);
                winline5.setDisable(true);
                winline6.setDisable(true);
                winline7.setDisable(true);
                winline8.setDisable(true);
                winline1.setOpacity(0);
                winline2.setOpacity(0);
                winline3.setOpacity(0);
                winline4.setOpacity(0);
                winline5.setOpacity(0);
                winline6.setOpacity(0);
                winline7.setOpacity(0);
                winline8.setOpacity(0);
                Check.draw = false;
                fadeinplay.play();
            }
        });
        
        FadeTransition winnerDraw = new FadeTransition(Duration.millis(1000), draw);
        winnerDraw.setFromValue(0.0);
        winnerDraw.setToValue(1.0);
        winnerDraw.setAutoReverse(false);
        winnerDraw.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                winnerdrawrev.play();
            }
        });
        
        fadeoutplay.setFromValue(1.0);
        fadeoutplay.setToValue(0.0);
        fadeoutplay.setAutoReverse(false);
        fadeoutplay.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Check.draw == true){
                    winnerDraw.play();
                }
                else if (player == true){
                    winnerX.play();
                }else if (player == false){
                    winnerO.play();
                }
            }
        });
        
        FadeTransition fadeinscoreXinit = new FadeTransition(Duration.millis(1100), scoreX);
        fadeinscoreXinit.setFromValue(0.0);
        fadeinscoreXinit.setToValue(1.0);
        fadeinscoreXinit.setAutoReverse(false);
        fadeinscoreXinit.play();
        
        FadeTransition fadeinscoreX = new FadeTransition(Duration.millis(1000), scoreX);
        fadeinscoreX.setFromValue(0.0);
        fadeinscoreX.setToValue(1.0);
        fadeinscoreX.setAutoReverse(false);
        fadeinscoreX.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fadeoutplay.play();
            }
        });
        
        FadeTransition fadeinscoreOinit = new FadeTransition(Duration.millis(1100), scoreO);
        fadeinscoreOinit.setFromValue(0.0);
        fadeinscoreOinit.setToValue(1.0);
        fadeinscoreOinit.setAutoReverse(false);
        fadeinscoreOinit.play();
        
        FadeTransition fadeinscoreO = new FadeTransition(Duration.millis(1000), scoreO);
        fadeinscoreO.setFromValue(0.0);
        fadeinscoreO.setToValue(1.0);
        fadeinscoreO.setAutoReverse(false);
        fadeinscoreO.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fadeoutplay.play();
            }
        });
        
        fadeoutscoreX.setFromValue(1.0);
        fadeoutscoreX.setToValue(0.0);
        fadeoutscoreX.setAutoReverse(false);
        fadeoutscoreX.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                winsound.play();
                scoreX.setText(String.valueOf(pointsX));
                fadeinscoreX.play();
            }
        });
        
        fadeoutscoreO.setFromValue(1.0);
        fadeoutscoreO.setToValue(0.0);
        fadeoutscoreO.setAutoReverse(false);
        fadeoutscoreO.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                winsound.play();
                scoreO.setText(String.valueOf(pointsO));
                fadeinscoreO.play();
            }
        });
        
        fadeoutlarrow.setToValue(0.0);
        fadeoutlarrow.setAutoReverse(false);
        
        fadeoutrarrow.setToValue(0.0);
        fadeoutrarrow.setAutoReverse(false);
        
        FadeTransition fadeinX = new FadeTransition(Duration.millis(1400), Ximage);
        fadeinX.setFromValue(0.0);
        fadeinX.setToValue(1.0);
        fadeinX.setAutoReverse(false);
        fadeinX.play();
        
        TranslateTransition transX =
            new TranslateTransition(Duration.millis(1400), Ximage);
        transX.setFromX(-400);
        transX.setToX(-300);
        transX.setCycleCount(1);
        transX.setAutoReverse(false);
        transX.play();
        
        FadeTransition fadeinO = new FadeTransition(Duration.millis(1400), Oimage);
        fadeinO.setFromValue(0.0);
        fadeinO.setToValue(1.0);
        fadeinO.setAutoReverse(false);
        fadeinO.play();
        
        TranslateTransition transO =
            new TranslateTransition(Duration.millis(1400), Oimage);
        transO.setFromX(400);
        transO.setToX(300);
        transO.setCycleCount(1);
        transO.setAutoReverse(false);
        transO.play();
        transO.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fadeinplay.play();
            }
        });
        
        FadeTransition fadeline1 = new FadeTransition(Duration.millis(1300), line1);
        fadeline1.setFromValue(0.0);
        fadeline1.setToValue(1.0);
        fadeline1.setAutoReverse(false);
        fadeline1.play();
        
        FadeTransition fadeline2 = new FadeTransition(Duration.millis(1300), line2);
        fadeline2.setFromValue(0.0);
        fadeline2.setToValue(1.0);
        fadeline2.setAutoReverse(false);
        fadeline2.play();
        
        // Actual Game ---   
        Xbtn1.setVisible(false);
        Xbtn1.setTranslateY(-68);
        Xbtn1.setTranslateX(-160);
        Xbtn2.setVisible(false);
        Xbtn2.setTranslateY(-68);
        Xbtn3.setVisible(false);
        Xbtn3.setTranslateY(-68);
        Xbtn3.setTranslateX(160);
        Xbtn4.setVisible(false);
        Xbtn4.setTranslateY(85);
        Xbtn4.setTranslateX(-160);
        Xbtn5.setVisible(false);
        Xbtn5.setTranslateY(85);
        Xbtn6.setVisible(false);
        Xbtn6.setTranslateY(85);
        Xbtn6.setTranslateX(160);
        Xbtn7.setVisible(false);
        Xbtn7.setTranslateY(237);
        Xbtn7.setTranslateX(-160);
        Xbtn8.setVisible(false);
        Xbtn8.setTranslateY(237);
        Xbtn9.setVisible(false);
        Xbtn9.setTranslateY(237);
        Xbtn9.setTranslateX(160);
        
        Obtn1.setVisible(false);
        Obtn1.setTranslateY(-68);
        Obtn1.setTranslateX(-160);
        Obtn2.setVisible(false);
        Obtn2.setTranslateY(-68);
        Obtn3.setVisible(false);
        Obtn3.setTranslateY(-68);
        Obtn3.setTranslateX(160);
        Obtn4.setVisible(false);
        Obtn4.setTranslateY(85);
        Obtn4.setTranslateX(-160);
        Obtn5.setVisible(false);
        Obtn5.setTranslateY(85);
        Obtn6.setVisible(false);
        Obtn6.setTranslateY(85);
        Obtn6.setTranslateX(160);
        Obtn7.setVisible(false);
        Obtn7.setTranslateY(237);
        Obtn7.setTranslateX(-160);
        Obtn8.setVisible(false);
        Obtn8.setTranslateY(237);
        Obtn9.setVisible(false);
        Obtn9.setTranslateY(237);
        Obtn9.setTranslateX(160);
        
        // Button Transitions only ---
        FadeTransition fadeinXbtn1 = new FadeTransition(Duration.millis(400), Xbtn1);
        fadeinXbtn1.setFromValue(0.0);
        fadeinXbtn1.setToValue(1.0);
        fadeinXbtn1.setAutoReverse(false);
        
        ScaleTransition scaleXbtn1 =
            new ScaleTransition(Duration.millis(400), Xbtn1);
        scaleXbtn1.setFromX(0.8);
        scaleXbtn1.setFromY(0.8);
        scaleXbtn1.setToX(1);
        scaleXbtn1.setToY(1);
        scaleXbtn1.setCycleCount(1);
        
        FadeTransition fadeinXbtn2 = new FadeTransition(Duration.millis(400), Xbtn2);
        fadeinXbtn2.setFromValue(0.0);
        fadeinXbtn2.setToValue(1.0);
        fadeinXbtn2.setAutoReverse(false);
        
        ScaleTransition scaleXbtn2 =
            new ScaleTransition(Duration.millis(400), Xbtn2);
        scaleXbtn2.setFromX(0.8);
        scaleXbtn2.setFromY(0.8);
        scaleXbtn2.setToX(1);
        scaleXbtn2.setToY(1);
        scaleXbtn2.setCycleCount(1);
        
        FadeTransition fadeinXbtn3 = new FadeTransition(Duration.millis(400), Xbtn3);
        fadeinXbtn3.setFromValue(0.0);
        fadeinXbtn3.setToValue(1.0);
        fadeinXbtn3.setAutoReverse(false);
        
        ScaleTransition scaleXbtn3 =
            new ScaleTransition(Duration.millis(400), Xbtn3);
        scaleXbtn3.setFromX(0.8);
        scaleXbtn3.setFromY(0.8);
        scaleXbtn3.setToX(1);
        scaleXbtn3.setToY(1);
        scaleXbtn3.setCycleCount(1);
        
        FadeTransition fadeinXbtn4 = new FadeTransition(Duration.millis(400), Xbtn4);
        fadeinXbtn4.setFromValue(0.0);
        fadeinXbtn4.setToValue(1.0);
        fadeinXbtn4.setAutoReverse(false);
        
        ScaleTransition scaleXbtn4 =
            new ScaleTransition(Duration.millis(400), Xbtn4);
        scaleXbtn4.setFromX(0.8);
        scaleXbtn4.setFromY(0.8);
        scaleXbtn4.setToX(1);
        scaleXbtn4.setToY(1);
        scaleXbtn4.setCycleCount(1);
        
        FadeTransition fadeinXbtn5 = new FadeTransition(Duration.millis(400), Xbtn5);
        fadeinXbtn5.setFromValue(0.0);
        fadeinXbtn5.setToValue(1.0);
        fadeinXbtn5.setAutoReverse(false);
        
        ScaleTransition scaleXbtn5 =
            new ScaleTransition(Duration.millis(400), Xbtn5);
        scaleXbtn5.setFromX(0.8);
        scaleXbtn5.setFromY(0.8);
        scaleXbtn5.setToX(1);
        scaleXbtn5.setToY(1);
        scaleXbtn5.setCycleCount(1);
        
        FadeTransition fadeinXbtn6 = new FadeTransition(Duration.millis(400), Xbtn6);
        fadeinXbtn6.setFromValue(0.0);
        fadeinXbtn6.setToValue(1.0);
        fadeinXbtn6.setAutoReverse(false);
        
        ScaleTransition scaleXbtn6 =
            new ScaleTransition(Duration.millis(400), Xbtn6);
        scaleXbtn6.setFromX(0.8);
        scaleXbtn6.setFromY(0.8);
        scaleXbtn6.setToX(1);
        scaleXbtn6.setToY(1);
        scaleXbtn6.setCycleCount(1);
        
        FadeTransition fadeinXbtn7 = new FadeTransition(Duration.millis(400), Xbtn7);
        fadeinXbtn7.setFromValue(0.0);
        fadeinXbtn7.setToValue(1.0);
        fadeinXbtn7.setAutoReverse(false);
        
        ScaleTransition scaleXbtn7 =
            new ScaleTransition(Duration.millis(400), Xbtn7);
        scaleXbtn7.setFromX(0.8);
        scaleXbtn7.setFromY(0.8);
        scaleXbtn7.setToX(1);
        scaleXbtn7.setToY(1);
        scaleXbtn7.setCycleCount(1);
        
        FadeTransition fadeinXbtn8 = new FadeTransition(Duration.millis(400), Xbtn8);
        fadeinXbtn8.setFromValue(0.0);
        fadeinXbtn8.setToValue(1.0);
        fadeinXbtn8.setAutoReverse(false);
        
        ScaleTransition scaleXbtn8 =
            new ScaleTransition(Duration.millis(400), Xbtn8);
        scaleXbtn8.setFromX(0.8);
        scaleXbtn8.setFromY(0.8);
        scaleXbtn8.setToX(1);
        scaleXbtn8.setToY(1);
        scaleXbtn8.setCycleCount(1);
        
        FadeTransition fadeinXbtn9 = new FadeTransition(Duration.millis(400), Xbtn9);
        fadeinXbtn9.setFromValue(0.0);
        fadeinXbtn9.setToValue(1.0);
        fadeinXbtn9.setAutoReverse(false);
        
        ScaleTransition scaleXbtn9 =
            new ScaleTransition(Duration.millis(400), Xbtn9);
        scaleXbtn9.setFromX(0.8);
        scaleXbtn9.setFromY(0.8);
        scaleXbtn9.setToX(1);
        scaleXbtn9.setToY(1);
        scaleXbtn9.setCycleCount(1);
        
        FadeTransition fadeinObtn1 = new FadeTransition(Duration.millis(400), Obtn1);
        fadeinObtn1.setFromValue(0.0);
        fadeinObtn1.setToValue(1.0);
        fadeinObtn1.setAutoReverse(false);
        
        ScaleTransition scaleObtn1 =
            new ScaleTransition(Duration.millis(400), Obtn1);
        scaleObtn1.setFromX(0.8);
        scaleObtn1.setFromY(0.8);
        scaleObtn1.setToX(1);
        scaleObtn1.setToY(1);
        scaleObtn1.setCycleCount(1);
        
        FadeTransition fadeinObtn2 = new FadeTransition(Duration.millis(400), Obtn2);
        fadeinObtn2.setFromValue(0.0);
        fadeinObtn2.setToValue(1.0);
        fadeinObtn2.setAutoReverse(false);
        
        ScaleTransition scaleObtn2 =
            new ScaleTransition(Duration.millis(400), Obtn2);
        scaleObtn2.setFromX(0.8);
        scaleObtn2.setFromY(0.8);
        scaleObtn2.setToX(1);
        scaleObtn2.setToY(1);
        scaleObtn2.setCycleCount(1);
        
        FadeTransition fadeinObtn3 = new FadeTransition(Duration.millis(400), Obtn3);
        fadeinObtn3.setFromValue(0.0);
        fadeinObtn3.setToValue(1.0);
        fadeinObtn3.setAutoReverse(false);
        
        ScaleTransition scaleObtn3 =
            new ScaleTransition(Duration.millis(400), Obtn3);
        scaleObtn3.setFromX(0.8);
        scaleObtn3.setFromY(0.8);
        scaleObtn3.setToX(1);
        scaleObtn3.setToY(1);
        scaleObtn3.setCycleCount(1);
        
        FadeTransition fadeinObtn4 = new FadeTransition(Duration.millis(400), Obtn4);
        fadeinObtn4.setFromValue(0.0);
        fadeinObtn4.setToValue(1.0);
        fadeinObtn4.setAutoReverse(false);
        
        ScaleTransition scaleObtn4 =
            new ScaleTransition(Duration.millis(400), Obtn4);
        scaleObtn4.setFromX(0.8);
        scaleObtn4.setFromY(0.8);
        scaleObtn4.setToX(1);
        scaleObtn4.setToY(1);
        scaleObtn4.setCycleCount(1);
        
        FadeTransition fadeinObtn5 = new FadeTransition(Duration.millis(400), Obtn5);
        fadeinObtn5.setFromValue(0.0);
        fadeinObtn5.setToValue(1.0);
        fadeinObtn5.setAutoReverse(false);
        
        ScaleTransition scaleObtn5 =
            new ScaleTransition(Duration.millis(400), Obtn5);
        scaleObtn5.setFromX(0.8);
        scaleObtn5.setFromY(0.8);
        scaleObtn5.setToX(1);
        scaleObtn5.setToY(1);
        scaleObtn5.setCycleCount(1);
        
        FadeTransition fadeinObtn6 = new FadeTransition(Duration.millis(400), Obtn6);
        fadeinObtn6.setFromValue(0.0);
        fadeinObtn6.setToValue(1.0);
        fadeinObtn6.setAutoReverse(false);
        
        ScaleTransition scaleObtn6 =
            new ScaleTransition(Duration.millis(400), Obtn6);
        scaleObtn6.setFromX(0.8);
        scaleObtn6.setFromY(0.8);
        scaleObtn6.setToX(1);
        scaleObtn6.setToY(1);
        scaleObtn6.setCycleCount(1);
        
        FadeTransition fadeinObtn7 = new FadeTransition(Duration.millis(400), Obtn7);
        fadeinObtn7.setFromValue(0.0);
        fadeinObtn7.setToValue(1.0);
        fadeinObtn7.setAutoReverse(false);
        
        ScaleTransition scaleObtn7 =
            new ScaleTransition(Duration.millis(400), Obtn7);
        scaleObtn7.setFromX(0.8);
        scaleObtn7.setFromY(0.8);
        scaleObtn7.setToX(1);
        scaleObtn7.setToY(1);
        scaleObtn7.setCycleCount(1);
        
        FadeTransition fadeinObtn8 = new FadeTransition(Duration.millis(400), Obtn8);
        fadeinObtn8.setFromValue(0.0);
        fadeinObtn8.setToValue(1.0);
        fadeinObtn8.setAutoReverse(false);
        
        ScaleTransition scaleObtn8 =
            new ScaleTransition(Duration.millis(400), Obtn8);
        scaleObtn8.setFromX(0.8);
        scaleObtn8.setFromY(0.8);
        scaleObtn8.setToX(1);
        scaleObtn8.setToY(1);
        scaleObtn8.setCycleCount(1);
        
        FadeTransition fadeinObtn9 = new FadeTransition(Duration.millis(400), Obtn9);
        fadeinObtn9.setFromValue(0.0);
        fadeinObtn9.setToValue(1.0);
        fadeinObtn9.setAutoReverse(false);
        
        ScaleTransition scaleObtn9 =
            new ScaleTransition(Duration.millis(400), Obtn9);
        scaleObtn9.setFromX(0.8);
        scaleObtn9.setFromY(0.8);
        scaleObtn9.setToX(1);
        scaleObtn9.setToY(1);
        scaleObtn9.setCycleCount(1);
        
        //Fadeouts ---
        fadeinrevXbtn1.setFromValue(1.0);
        fadeinrevXbtn1.setToValue(0.0);
        fadeinrevXbtn1.setAutoReverse(false);
        fadeinrevXbtn1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn1.setVisible(false);
            }
        });
        
        scalerevXbtn1.setFromX(1);
        scalerevXbtn1.setFromY(1);
        scalerevXbtn1.setToX(0.8);
        scalerevXbtn1.setToY(0.8);
        scalerevXbtn1.setCycleCount(1);
        
        fadeinrevXbtn2.setFromValue(1.0);
        fadeinrevXbtn2.setToValue(0.0);
        fadeinrevXbtn2.setAutoReverse(false);
        fadeinrevXbtn2.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn2.setVisible(false);
            }
        });
        
        scalerevXbtn2.setFromX(1);
        scalerevXbtn2.setFromY(1);
        scalerevXbtn2.setToX(0.8);
        scalerevXbtn2.setToY(0.8);
        scalerevXbtn2.setCycleCount(1);
        
        fadeinrevXbtn3.setFromValue(1.0);
        fadeinrevXbtn3.setToValue(0.0);
        fadeinrevXbtn3.setAutoReverse(false);
        fadeinrevXbtn3.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn3.setVisible(false);
            }
        });
        
        scalerevXbtn3.setFromX(1);
        scalerevXbtn3.setFromY(1);
        scalerevXbtn3.setToX(0.8);
        scalerevXbtn3.setToY(0.8);
        scalerevXbtn3.setCycleCount(1);
        
        fadeinrevXbtn4.setFromValue(1.0);
        fadeinrevXbtn4.setToValue(0.0);
        fadeinrevXbtn4.setAutoReverse(false);
        fadeinrevXbtn4.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn4.setVisible(false);
            }
        });
        
        scalerevXbtn4.setFromX(1);
        scalerevXbtn4.setFromY(1);
        scalerevXbtn4.setToX(0.8);
        scalerevXbtn4.setToY(0.8);
        scalerevXbtn4.setCycleCount(1);
        
        fadeinrevXbtn5.setFromValue(1.0);
        fadeinrevXbtn5.setToValue(0.0);
        fadeinrevXbtn5.setAutoReverse(false);
        fadeinrevXbtn5.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn5.setVisible(false);
            }
        });
        
        scalerevXbtn5.setFromX(1);
        scalerevXbtn5.setFromY(1);
        scalerevXbtn5.setToX(0.8);
        scalerevXbtn5.setToY(0.8);
        scalerevXbtn5.setCycleCount(1);
        
        fadeinrevXbtn6.setFromValue(1.0);
        fadeinrevXbtn6.setToValue(0.0);
        fadeinrevXbtn6.setAutoReverse(false);
        fadeinrevXbtn6.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn6.setVisible(false);
            }
        });
        
        scalerevXbtn6.setFromX(1);
        scalerevXbtn6.setFromY(1);
        scalerevXbtn6.setToX(0.8);
        scalerevXbtn6.setToY(0.8);
        scalerevXbtn6.setCycleCount(1);
        
        fadeinrevXbtn7.setFromValue(1.0);
        fadeinrevXbtn7.setToValue(0.0);
        fadeinrevXbtn7.setAutoReverse(false);
        fadeinrevXbtn7.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn7.setVisible(false);
            }
        });
        
        scalerevXbtn7.setFromX(1);
        scalerevXbtn7.setFromY(1);
        scalerevXbtn7.setToX(0.8);
        scalerevXbtn7.setToY(0.8);
        scalerevXbtn7.setCycleCount(1);
        
        fadeinrevXbtn8.setFromValue(1.0);
        fadeinrevXbtn8.setToValue(0.0);
        fadeinrevXbtn8.setAutoReverse(false);
        fadeinrevXbtn8.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn8.setVisible(false);
            }
        });
        
        scalerevXbtn8.setFromX(1);
        scalerevXbtn8.setFromY(1);
        scalerevXbtn8.setToX(0.8);
        scalerevXbtn8.setToY(0.8);
        scalerevXbtn8.setCycleCount(1);
        
        fadeinrevXbtn9.setFromValue(1.0);
        fadeinrevXbtn9.setToValue(0.0);
        fadeinrevXbtn9.setAutoReverse(false);
        fadeinrevXbtn9.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Xbtn9.setVisible(false);
            }
        });
        
        scalerevXbtn9.setFromX(1);
        scalerevXbtn9.setFromY(1);
        scalerevXbtn9.setToX(0.8);
        scalerevXbtn9.setToY(0.8);
        scalerevXbtn9.setCycleCount(1);
        
        fadeinrevObtn1.setFromValue(1.0);
        fadeinrevObtn1.setToValue(0.0);
        fadeinrevObtn1.setAutoReverse(false);
        fadeinrevObtn1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn1.setVisible(false);
            }
        });
        
        scalerevObtn1.setFromX(1);
        scalerevObtn1.setFromY(1);
        scalerevObtn1.setToX(0.8);
        scalerevObtn1.setToY(0.8);
        scalerevObtn1.setCycleCount(1);
        
        fadeinrevObtn2.setFromValue(1.0);
        fadeinrevObtn2.setToValue(0.0);
        fadeinrevObtn2.setAutoReverse(false);
        fadeinrevObtn2.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn2.setVisible(false);
            }
        });
        
        scalerevObtn2.setFromX(1);
        scalerevObtn2.setFromY(1);
        scalerevObtn2.setToX(0.8);
        scalerevObtn2.setToY(0.8);
        scalerevObtn2.setCycleCount(1);
        
        fadeinrevObtn3.setFromValue(1.0);
        fadeinrevObtn3.setToValue(0.0);
        fadeinrevObtn3.setAutoReverse(false);
        fadeinrevObtn3.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn3.setVisible(false);
            }
        });
        
        scalerevObtn3.setFromX(1);
        scalerevObtn3.setFromY(1);
        scalerevObtn3.setToX(0.8);
        scalerevObtn3.setToY(0.8);
        scalerevObtn3.setCycleCount(1);
        
        fadeinrevObtn4.setFromValue(1.0);
        fadeinrevObtn4.setToValue(0.0);
        fadeinrevObtn4.setAutoReverse(false);
        fadeinrevObtn4.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn4.setVisible(false);
            }
        });
        
        scalerevObtn4.setFromX(1);
        scalerevObtn4.setFromY(1);
        scalerevObtn4.setToX(0.8);
        scalerevObtn4.setToY(0.8);
        scalerevObtn4.setCycleCount(1);
        
        fadeinrevObtn5.setFromValue(1.0);
        fadeinrevObtn5.setToValue(0.0);
        fadeinrevObtn5.setAutoReverse(false);
        fadeinrevObtn5.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn5.setVisible(false);
            }
        });
        
        scalerevObtn5.setFromX(1);
        scalerevObtn5.setFromY(1);
        scalerevObtn5.setToX(0.8);
        scalerevObtn5.setToY(0.8);
        scalerevObtn5.setCycleCount(1);
        
        fadeinrevObtn6.setFromValue(1.0);
        fadeinrevObtn6.setToValue(0.0);
        fadeinrevObtn6.setAutoReverse(false);
        fadeinrevObtn6.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn6.setVisible(false);
            }
        });
        
        scalerevObtn6.setFromX(1);
        scalerevObtn6.setFromY(1);
        scalerevObtn6.setToX(0.8);
        scalerevObtn6.setToY(0.8);
        scalerevObtn6.setCycleCount(1);
        
        fadeinrevObtn7.setFromValue(1.0);
        fadeinrevObtn7.setToValue(0.0);
        fadeinrevObtn7.setAutoReverse(false);
        fadeinrevObtn7.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn7.setVisible(false);
            }
        });
        
        scalerevObtn7.setFromX(1);
        scalerevObtn7.setFromY(1);
        scalerevObtn7.setToX(0.8);
        scalerevObtn7.setToY(0.8);
        scalerevObtn7.setCycleCount(1);
        
        fadeinrevObtn8.setFromValue(1.0);
        fadeinrevObtn8.setToValue(0.0);
        fadeinrevObtn8.setAutoReverse(false);
        fadeinrevObtn8.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn8.setVisible(false);
            }
        });
        
        scalerevObtn8.setFromX(1);
        scalerevObtn8.setFromY(1);
        scalerevObtn8.setToX(0.8);
        scalerevObtn8.setToY(0.8);
        scalerevObtn8.setCycleCount(1);
        
        fadeinrevObtn9.setFromValue(1.0);
        fadeinrevObtn9.setToValue(0.0);
        fadeinrevObtn9.setAutoReverse(false);
        fadeinrevObtn9.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Obtn9.setVisible(false);
            }
        });
        
        scalerevObtn9.setFromX(1);
        scalerevObtn9.setFromY(1);
        scalerevObtn9.setToX(0.8);
        scalerevObtn9.setToY(0.8);
        scalerevObtn9.setCycleCount(1);
        // ---
        
        // Lines
        scaleline1.setFromY(0);
        scaleline1.setToY(1);
        scaleline1.setCycleCount(1);
        
        scaleline2.setFromY(0);
        scaleline2.setToY(1);
        scaleline2.setCycleCount(1);
        
        scaleline3.setFromY(0);
        scaleline3.setToY(1);
        scaleline3.setCycleCount(1);
        
        scaleline4.setFromX(0);
        scaleline4.setToX(1);
        scaleline4.setCycleCount(1);
        
        scaleline5.setFromX(0);
        scaleline5.setToX(1);
        scaleline5.setCycleCount(1);
        
        scaleline6.setFromX(0);
        scaleline6.setToX(1);
        scaleline6.setCycleCount(1);
        
        scaleline7.setFromX(0);
        scaleline7.setToX(1);
        scaleline7.setFromY(0);
        scaleline7.setToY(1);
        scaleline7.setCycleCount(1);
        
        scaleline8.setFromX(0);
        scaleline8.setToX(1);
        scaleline8.setFromY(0);
        scaleline8.setToY(1);
        scaleline8.setCycleCount(1);
        
        scalelinerev1.setFromY(1);
        scalelinerev1.setToY(0);
        scalelinerev1.setCycleCount(1);
        
        scalelinerev2.setFromY(1);
        scalelinerev2.setToY(0);
        scalelinerev2.setCycleCount(1);
        
        scalelinerev3.setFromY(1);
        scalelinerev3.setToY(0);
        scalelinerev3.setCycleCount(1);
        
        scalelinerev4.setFromX(1);
        scalelinerev4.setToX(0);
        scalelinerev4.setCycleCount(1);
        
        scalelinerev5.setFromX(1);
        scalelinerev5.setToX(0);
        scalelinerev5.setCycleCount(1);
        
        scalelinerev6.setFromX(1);
        scalelinerev6.setToX(0);
        scalelinerev6.setCycleCount(1);
        
        scalelinerev7.setFromX(1);
        scalelinerev7.setToX(0);
        scalelinerev7.setFromY(1);
        scalelinerev7.setToY(0);
        scalelinerev7.setCycleCount(1);
        
        scalelinerev8.setFromX(1);
        scalelinerev8.setToX(0);
        scalelinerev8.setFromY(1);
        scalelinerev8.setToY(0);
        scalelinerev8.setCycleCount(1);
        // ---
        
        // ---
        
        btn1.setPrefSize(145, 135);
        btn1.setTranslateY(-68);
        btn1.setTranslateX(-160);
        btn1.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn1.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn1.setDisable(true);
                            Xbtn1.setVisible(true);
                            fadeinXbtn1.play();
                            scaleXbtn1.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere1 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 1){
                                winline4.setOpacity(1);
                                scaleline4.play();
                            }
                            if (Check.id == 4){
                                winline1.setOpacity(1);
                                scaleline1.play();
                            }
                            if (Check.id == 7){
                                winline7.setOpacity(1);
                                scaleline7.play();
                            }
                        }else{
                            btn1.setDisable(true);
                            Obtn1.setVisible(true);
                            fadeinObtn1.play();
                            scaleObtn1.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere1 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 1){
                                winline4.setOpacity(1);
                                scaleline4.play();
                            }
                            if (Check.id == 4){
                                winline1.setOpacity(1);
                                scaleline1.play();
                            }
                            if (Check.id == 7){
                                winline7.setOpacity(1);
                                scaleline7.play();
                            }
                        }
                    }
            });
        
        btn2.setPrefSize(145, 135);
        btn2.setTranslateY(-68);
        btn2.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn2.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn2.setDisable(true);
                            Xbtn2.setVisible(true);
                            fadeinXbtn2.play();
                            scaleXbtn2.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere2 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 1){
                                winline4.setOpacity(1);
                                scaleline4.play();
                            }
                            if (Check.id == 5){
                                winline2.setOpacity(1);
                                scaleline2.play();
                            }
                        }else{
                            btn2.setDisable(true);
                            Obtn2.setVisible(true);
                            fadeinObtn2.play();
                            scaleObtn2.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere2 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 1){
                                winline4.setOpacity(1);
                                scaleline4.play();
                            }
                            if (Check.id == 5){
                                winline2.setOpacity(1);
                                scaleline2.play();
                            }
                        }
                    }
            });
        
        btn3.setPrefSize(145, 135);
        btn3.setTranslateY(-68);
        btn3.setTranslateX(160);
        btn3.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn3.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn3.setDisable(true);
                            Xbtn3.setVisible(true);
                            fadeinXbtn3.play();
                            scaleXbtn3.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere3 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 1){
                                winline4.setOpacity(1);
                                scaleline4.play();
                            }
                            if (Check.id == 6){
                                winline3.setOpacity(1);
                                scaleline3.play();
                            }
                            if (Check.id == 8){
                                winline8.setOpacity(1);
                                scaleline8.play();
                            }
                        }else{
                            btn3.setDisable(true);
                            Obtn3.setVisible(true);
                            fadeinObtn3.play();
                            scaleObtn3.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere3 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 1){
                                winline4.setOpacity(1);
                                scaleline4.play();
                            }
                            if (Check.id == 6){
                                winline3.setOpacity(1);
                                scaleline3.play();
                            }
                            if (Check.id == 8){
                                winline8.setOpacity(1);
                                scaleline8.play();
                            }
                        }
                    }
            });
        
        btn4.setPrefSize(145, 135);
        btn4.setTranslateY(85);
        btn4.setTranslateX(-160);
        btn4.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn4.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn4.setDisable(true);
                            Xbtn4.setVisible(true);
                            fadeinXbtn4.play();
                            scaleXbtn4.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere4 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 2){
                                winline5.setOpacity(1);
                                scaleline5.play();
                            }
                            if (Check.id == 4){
                                winline1.setOpacity(1);
                                scaleline1.play();
                            }
                        }else{
                            btn4.setDisable(true);
                            Obtn4.setVisible(true);
                            fadeinObtn4.play();
                            scaleObtn4.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere4 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 2){
                                winline5.setOpacity(1);
                                scaleline5.play();
                            }
                            if (Check.id == 4){
                                winline1.setOpacity(1);
                                scaleline1.play();
                            }
                        }
                    }
            });
        
        btn5.setPrefSize(145, 135);
        btn5.setTranslateY(85);
        btn5.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn5.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn5.setDisable(true);
                            Xbtn5.setVisible(true);
                            fadeinXbtn5.play();
                            scaleXbtn5.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere5 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 2){
                                winline5.setOpacity(1);
                                scaleline5.play();
                            }
                            if (Check.id == 5){
                                winline2.setOpacity(1);
                                scaleline2.play();
                            }
                            if (Check.id == 7){
                                winline7.setOpacity(1);
                                scaleline7.play();
                            }
                            if (Check.id == 8){
                                winline8.setOpacity(1);
                                scaleline8.play();
                            }
                        }else{
                            btn5.setDisable(true);
                            Obtn5.setVisible(true);
                            fadeinObtn5.play();
                            scaleObtn5.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere5 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 2){
                                winline5.setOpacity(1);
                                scaleline5.play();
                            }
                            if (Check.id == 5){
                                winline2.setOpacity(1);
                                scaleline2.play();
                            }
                            if (Check.id == 7){
                                winline7.setOpacity(1);
                                scaleline7.play();
                            }
                            if (Check.id == 8){
                                winline8.setOpacity(1);
                                scaleline8.play();
                            }
                            
                        }
                    }
            });
        
        btn6.setPrefSize(145, 135);
        btn6.setTranslateY(85);
        btn6.setTranslateX(160);
        btn6.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn6.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn6.setDisable(true);
                            Xbtn6.setVisible(true);
                            fadeinXbtn6.play();
                            scaleXbtn6.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere6 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 2){
                                winline5.setOpacity(1);
                                scaleline5.play();
                            }
                            if (Check.id == 6){
                                winline3.setOpacity(1);
                                scaleline3.play();
                            }
                        }else{
                            btn6.setDisable(true);
                            Obtn6.setVisible(true);
                            fadeinObtn6.play();
                            scaleObtn6.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere6 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 2){
                                winline5.setOpacity(1);
                                scaleline5.play();
                            }
                            if (Check.id == 6){
                                winline3.setOpacity(1);
                                scaleline3.play();
                            }
                        }
                    }
            });
        
        btn7.setPrefSize(145, 135);
        btn7.setTranslateY(237);
        btn7.setTranslateX(-160);
        btn7.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn7.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn7.setDisable(true);
                            Xbtn7.setVisible(true);
                            fadeinXbtn7.play();
                            scaleXbtn7.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere7 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 3){
                                winline6.setOpacity(1);
                                scaleline6.play();
                            }
                            if (Check.id == 4){
                                winline1.setOpacity(1);
                                scaleline1.play();
                            }
                            if (Check.id == 8){
                                winline8.setOpacity(1);
                                scaleline8.play();
                            }
                        }else{
                            btn7.setDisable(true);
                            Obtn7.setVisible(true);
                            fadeinObtn7.play();
                            scaleObtn7.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere7 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 3){
                                winline6.setOpacity(1);
                                scaleline6.play();
                            }
                            if (Check.id == 4){
                                winline1.setOpacity(1);
                                scaleline1.play();
                            }
                            if (Check.id == 8){
                                winline8.setOpacity(1);
                                scaleline8.play();
                            }
                        }
                    }
            });
        
        btn8.setPrefSize(145, 135);
        btn8.setTranslateY(237);
        btn8.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn8.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn8.setDisable(true);
                            Xbtn8.setVisible(true);
                            fadeinXbtn8.play();
                            scaleXbtn8.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere8 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 3){
                                winline6.setOpacity(1);
                                scaleline6.play();
                            }
                            if (Check.id == 5){
                                winline2.setOpacity(1);
                                scaleline2.play();
                            }
                        }else{
                            btn8.setDisable(true);
                            Obtn8.setVisible(true);
                            fadeinObtn8.play();
                            scaleObtn8.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere8 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 3){
                                winline6.setOpacity(1);
                                scaleline6.play();
                            }
                            if (Check.id == 5){
                                winline2.setOpacity(1);
                                scaleline2.play();
                            }
                        }
                    }
            });
        
        btn9.setPrefSize(145, 135);
        btn9.setTranslateY(237);
        btn9.setTranslateX(160);
        btn9.setStyle("-fx-border-color: rgb(238,233,208); -fx-background-color: rgb(238,233,208);");
        btn9.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        if (player == false){
                            btn9.setDisable(true);
                            Xbtn9.setVisible(true);
                            fadeinXbtn9.play();
                            scaleXbtn9.play();
                            Xclick.play();
                            fadeinlarrow.stop();
                            fadeoutlarrow.play();
                            fadeinrarrow.play();
                            Xishere9 = true;
                            player = true;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 3){
                                winline6.setOpacity(1);
                                scaleline6.play();
                            }
                            if (Check.id == 6){
                                winline3.setOpacity(1);
                                scaleline3.play();
                            }
                            if (Check.id == 7){
                                winline7.setOpacity(1);
                                scaleline7.play();
                            }
                        }else{
                            btn9.setDisable(true);
                            Obtn9.setVisible(true);
                            fadeinObtn9.play();
                            scaleObtn9.play();
                            Oclick.play();
                            fadeinrarrow.stop();
                            fadeoutrarrow.play();
                            fadeinlarrow.play();
                            Oishere9 = true;
                            player = false;
                            count++;
                            Check.checkWinner();
                            if (Check.id == 3){
                                winline6.setOpacity(1);
                                scaleline6.play();
                            }
                            if (Check.id == 6){
                                winline3.setOpacity(1);
                                scaleline3.play();
                            }
                            if (Check.id == 7){
                                winline7.setOpacity(1);
                                scaleline7.play();
                            }
                        }
                    }
            });
        
        // ---
        
        rootPane.getChildren().add(soundbtn);
        rootPane.getChildren().add(grid);
        rootPane.getChildren().add(Ximage);
        rootPane.getChildren().add(Oimage);
        rootPane.getChildren().add(line1);
        rootPane.getChildren().add(line2);
        rootPane.getChildren().add(btn1);
        rootPane.getChildren().add(btn2);
        rootPane.getChildren().add(btn3);
        rootPane.getChildren().add(btn4);
        rootPane.getChildren().add(btn5);
        rootPane.getChildren().add(btn6);
        rootPane.getChildren().add(btn7);
        rootPane.getChildren().add(btn8);
        rootPane.getChildren().add(btn9);
        rootPane.getChildren().add(Xbtn1);
        rootPane.getChildren().add(Xbtn2);
        rootPane.getChildren().add(Xbtn3);
        rootPane.getChildren().add(Xbtn4);
        rootPane.getChildren().add(Xbtn5);
        rootPane.getChildren().add(Xbtn6);
        rootPane.getChildren().add(Xbtn7);
        rootPane.getChildren().add(Xbtn8);
        rootPane.getChildren().add(Xbtn9);
        rootPane.getChildren().add(Obtn1);
        rootPane.getChildren().add(Obtn2);
        rootPane.getChildren().add(Obtn3);
        rootPane.getChildren().add(Obtn4);
        rootPane.getChildren().add(Obtn5);
        rootPane.getChildren().add(Obtn6);
        rootPane.getChildren().add(Obtn7);
        rootPane.getChildren().add(Obtn8);
        rootPane.getChildren().add(Obtn9);
        rootPane.getChildren().add(playing);
        rootPane.getChildren().add(rArrow);
        rootPane.getChildren().add(lArrow);
        rootPane.getChildren().add(scoreX);
        rootPane.getChildren().add(scoreO);
        rootPane.getChildren().add(Xwon);
        rootPane.getChildren().add(Owon);
        rootPane.getChildren().add(draw);
        rootPane.getChildren().add(winline1);
        rootPane.getChildren().add(winline2);
        rootPane.getChildren().add(winline3);
        rootPane.getChildren().add(winline4);
        rootPane.getChildren().add(winline5);
        rootPane.getChildren().add(winline6);
        rootPane.getChildren().add(winline7);
        rootPane.getChildren().add(winline8);
        
        
        Scene scene = new Scene(rootPane, 700, 750);
        // +1
        // +12
        
        stage.setScene(scene);
        stage.show();

    }

    public Pane getRootPane() {
        return rootPane ;
    }
}
