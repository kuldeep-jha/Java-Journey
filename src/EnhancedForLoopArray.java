public class EnhancedForLoopArray {
    public static void main(String[] args) {
//        enhanced for loop
//        1 D ARRAY
        int nums[] = {4,5,6,1};
//        syntax: for(data-type variable name to store array element : colon array)
//        in short syntax: for(data-type variable : array[])
//        then simply print the variable- sout(variable);

        for (int n : nums){
            System.out.println(n);
        }

//        2 D ARRAY
        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int a[] : num){
            for (int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
