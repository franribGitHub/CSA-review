/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarShopping;

// Import Scanner Class
import java.util.Scanner;
public class CarShopping
{
    
    // Create static Scanner Object call it kb
    private static Scanner kb = new Scanner(System.in);
   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += ejectoSeato();
      
       System.out.println("Congratulations on your new car, your total cost"
               + " is $" + totalCost);
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = "";
      
      
      // Must use && so it repeats if ALL are FALSE
      while (!model.equalsIgnoreCase("Model 1") &&
              !model.equalsIgnoreCase("Model 2") &&
              !model.equalsIgnoreCase("Model 3")){
          System.out.println("Enter correct model");
          model = kb.nextLine();
      }
      
      if(model.equalsIgnoreCase("Model 1")){
         return 15000;
      }
      else if(model.equalsIgnoreCase("Model 2")){
          return 24000;
      }
      else if(model.equalsIgnoreCase("Model 3")){
          return 40000;
      }
      else{
          return 0;
      }
      
   }
   
   public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (y/n) > ");
      String answer = kb.nextLine();
      
      if(answer.equalsIgnoreCase("y")){
        return 500;
      }
      else{
        return 0;
      }
      
   }
   
   public static int ejectoSeato(){
       System.out.println("EjectoSeato for $8,000 Cuz?");
       char answer = kb.nextLine().toLowerCase().charAt(0);
       
       if(answer == 'y'){
           return 8000;
       }
       
       return 0;
   }
}
