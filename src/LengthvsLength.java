public class LengthvsLength {
    public static void main(String[] args) {
        //    So its length vs length()
//    length is property of array
//    and length() is method of String class.

        int num[] = {1,2,3,4};
        {
            System.out.println(num.length);
        }

        int nums[][] = {{7,8,9},{4,5,6},{1,2}};
        System.out.println(nums[0].length);

        String name = "kuldeep";
        System.out.println(name.length());
    }

}
