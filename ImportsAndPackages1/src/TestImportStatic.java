// A single-static-import declaration for static variable
import static java.lang.Math.PI;

// A single-static-import declaration for static method
import static java.lang.Math.sqrt;

// A static-import on demand declaration for static variable
import static java.lang.Math.*;

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        // We can use a static class variable on the Math class to
        // get the value of PI
        double circumference = 2 * java.lang.Math.PI * radius;
        System.out.println("circumference = " + circumference);
        double circumference1 = 2 * PI * radius;
        System.out.println("circumference = " + circumference1);

        // We can use a static class method on the Math class to
        // get the square root of a number
        double sqrt81 = java.lang.Math.sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
        double sqrt81_1 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81_1);
    }
}
