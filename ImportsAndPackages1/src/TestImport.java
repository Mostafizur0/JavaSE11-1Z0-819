// single-type-import declaration
//import garden.vagitable.VineVegetable;
// type-import-on-demand declaration
//import garden.*; // will import classes in garden package not classes from garden.vagitable
import garden.vagitable.*;
import nursery.vegetable.*;
// creates import conflict. will work if single-type-import is uncommented
// more specific import will take precedence in case of conflicted import

public class TestImport {
    public static void main(String[] args) {

        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import
        // statement
        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}

// cannot create a class with same name as single-type-import class
class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}
