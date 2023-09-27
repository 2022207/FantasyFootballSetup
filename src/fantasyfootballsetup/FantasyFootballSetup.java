/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfootballsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
        System.out.println(5);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type something!");
        String userInput = sc.nextLine();
        System.out.println("The user entered: " + userInput);
        //userInput = sc.next();
        //System.out.println("The user entered: " + userInput);
        
        BufferedReader br = new BufferedReader(new FileReader(""));
        
        
        
        
    }
    
}
