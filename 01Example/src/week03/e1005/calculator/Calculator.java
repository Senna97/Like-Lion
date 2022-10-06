package week03.e1005.calculator;

public class Calculator {
    private final int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void Plus() {
        System.out.println(this.a + this.b);
    }

    void Minus() {
        System.out.println(this.a - this.b);
    }

    void Multiple() {
        System.out.println(this.a * this.b);
    }

    void Divide() {
        System.out.println(this.a / this.b);
    }
}

