/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;
import java.util.Scanner;
/**
 *
 * @author mlarrubia
 */
public class CardGame {
    private static Scanner kb = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int randomNum = (int)(Math.random() * 10 + 1);
        
        System.out.println("Guess my card number...");
        int userNum = kb.nextInt();
        
        
        if(randomNum == userNum){
            System.out.println("Congrats you guessed correctly!");
        }
        else{
            if(userNum > randomNum){
                System.out.println("Too High!");
            }
            else{
                System.out.println("Too Low!");
            }
        }
        
        
        
        
        
        
        
    }
    
}
