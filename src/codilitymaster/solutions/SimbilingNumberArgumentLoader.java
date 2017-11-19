/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitymaster.solutions;

/**
 *
 * @author icode
 */
public class SimbilingNumberArgumentLoader {
    
    
   public static String[] popupulateArguments(){
       
       String[] args =null;
       
      //  for data form 0 to 10000000
      
       for (int i = 0; i < 3; i++) {
           
           args[i]=String.valueOf(i);
           
           
       }
       
       return args;
   }
    
}
