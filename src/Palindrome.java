public class Palindrome {
    public static void main(String[] args) {
        String str1 = "MADAM";
//        String str1 = "NAMAN";
//        String str1 = "NITIN";
        String str2 = "";
        for (int i = str1.length()-1; i >= 0 ; i--)
        {
            str2 = str2 + str1.charAt(i);
        }
//        now we have to match the value of str1 and st2 so that if found
//        both matched we scan say its a palindrome.
        if (str1.equals(str2))
        {
            System.out.println("It's a Palindrome");
        }
        else
        {
            System.out.println("It's Not a Palindrome");
        }
    }
}
