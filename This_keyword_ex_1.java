package Java;
class Test {
    int x, y;

    // Constructor
    Test(Test t) {
        x = t.x;
        y = t.y;
    }

    // Overload constructor
    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x = " + x + " y = " + y);
    }
}

public class This_keyword_ex_1 {

	public static void main(String[] args) {
		Test t1 = new Test(10, 20);
        Test t2 = new Test(t1);

        t1.display();
        t2.display();
    }

	}


