public class ConditionalStatement {
    public static void main(String[] args) {

//        Condition Statement (If else)
        int hisAge = 18;
        hisAge = 57;    // Changed the age without changing its default.

//        if (age >=18){
//            System.out.println("You are Adult");
//        }
//        else {
//            System.out.println("you are a teen");
//        }

        if(hisAge >= 18 && hisAge <60){
            System.out.println("Welcome gentleman");
        } else if (hisAge >= 60) {
            System.out.println("Please sir,come with an adult");
        } else if (hisAge < 18) {
            System.out.println("Child, You are not allowed");
        }
        else {
            System.out.println("Only males are allowed");
        }

//        Nested if-else

        if(hisAge >= 18 && hisAge <60){
            if (hisAge >=18 && hisAge<=25){
                System.out.println("you are very young");
            } else if (hisAge >25 && hisAge <= 35) {
                System.out.println("you are still young");
            }
            else {
                System.out.println("You don't look young enough");
            }
        } else if (hisAge >= 60) {
            System.out.println("Please sir,come with an adult");
        } else if (hisAge < 18) {
            if (hisAge > 69 || hisAge < 75){
                System.out.println("Take care of your health sir");
            } else if (hisAge > 74 || hisAge < 85) {
                System.out.println("uncle having chill life");
            }
        }
        else {
            System.out.println("Only males are allowed");
        }


        int a = 10;
        int b = 30;
        int c = 50;

        if(a < b){
            if (a<c){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (b < c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
