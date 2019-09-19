/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circle.and.rectangle; 
/**
 *
 * @author pardoje_cis21035
 */
import java.util.Scanner;

public class CircleAndRectangle {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Hi. Just wanted to ask if you wanted to get a circle or a rectangle?");
        System.out.println("Type in: \"Circle\" if you want circle and \"Rectangle\" if you want rectangle");
        String in = input.next();
        String cir = "CIRCLE";
        String rec = "RECTANGLE";
        
        boolean TRUE = true;

        if(in.equalsIgnoreCase(cir) == TRUE){
        Circle curkel = new Circle();
        System.out.println("Hi");
        curkel.getRadius();
        }else if (in.equalsIgnoreCase(rec) == TRUE){
            
        }
                System.out.println("Weirdo");
        }
    }