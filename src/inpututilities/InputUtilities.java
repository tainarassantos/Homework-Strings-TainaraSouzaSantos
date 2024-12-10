/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututilities;

import java.util.Scanner;

/**
 * HDIP Comp Sept 2024 cohort
 * An example of using methods that you have written yourself
 * 
 * To use these in another program, you need to:
 * 1) COPY the entire package 'inpututilities'
 * 2) Go to the project where you want to use the methods
 * 3) Select 'Source Packages' and paste. This will create a copy of the 'inpututilities' package in the project
 * 4) At the top of your code, you will need to import InputUtilities
 * 
 * @author kheal
 */
public class InputUtilities {

    
    /**
     * Ask user to enter some  text - if they enter non-text (like numbers)
     * then ask them again
     * @param prompt - the question or prompt to ask the user
     * @return a String containing whatever text the user entered
     */
    public String askUserForText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput ;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter text only.");
            
            userInput = myKB.nextLine();            
            
        }while (!userInput.matches("^[a-zA-Z\\s]+$"));
        //userinput must be valid text
        
        return (userInput);
    }
    
    /**
     * Update the vowels in the name of the user (task C)
     * @param userName - druidName for update the info
     * @return new druid tree ancestral name, after changed the vowels for tree names
     */
    public static String generateDruidName(String userName) {
        // CHANGE THE USERNAME TO DRUID trees 
        return userName
                .replaceAll("A", "-Alder")
                .replaceAll("a", "-alder")
                .replaceAll("E", "-Elder")
                .replaceAll("e", "-elder")
                .replaceAll("I", "-Ivy")
                .replaceAll("i", "-ivy")
                .replaceAll("O", "-Oak")
                .replaceAll("o", "-oak")
                .replaceAll("U", "-Ulmus")
                .replaceAll("u", "-Ulmus");
    }
}
