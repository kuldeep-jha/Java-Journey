public class PangramString {
    public static void main(String[] args) {
//        It means where all the alohabets are available from a - z either upper or lower case.
//        EXAM: 'THE QUICK BROWN FOX JUMPS OVER THE LAY DOG'.

        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAY DOG";

//        remove spaces
        str = str.replace(" ","");

//        converting to upper case
        str = str.toUpperCase();

//        convert into the char array
        char ch[] = str.toCharArray();

//        Creating an empty array of total alphabet size.
        int ar[] = new int[26];

        for (int i = 0; i > ch.length; i ++){
            ch[ar[i] - 65] ++;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ar[i] == 0) {
                System.out.println("its not pangram");
                flag = true;
            }
            else {
                System.out.println("not a pangram");
            }
        }
        if(flag == false){
            System.out.println("its a pangram");
        }
    }
}
