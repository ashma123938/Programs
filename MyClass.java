package Java;

public class MyClass {
	void myMethod() {
        System.out.println("Inside myMethod");
    }

    void anotherMethod() {
        System.out.println("Inside anotherMethod");
        this.myMethod(); // invoking myMethod using this keyword
    }

	public static void main(String[] args) {
		 MyClass obj = new MyClass();
	        obj.anotherMethod();
	    }
	
	}


