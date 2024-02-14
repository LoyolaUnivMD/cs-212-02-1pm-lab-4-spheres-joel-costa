/** Programmers:  Costa Marmaras, Joel Robinson
* Course:  CS 212
* Due Date: 2/18/24
* Lab Assignment: 4
* Problem Statement: Create a class that will create sphere objects with coordinates and a radius, and calculate the surface area, the volume,
 * the distance from a point, and if two spheres will collide
* Data In: coordinates for distance from a point
* Data Out: Surface area, Volume, Distance from a point, if two spheres will collide
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Music of the Spheres");
       Sphere sun = new Sphere(0.0, 0.0, 0.0, 43.26);
       Sphere earth = new Sphere(26.0, 42.0, 79.0, 0.395);
       Sphere planetX = new Sphere(25.3, 43.1, 77.8, 1.4);

        System.out.println("Input the x Coordinate of Your planet:");
        while(!input.hasNextDouble()){
            System.out.println("Please choose a double.");
            input.next();
        }
        double x = input.nextDouble();
        System.out.println("Input the y Coordinate of Your Planet:");
        while(!input.hasNextDouble()){
            System.out.println("Please choose a double.");
            input.next();
        }
        double y = input.nextDouble();
        System.out.println("Input the z Coordinate of Your Planet:");
        while(!input.hasNextDouble()){
            System.out.println("Please choose a double.");
            input.next();
        }
        double z = input.nextDouble();
        System.out.println("Input the Radius of Your Planet:");
        while(!input.hasNextDouble()){
            System.out.println("Please choose a double.");
            input.next();
        }
        double radius = input.nextDouble();
        Sphere userPlanet = new Sphere(x, y, z, radius);

        System.out.println("Surface Area of The Sun: " + sun.surfaceArea() + "\nVolume of The Sun: " + sun.Volume());
        System.out.println("Surface Area of the Earth: " + earth.surfaceArea() + "\nVolume of the Earth:" + earth.Volume());
        System.out.println("Surface Area of Planet X: " + planetX.surfaceArea() + "\nVolume of Planet X: " + planetX.Volume());
        System.out.println("Surface Area of User Created Planet: " + userPlanet.surfaceArea() + "\nVolume of User Created Planet: " + userPlanet.Volume());
        sun.SphereCollide(sun, earth);
        sun.SphereCollide(sun, planetX);
        sun.SphereCollide(earth, planetX);
        userPlanet.SphereCollide(userPlanet, planetX);
        userPlanet.SphereCollide(userPlanet, earth);
        userPlanet.SphereCollide(userPlanet,sun);

        double distfromSun = userPlanet.DistanceFromPoint(sun);
        double distfromEarth = userPlanet.DistanceFromPoint(earth);
        double distfromX = userPlanet.DistanceFromPoint(planetX);

        if(distfromEarth < distfromX && distfromEarth < distfromSun){
            System.out.println("You are closest to the Earth.");
        }
        if(distfromX < distfromEarth && distfromX < distfromSun){
            System.out.println("You are closest to the Planet X.");
        }
        if(distfromSun < distfromEarth && distfromSun < distfromX){
            System.out.println("You are closest to the Sun.");
        }



    }
}
