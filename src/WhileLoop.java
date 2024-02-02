public class WhileLoop {
    public static void main(String[] args) {

//        While and Do - While Loop
//        read While Loop like this - As long as i is < 10 / if (i < 10)

        int i = 0;
        while (i < 5) {
            System.out.println("*");
            i++;
        }

//        A do while loop executes a block of code at least once, then
//        executes with the iteration.
        do {
            System.out.println("*");
            i++;
        } while (i < 5);
    }
}
