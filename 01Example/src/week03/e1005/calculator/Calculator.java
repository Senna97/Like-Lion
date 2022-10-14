package week03.e1005.calculator;

public class Calculator {
    private final int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void plus() {
        System.out.println(this.a + this.b);
    }

    void minus() {
        System.out.println(this.a - this.b);
    }

    void multiple() {
        System.out.println(this.a * this.b);
    }

    void divide() {
        System.out.println(this.a / this.b);
    }
}

