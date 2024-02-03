public class PatternProgram {
    public static void main(String[] args) {

//        int n = 5;
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < n; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        * * * * *      we need to print this in output.
//        *       *
//        *       *
//        *       *
//        * * * * *

//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n-1 || j == n-1){
//                        System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//        * * * * *   we need to print this now
//        *       *   i = row
//        * * * * *   j = column
//        *       *   no of row n column : 5r 5c
//        *       *

//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//               if (i == 0 || j == 0 || i == 2 || j == 4){
//                    if (i == 0 || j == 0 || i == (n-1)/2 || j == (n-1)){   // (n-1) means 4 and (n-1)/2 half of 4 is 2 so 2.
//
//                        System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//        we need to print this.
//        *       *    i = row
//        *       *    j = column
//        * * * * *    no of row n column : i=5 & j=5
//        *       *
//        *       *

//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 2 || j == 0 || j == 4){
//                    if (i == (n-1)/2 || j == 0 || j == (n-1)){
//
//                        System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//        * * * * *     we need to print this.
//            *         row = i
//            *         column = j
//            *         no of row & column: i = 5 & j = 5.
//        * * * * *

//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == 4 || j == 2){
//                if (i == 0 || i == (n-1) || j == (n-1)/2){
//
//                    System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//        * * * * *     We need to print E.
//        *              row = i
//        * * * * *      column = j
//        *              no of row & column: i & j = 5.
//        * * * * *

//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == 2 || i == 4 || j == 0){
//                if (i == 0 || i == (n-1)/2 || i == (n-1) || j == 0){
//
//                    System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//    }



//        * * * * *    we need to print F.
//        *            row = i
//        * * * * *    column = j
//        *            no of row & column: i & j = 5.
//        *

//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
////                if (i == 0 || i == 2 || j == 0){
//                if (i == 0 || i == (n-1)/2 || j == 0){
//
//                    System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//        * * * * *   We need to print J.
//            *       i = row
//            *       J = column
//        *   *       no of row & column are 5.
//        * * *


        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n-1)/2 || i == (n-1) && j < (n-1)/2 || i == 3 && j < 1 ){
                {
//                if (i == 0 || j == 2 || i == 4 && j < 2 ){
                    {
                        System.out.print(" * ");
                }
                }
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}