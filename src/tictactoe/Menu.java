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
import javafx.animation.TranslateTransition;
import javafx.application.Application;
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
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ilcha
 */
public class Menu extends Application {

    private static boolean flag;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Click to Play Tic-Tac-Toe!");
        btn.setStyle("-fx-background-radius: 50px; -fx-border-radius: 50px; -fx-background-color: white;"
                + " -fx-border-color: black; -fx-font-size: 1.3em; -fx-font-family: Candara; -fx-border-width: 2.5px; -fx-cursor: hand;");
        
        URL path3 = getClass().getResource("/sounds/click.wav");
        AudioClip click = new AudioClip(path3.toString());
        
        Image X = new Image("/images/X.png",210,210,false,true);
        ImageView Ximage = new ImageView(X);
        Ximage.setTranslateY(-105);
        
        Image O = new Image("/images/O.png",210,210,false,true);
        ImageView Oimage = new ImageView(O);
        Oimage.setTranslateY(-105);
        
        Image image = new Image("/images/soundon.png");
        ImageView soundon = new ImageView(image);
        soundon.setPreserveRatio(true);
        Image imageoff = new Image("/images/soundoff.png");
        ImageView soundoff = new ImageView(imageoff);
        soundoff.setPreserveRatio(true);
        Image imagegif = new Image("/images/soundon.gif");
        ImageView soundgif = new ImageView(imagegif);
        soundgif.setPreserveRatio(true);
        
        Image names = new Image("/images/info.png",300,55,false,true);
        ImageView info = new ImageView(names);
        info.setTranslateY(330);
        
        Button soundbtn = new Button();
        soundbtn.setStyle("-fx-background-color: transparent; -fx-cursor: hand;");
        soundbtn.setTranslateY(330);
        soundbtn.setGraphic(soundon);
        
        URL path2 = getClass().getResource("/sounds/onhover.wav");
        AudioClip hover = new AudioClip(path2.toString());
        
        ScaleTransition hoverplay =
            new ScaleTransition(Duration.millis(300), btn);
        hoverplay.setToX(1.2);
        hoverplay.setToY(1.2);
        hoverplay.setCycleCount(1);
        
        ScaleTransition hoverplayrev =
            new ScaleTransition(Duration.millis(300), btn);
        hoverplayrev.setToX(1);
        hoverplayrev.setToY(1);
        hoverplayrev.setCycleCount(1);
        
        btn.setOnMouseEntered(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        hover.play();
                        hoverplay.play();
                    }
            });
        
        btn.setOnMouseExited(
            new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                        hoverplayrev.play();
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
        
        URL path = getClass().getResource("/sounds/mainsound.wav");
        AudioClip main = new AudioClip(path.toString());
        main.setCycleCount(AudioClip.INDEFINITE);
        main.play();
        
        final AtomicReference<Boolean> soundflag = new AtomicReference<Boolean>(false);
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
        
        FadeTransition fadeinX = new FadeTransition(Duration.millis(2500), Ximage);
        fadeinX.setFromValue(0.0);
        fadeinX.setToValue(1.0);
        fadeinX.setAutoReverse(false);
        fadeinX.play();
        
        TranslateTransition transX =
            new TranslateTransition(Duration.millis(1500), Ximage);
        transX.setFromX(-400);
        transX.setToX(-130);
        transX.setCycleCount(1);
        transX.setAutoReverse(false);
        transX.play();
        
        FadeTransition fadeinfo = new FadeTransition(Duration.millis(3000), info);
        fadeinfo.setFromValue(0.0);
        fadeinfo.setToValue(1.0);
        fadeinfo.setAutoReverse(false);
        fadeinfo.play();
        
        TranslateTransition transinfo =
            new TranslateTransition(Duration.millis(3000), info);
        transinfo.setFromX(-400);
        transinfo.setToX(-230);
        transinfo.setCycleCount(1);
        transinfo.setAutoReverse(false);
        transinfo.play();
        
        FadeTransition fadeinO = new FadeTransition(Duration.millis(2500), Oimage);
        fadeinO.setFromValue(0.0);
        fadeinO.setToValue(1.0);
        fadeinO.setAutoReverse(false);
        fadeinO.play();
        
        TranslateTransition transO =
            new TranslateTransition(Duration.millis(1500), Oimage);
        transO.setFromX(400);
        transO.setToX(130);
        transO.setCycleCount(1);
        transO.setAutoReverse(false);
        transO.play();
        
        FadeTransition fadein = new FadeTransition(Duration.millis(2500), btn);
        fadein.setFromValue(0.0);
        fadein.setToValue(1.0);
        fadein.setAutoReverse(false);
        fadein.play();
        
        TranslateTransition trans =
            new TranslateTransition(Duration.millis(1500), btn);
        trans.setFromY(0);
        trans.setToY(150);
        trans.setCycleCount(1);
        trans.setAutoReverse(false);
        trans.play();
        
        TranslateTransition transound =
            new TranslateTransition(Duration.millis(2200), soundbtn);
        transound.setFromX(450);
        transound.setToX(310);
        transound.setCycleCount(1);
        transound.setAutoReverse(false);
        transound.play();
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(soundbtn);
        root.getChildren().add(Ximage);
        root.getChildren().add(Oimage);
        root.getChildren().add(info);
        
        FadeTransition fadeoutX = new FadeTransition(Duration.millis(1300), Ximage);
        fadeoutX.setFromValue(1.0);
        fadeoutX.setToValue(0.0);
        fadeoutX.setAutoReverse(false);
        
        TranslateTransition transoutX1 =
            new TranslateTransition(Duration.millis(300), Ximage);
        transoutX1.setFromY(-105);
        transoutX1.setToY(-140);
        transoutX1.setCycleCount(1);
        transoutX1.setAutoReverse(false);
        
        TranslateTransition transoutX2 =
            new TranslateTransition(Duration.millis(1300), Ximage);
        transoutX2.setFromY(-140);
        transoutX2.setToY(900);
        transoutX2.setCycleCount(1);
        transoutX2.setAutoReverse(false);
        
        FadeTransition fadeoutO = new FadeTransition(Duration.millis(1300), Oimage);
        fadeoutO.setFromValue(1.0);
        fadeoutO.setToValue(0.0);
        fadeoutO.setAutoReverse(false);
        
        TranslateTransition transoutΟ1 =
            new TranslateTransition(Duration.millis(300), Oimage);
        transoutΟ1.setFromY(-105);
        transoutΟ1.setToY(-140);
        transoutΟ1.setCycleCount(1);
        transoutΟ1.setAutoReverse(false);
        
        TranslateTransition transoutΟ2 =
            new TranslateTransition(Duration.millis(1300), Oimage);
        transoutΟ2.setFromY(-140);
        transoutΟ2.setToY(900);
        transoutΟ2.setCycleCount(1);
        transoutΟ2.setAutoReverse(false);
        
        FadeTransition fadeout = new FadeTransition(Duration.millis(1300), btn);
        fadeout.setFromValue(1.0);
        fadeout.setToValue(0.0);
        fadeout.setAutoReverse(false);
        
        TranslateTransition transout2 =
            new TranslateTransition(Duration.millis(1300), btn);
        transout2.setFromY(115);
        transout2.setToY(1000);
        transout2.setCycleCount(1);
        transout2.setAutoReverse(false);
        transout2.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Game game = new Game(primaryStage);
                primaryStage.getScene().setRoot(game.getRootPane());
            }
        });
        
        TranslateTransition transout1 =
            new TranslateTransition(Duration.millis(300), btn);
        transout1.setFromY(150);
        transout1.setToY(115);
        transout1.setCycleCount(1);
        transout1.setAutoReverse(false);
        transout1.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                fadeoutX.play();
                transoutX2.play();
                fadeoutO.play();
                transoutΟ2.play();
                fadeout.play();
                transout2.play();
            }
        });
        
        FadeTransition fadeoutinfo = new FadeTransition(Duration.millis(1300), info);
        fadeoutinfo.setFromValue(1.0);
        fadeoutinfo.setToValue(0.0);
        fadeoutinfo.setAutoReverse(false);
        
        TranslateTransition transinforev =
            new TranslateTransition(Duration.millis(1200), info);
        transinforev.setFromX(-230);
        transinforev.setToX(-500);
        transinforev.setCycleCount(1);
        transinforev.setAutoReverse(false);
        transinforev.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                transoutX1.play();
                transoutΟ1.play();
                transout1.play();
            }
        });
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                click.play();
                fadeoutinfo.play();
                transinforev.play();
            }
        });
        
        //Game game = new Game(primaryStage);
               // primaryStage.getScene().setRoot(game.getRootPane());
        
        BackgroundImage img = new BackgroundImage(new Image("/images/background.png",700,760,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        root.setBackground(new Background(img));
        
        Scene scene = new Scene(root, 700, 750);
        
        primaryStage.setTitle("2-Player Tic-Tac-Toe");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("/images/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static boolean getFlag(){
        return flag;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
