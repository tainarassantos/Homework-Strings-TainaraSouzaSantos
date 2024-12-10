/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework.strings.tainarasouzasantos;

import inpututilities.InputUtilities;

/**
*
* @author Tainara de Souza Santos
* 
* Your task is to create a program that will
* a)	Ask the user to enter their name
* b)	Check that the user has entered text (no numbers allowed). You *must* use InputUtilities to do this!
* c)	If they enter text, then use STRING METHODS to change the name in some way YOU DECIDE (see note below)
* d)    COMMENT ALL YOUR CODE  
* 
* 
* 
 */
public class HomeworkStringsTainaraSouzaSantos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //registered the strings to manipulate information
    String userName;
    String druidName;
        
    //connect the inpututilities to validate the information received
    InputUtilities myInput = new InputUtilities();
    //text info to request the name input using the inputUtilies to validate the info received is just TEXT
    userName = myInput.askUserForText("Please, inform your name:");
            
    //I decided do my convertion based in the ancestral Druid trees, I associated the names with the vowels of the name.
    //this part of the code is to change the name received for a Druid tree name
    druidName = InputUtilities.generateDruidName(userName);

    //receive the druidic "surname" indicating the info OF THE FOREST
    druidName = druidName + " of the Forest";
    
    //printing the information for the user about the new ancestral Druid tree name
    System.out.println("Your ancestral Druid tree name is " + druidName + ".");
        
    //the code finished
    }
}
