package a;

//import java.lang.Number; // cannot import Number this way as it conflict with class name
// It is ok to create a class that is defined in java.lang
class Number {
    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor for java.lang.number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Constructor for a.Number");
    }

    public static void main(String[] args) {

        Number n = new Number(10);
        Number n2 = new Number(n);
    }
}
