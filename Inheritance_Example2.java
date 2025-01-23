package Java;
//Parent class "Vehicle"
class Vehicle {
 String brand;
 String model;
 int year;

 // Method "drive"
 void drive() {
     System.out.println("The " + year + " " + brand + " " + model + " is driving.");
 }
}

//Child class "Car" that inherits from Vehicle
class Car extends Vehicle {
 String color;

 // Method "honk"
 void honk() {
     System.out.println("The " + color + " car is honking.");
 }
}


public class Inheritance_Example2 {

	public static void main(String[] args) {
		 // Create an object of the Car class
        Car car = new Car();

        // Set the attributes
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2022;
        car.color = "Blue";

        // Call both the "drive" and "honk" methods
        car.drive();
        car.honk();
    }

	}


