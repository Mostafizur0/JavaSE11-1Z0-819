public class Test {
    //static String type = "this";

    public static void main(String[] args) {
        String s = (args.length > 0) ? "switch" : "";
        String caseVal = (args.length > 1) ? args[1] : "";

        if (s == "switch") {
            String type;// scope is if block
            switch (caseVal) {

                case "this":
                    type = "that";
                    break;
                case "that":
                    type = "this";
                    break;
                case "other":
                    Test.type = "";// static variable needs className for name conflict with local variable
                default:
                    type = "somethingelse";
            }
            if (type=="that") type="this";

        }
        System.out.println("this is " + type);  //This is the static variable.
        // static variables do not need className.varName in same class
        // only varName is enough
        // if local variable with same name exist then local variable will be preferred
    }
}
