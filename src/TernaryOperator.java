public class TernaryOperator {
    public static void main(String[] args) {

//        Ternary Operator

        int rohitHas = 20;
        int rohanHas = 40;

        String bataoBhai = (rohanHas < rohitHas)? "rohan is poor":"rohit is poor";
//        here we hv to write semicolan part accd to the condition, if rohan is
//        first written then his value should be written first.
        System.out.println(bataoBhai);

        int a = 20;
        int b = 30;
        int c = 40;
//here we ll find who has the lowest value.
//        int result = (a<b)? (a<c? a:b): (b<c? b:c);
        int result = (a < b)? (a < c)? a:b :(b < c)? b:c;
        System.out.println(result);

        int x = 100;
        int y = 500;
        int z = 300;

        int res = (x < y)? (x < z)? x:y :(y < z)? y:z;
        System.out.println(res);

    }
}
