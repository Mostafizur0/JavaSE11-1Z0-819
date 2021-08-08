public class Test {
    static float tax_rate =0.06F;
    public static void main(String[] args) {

        var result = 0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
        result = price + adjusted_tax;  // Line 3
        int p = 1 + .05;
        System.out.println("Adjusted price = " + result);
    }
}
