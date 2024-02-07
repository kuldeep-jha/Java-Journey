public class ArrayException {
    public static void main(String[] args) {
//        ArrayOutOfBoundsException
        int nums[] = {5,3,7,6};
//        System.out.println(nums[4]); //here if we look we dont have any 4th index
//        and we were searching for the 4th index.
//        System.out.println("hi");//once exception came it will terminate the further execution

//  if we dont know the total num of index and we want the last value of the array
//        System.out.println(nums[nums.length-1]);

//        for (int i = 0; i < 4; i++) {  //here also arr exception could come
////            if we right index no greater than in arr.
//            System.out.println(nums[i]);
//        }
//        also we could write in this way
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        also could do in enhanced for loop
        for (int num : nums){
            System.out.println(num);

        }
    }
}
