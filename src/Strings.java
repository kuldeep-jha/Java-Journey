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


//        diffrent ways to create strings
        String str = "pw";

        String str1 = new String("pw");

        char[] ch = {'p', 'w'};
        String str2 = new String(ch);
    }
}
