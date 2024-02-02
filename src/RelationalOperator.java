public class RelationalOperator {
    public static void main(String[] args) {

//        Relational operators
//        In Relational operator Boolean datatype is used to find the answer.
        int a = 10;
        int b = 15;
        int c = 20;

//        Less than
//        here we take boolean to check if the answer if ture or false
        boolean result = a == 20;  // == means comparing with actual value
        System.out.println(result);  // ans: false

//        Lower than
        boolean resul = a > c;
        System.out.println(resul);

//        Greater than or equal too
        boolean res = a >= c;
        System.out.println(res);

//        Not equal to
        a = a + 5;    // Here we changed the value of a from 10 to plus 5 = 15.
        boolean re = a != b;   // Use ! this symbol for Not.
        System.out.println(re);
    }
}
