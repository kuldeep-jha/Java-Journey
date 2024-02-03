public class PatternProgram1 {
    public static void main(String[] args) {

//        Here we will make letter/alphabet A.
//        The no of i & j will be 7 so that we get a centre line 3.


//        int n = 7;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
////                if (i == 0 && j > 0 && j < 3 || j == 0 && i > 0 || j == 3 && i > 0 || i == 3 && j < 4 ){
//                    if ( i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 || j == (n-1)/2 && i > 0 || i == (n-1)/2 && j <= (n-1)/2 ){
//                System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//        Here we will make letter/alphabet D.
//        The no of i & j will be 10.


        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                if ( i == 0 && j < 4 || j == 0 || i == 8 && j < 4 || j == 4 && i > 0 && i < 8 ){
                if ( i == 0 && j < (n-1)/2 || j == 0 || i == (n-1) && j < (n-1)/2 || j == (n-1)/2 && i > 0 && i < (n-1) ){

                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("");  //output k same row m letters ko print karane l liye
//                 J loop ko copy krna hai then i loop k sout statement k uppar print krdena h
//            and jo new loop ayega uske uppar ek print sout likhna hai with one space.
            for (int j = 0; j < n; j++) {
//                if ( i == 0 && j < 4 || j == 0 || i == 8 && j < 4 || j == 4 && i > 0 && i < 8 ){
                if ( i == 0 && j < 4 || j == 0 || i == 8 && j < 4 || i == 4 && j < 4 || j == 4 && i > 0 && i < 4 || j == 4 && i > 4 && i < 8 ){

                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
//                if (i == 0 && j > 0 && j < 3 || j == 0 && i > 0 || j == 3 && i > 0 || i == 3 && j < 4 ){
                    if ( i == 0 || i == 3 || j == 2 && i > 0 && i < 2 || i == 2 && j > 0 && j < 2 ){
                System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
