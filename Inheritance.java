package Java;
//Parent class "Person"
class Person {
 String name;
 int age;

 // Method "speak"
 void speak() {
     System.out.println(name + " is speaking.....");
 }
}

//Child class "Student" that inherits from Person
class Student extends Person {
 String grade;

 // Method "study"
 void study() {
     System.out.println(name + " is studying in grade " + grade + ".");
 }
}


public class Inheritance {

	public static void main(String[] args) {
		 // Create an object of the Student class
        Student student = new Student();

        // Set the attributes
        student.name = "Ashma.... ";
        student.age = 21;
        student.grade = "A";

        // Call both the "speak" and "study" methods
        student.speak();
        student.study();
    }


	}


