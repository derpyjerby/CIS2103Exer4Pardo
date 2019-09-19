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
public class Rectangle {
    
    float length = 1, width = 1;
    double area, perimeter;
    
    public float getLength(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Rectangle's Length:");
        float value = input.nextFloat();
        System.out.println("This is the Length entered: " +value);
        return value;
    }
    
    public void setLength(float x){
        length = x;
    }
    
    public float getWidth(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Rectangle's Width:");
        float value = input.nextFloat();
        System.out.println("This is the Width entered: " +value);
        return value;
    }
    
    public void setWidth(float y){
        width = y;
    }
    
    public double getArea(){
        double circ;
            circ = length*width;
        return circ;
    }
    
    public double getPerimeter(){
        double per;
        per = 2*(length+width);
        return per;
    }
    
    public void toStreng(float le, float wi, double ar, double er){
        length = le;
        width = wi;
        area = ar;
        perimeter = er;
        System.out.println("Rectangle Length = " +length);
        System.out.println("Rectangle Width = " +width);
        System.out.println("Rectangle Area= " +area);
        System.out.println("Rectangle Perimeter= " +perimeter); 
    }
}
