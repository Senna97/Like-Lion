package week10.e1122.algorithm;

public class Recursive1To100 {

    public void print1To100(int num) {
        if (num > 100) {
            return;
        }
        System.out.println(num);
        print1To100(num + 1);
    }

    public static void main(String[] args) {
        Recursive1To100 recursive1To100 = new Recursive1To100();
        recursive1To100.print1To100(1);
    }
}
