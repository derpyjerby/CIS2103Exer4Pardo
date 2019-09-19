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
    
    double radius = 1, area, circumference;
    
    public double getRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Circle's Radius:");
        double value = input.nextDouble();
        System.out.println("This is the Radius entered: " +value);
        return value;
    }
    
    public void setRadius(double x){
        radius = x;
    }
    
    public double getArea(){
        double res;
            res = Math.PI * Math.pow(radius, 2);
        return res;
    }
    
    public double getCircumference(){
        double circ;
            circ = 2*Math.PI*radius;
        return circ;
    }
    
    public void toStreng(double ra, double ci, double ar){
        radius = ra;
        circumference = ci;
        area = ar;
        System.out.println("Circle Radius = " +radius);
        System.out.println("Circle Circumference = " +circumference);
        System.out.println("Circle Area = " +area); 
    }
}

/*  
    Circle

    radius:double = 1.0
    getRadius(): double 
    
    
*/