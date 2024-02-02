public class ForLoop {
    public static void main(String[] args) {

//        For Loop

//  for(Code that executes; condition executes till come true ; here it exe once after every iteration of the loop ){
//        Sout(i)} syntax of for loop

//        for(Initialization; Condition; Incremt/Decremt){}

//        for (int i = 0; i < 5; i = i + 1)
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {      // checking if 4 does 4 comes in the loop
//                break;      // it ll not continue after 3 bcoz of break statemt
                continue;     // it ll not show 4 & rest all printed
            }
            {
                System.out.println(i);
            }
        }

    }}