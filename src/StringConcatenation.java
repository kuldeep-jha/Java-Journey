public class StringConcatenation {
    public static void main(String[] args) {
//        String s1 = new String("pwskill");
//        s1 = s1.concat("java");
//        System.out.println(s1);

        String s1 = "pwjava";
        String s2 = s1.concat("skill");
        String s3 = new String("pwjava");
        s3 = s3.concat("skills");

//        System.out.println(s1);  //pwjava
//        System.out.println(s2); //pwjavaskill
//        System.out.println(s3); //pwjavaskills

//        + operator

        String a1 = "pw";
        String a2 = "pw" + "java";
        String a3 = "pw" + "java" + "skills";
        String s4 = s1 + s2;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

//        with + operator with could also add int value in the strings.
        String str1 = "pw";
        String str2 = "pw" + 100 + 10;
        String str3 = str1 + str2;
        System.out.println(str3);

//        with concat we could only add one object but with
//        + operator more than 2 objs can be added.
    }
}
