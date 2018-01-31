/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author daley
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Question 2 - get this to print the phrase "-5 that is great for winter"
        //by modifying the getWeather method
        //1 mark
        System.out.printf("%s %n" , getWeather(-5));
        
        //Question 3 - modify the method getNewGames so that it returns the latest
        //games 
        //1 mark
        String[] newGames = getNewGames();
        
        //Question 4 - display each of the games on 1 line by modifying the for loop
        //provided 
        //2 marks
        for (int a=0; a<=2; a++){
            System.out.printf("%s ", newGames[a]);
        }
        //Question 5 - write some code to display all the games to the console
        //in lower case
        //1 mark
        
    }
    
    public static String getWeather(int temperature)
    {
        if (temperature>0)
            return temperature + " that is so warm for winter";
        else
            return temperature + " that is great for winter";
    }
    
    public static String [] getNewGames()
    {
        String[] games = {"Monster Hunter: World","Red Dawn Redemption 2","God of War"};
        return games;
    }
}
    
    

