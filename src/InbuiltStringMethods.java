public class InbuiltStringMethods {
    public static void main(String[] args) {
        String str = "pw skills java";
        System.out.println(str.toUpperCase()); //PW SKILLS JAVA
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3,10));
        System.out.println(str.indexOf("s")); //it print the first s index
//        to print last "s" index
        System.out.println(str.lastIndexOf("s")); // 8

    }
}
