/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapatternactivity;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class JavaPatternActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // temp variable to check by
        String username="twin";
        
        //making use of pattern to check Uppercase
        Pattern checking = Pattern.compile("[ABCDEFGHIJKLMNOQRSTUVWXYZ]");
        
        //CHECK THE UPPER CASE
        if(checking.matcher(username).find()){
            //alert the user 
            System.out.println("Upper case is found.");
        }else{
            //and if the condition is not met
            System.out.println("Upper case is not found.");
        }
    }
    
}
