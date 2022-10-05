package E1005;

public class SwapExercise {

    private static int a = 10;
    private static int b = 20;

    public static void main(String[] args) {
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("a: %d, b: %d", a, b);
    }
}

