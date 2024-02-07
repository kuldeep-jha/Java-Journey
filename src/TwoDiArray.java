public class TwoDiArray {
    public static void main(String[] args) {

//        int nums[][] = new int[3][2]; //1st is row & 2nd is column
//        nums[0][0]  = 5;
//        nums[0][1]  = 7;
//        nums[1][0]  = 4;
//        nums[1][1]  = 6;
//        nums[2][0]  = 5;
//        nums[2][1]  = 3;

//        2d array initialization
//        int nums[][] = {
//                {5,2},
//                {8,2},
//                {9,4} };

//        jagged array initialization
//        no of rows are fixed but no of columns are not fixed.
        int nums[][] = {
                {5,2,3,6},
                {8,2},
                {9,4,8} };

        for (int i = 0; i <= 2; i++) //row
        {
            for (int j = 0; j < nums[i].length; j++) //column
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

//       1 d array
        int no[] = {4,7,8,9};
        for (int i = 0; i < no.length; i++) {
            System.out.println(no[i]);
        }

//        jagged array
        int num [][] = {{1,2,3}, {4,5}, {7,8,0,9}};
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

//        2 d array
        int numb[][] = {{7,4,1}, {8,5,2}, {9,6,3}};
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(numb[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
