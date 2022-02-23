/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;


/**
 *
 * @author Ilcha
 */
public class Check {
    static Boolean draw = false;
    static int id = 0;
    public static void checkWinner(){
        if (Game.Xishere1 == true && Game.Xishere2 == true && Game.Xishere3 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 1;
        }else if (Game.Xishere4 == true && Game.Xishere5 == true && Game.Xishere6 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 2;
        }else if (Game.Xishere7 == true && Game.Xishere8 == true && Game.Xishere9 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 3;
        }else if (Game.Xishere1 == true && Game.Xishere4 == true && Game.Xishere7 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 4;
        }else if (Game.Xishere2 == true && Game.Xishere5 == true && Game.Xishere8 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 5;
        }else if (Game.Xishere3 == true && Game.Xishere6 == true && Game.Xishere9 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 6;
        }else if (Game.Xishere1 == true && Game.Xishere5 == true && Game.Xishere9 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 7;
        }else if (Game.Xishere7 == true && Game.Xishere5 == true && Game.Xishere3 == true){
            Game.pointsX++;
            Game.fadeoutscoreX.play();
            Game.fadeinrarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 8;
        }else if (Game.Oishere1 == true && Game.Oishere2 == true && Game.Oishere3 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 1;
        }else if (Game.Oishere4 == true && Game.Oishere5 == true && Game.Oishere6 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 2;
        }else if (Game.Oishere7 == true && Game.Oishere8 == true && Game.Oishere9 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 3;
        }else if (Game.Oishere1 == true && Game.Oishere4 == true && Game.Oishere7 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 4;
        }else if (Game.Oishere2 == true && Game.Oishere5 == true && Game.Oishere8 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 5;
        }else if (Game.Oishere3 == true && Game.Oishere6 == true && Game.Oishere9 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 6;
        }else if (Game.Oishere1 == true && Game.Oishere5 == true && Game.Oishere9 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 7;
        }else if (Game.Oishere7 == true && Game.Oishere5 == true && Game.Oishere3 == true){
            Game.pointsO++;
            Game.fadeoutscoreO.play();
            Game.fadeinlarrow.stop();
            Game.btn1.setDisable(true);
            Game.btn2.setDisable(true);
            Game.btn3.setDisable(true);
            Game.btn4.setDisable(true);
            Game.btn5.setDisable(true);
            Game.btn6.setDisable(true);
            Game.btn7.setDisable(true);
            Game.btn8.setDisable(true);
            Game.btn9.setDisable(true);
            id = 8;
        }else if (Game.count == 9){
            if (Game.player == true){
                Game.fadeinrarrow.stop();
                draw = true;
                Game.fadeoutplay.play();
            }else{
                Game.fadeinlarrow.stop();
                draw = true;
                Game.fadeoutplay.play();
            }
        }
    }
    
}
