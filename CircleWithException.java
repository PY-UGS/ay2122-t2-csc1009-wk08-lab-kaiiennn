package week8lab;

import java.util.Scanner;

import static java.lang.Math.*;

public class CircleWithException {
    private double radius;
    private double area;
    private double diameter;

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = PI * pow(radius, 2);
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter value of radius: ");
            double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius); //Initialize the constructor with radius value
            double diameter = circle.getDiameter();
            double area = circle.getArea();
            System.out.println("The diameter of the circle is " + diameter);
            System.out.println("The area of the circle is " + area);
            if (radius < 0){ //If radius provided by the user is negative
                throw new IllegalArgumentException();
            }
            if (area > 1000){ //If the area of the circle is more than 1000
                throw new Exception();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: The value of radius must be positive");
        } catch (Exception e){
            System.out.println("Error: The value of area is more than 1000");
        }
    }
}
