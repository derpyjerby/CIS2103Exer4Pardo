/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle.and.rectangle;

import java.util.Scanner;
/**
 *
 * @author pardoje_cis21035
 */
public class Circle {
    
    public void getRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Circle's Radius:");
        double value = input.nextDouble();
        System.out.println("This is the Radius entered: " +value);
    }
    
    
}
