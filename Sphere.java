
/** Programmers:  [your names here]
* Course:  CS 212
* Due Date:
* Lab Assignment:
* Problem Statement:
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/

import java.util.Scanner;

class Sphere {
    Scanner question = new Scanner(System.in);
    private double x;
    private double y;
    private double z;
    private double radius;

    public Sphere(){
        x = 0;
        y = 0;
        z = 0;
        radius = 0;
    }
    public Sphere(double x, double y, double z, double radius){
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;

    }

     double surfaceArea(){
        double area = 4 * Math.PI * radius;
        return area;
    }
     double Volume(){
        double volume = (4/3) * Math.PI * Math.pow(radius,3);
        return volume;
    }
    double DistanceFromPoint(Sphere circ1){
        double distance = Math.sqrt(Math.pow(x-circ1.x,2) + Math.pow(y-circ1.y,2) + Math.pow(z-circ1.z,2));
        System.out.println("The distance from this point is: " + distance);
        return distance;

    }

    void SphereCollide(Sphere circ1, Sphere circ2)
    {
        if(circ1.DistanceFromPoint(circ2) < (circ1.radius + circ2.radius))
        {
            System.out.println("The Spheres Collided");
        }
        else
        {
            System.out.println("The Spheres Did Not Collide");
        }
    }

    public static void main(String[] args) {
       System.out.println("Spheres Go Here");


    }

}
