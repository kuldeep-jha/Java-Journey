public class typeCast {
    public static void main(String[] args) {
//        Implicit type casting
        int a =45;
        double b;
        b=a;
        System.out.println(b);

//        Explicit type casting
        double num1 = 45.2;
        int num2;
        num2 = (int) num1;      //converting datatype of num1 same as num2
        System.out.println(num2);


        int n1 = 12;
        int n2 = 5;
        float result = n1/n2;    //if u div n1/n2 (12/5 ans= 2.4)
        System.out.println(result);   //if u div int with int value u'll get ans
//        in int value always basically it rounded to zero (means Truncated)the answer and that is called
//        Truncation.
    }
}
