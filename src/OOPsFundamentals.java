public class OOPsFundamentals {

    int a;
    String name;
    public static void main(String[] args) {

//        Declare the variable
//        Create the object
        int num = 1;    // num is primitive variable
        OOPsFundamentals oops1 = new OOPsFundamentals();// oops is reference variable
        OOPsFundamentals oops2 = new OOPsFundamentals();

        oops1.name = "kuldeep";

        System.out.println(oops2.a);  // output ia 0.
        System.out.println(oops2.name); // output is null

        System.out.println(oops1.name);
    }         // Reference variable refers to an object.
}           // primitive variable is which refer to primitive value like number, char,float value.
// local variables rae made inside te main method