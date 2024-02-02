public class LogicalOperator {
    public static void main(String[] args) {

//        Logical Operators
//        AND > && , OR > || , NOT > !

//        AND is only true when all the expressions are TRUE. remaining false
        int a = 10;
        int b = 20;
        int c = 30;

       boolean x =  a==b && a<b && c>a;  // false,true,true
        System.out.println(x);    // FTT = False

//        OR is only false when all the expressions are false. remaining true
        boolean y = c > b || a < c || b>= a;
        System.out.println(y);

//        NOT !
        a = a + 20;
        boolean z = a != c;
        System.out.println(z);
    }
}
