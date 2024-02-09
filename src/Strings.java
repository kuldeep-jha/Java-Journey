public class Strings {
    public static void main(String[] args) {
        String brand = "pwskill";
        System.out.println(brand);
        brand.concat("mumbai");
        System.out.println(brand);

        StringBuffer brand1 = new StringBuffer("pwskill");
        System.out.println(brand1);
        brand1.append("mumbai");
        System.out.println(brand1);


//        different ways to create strings
        String str = "pw";

        String str1 = new String("pw");

        char[] ch = {'p', 'w'};
        String str2 = new String(ch);


        String s1 = "pwskill";
        String s2 = new String("pwskill");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); //true

        String w1 = "pwskill";
        String w2 = "pwskill";
        String w3 = "PWskill";
        System.out.println(w1 == w3); //false -java is case senstive

        String q1 = "pwskill";
        String q2 = new String("PWskill");
        String q3 = new String("pwskill");

        System.out.println(q1 == q2);
        System.out.println(q2 == q3);
        System.out.println(q1.equals(q2));
        System.out.println(q2.equals(q3));
//        all false
        System.out.println(q2.equalsIgnoreCase(q3));
        //here is ignores the case and just compare the values. so it will be true.

    }
}
