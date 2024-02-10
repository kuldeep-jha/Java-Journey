public class ReversingString {
    public static void main(String[] args) {
//        String str1 = "pwjava";  // index num of string is 012345 - total length 6
//        String str2 = "";
//        for (int i = str1.length()-1; i >= 0; i--)
//        {
//            str2 = str2 + str1.charAt(i);
//        }
//        System.out.println("Before Reversing: "+ str1);
//        System.out.println("After Reversing:"+str2);  //OP : avajwp


//        case 2: pwskill java > java pwskill

//        String str1 = "pwskill java";
//        String str2 = "";
//        String str [] = str1.split(" ");
//
//        for (int i = str.length-1; i >= 0; i--){
//            str2 = str2 + str[i]+ " ";
//        }
//        System.out.println("Before split reverse: "+ str1);
//        System.out.println("After split reverse: "+str2);


//        case 3: "pwskill java" > avaj llikswp
        String str1 = "pwskill java";
        String str2 = "";
        for (int i = str1.length()-1; i >= 0 ; i--){
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);
    }
}
