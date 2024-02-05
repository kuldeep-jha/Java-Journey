class calc
{
    public int add(int n1, int n2)
    {
        int result = n1 + n2;
        return result;
    }
    public int add(int n1, int n2, int n3)
    {
        int result = n1 + n2;
        return result;
    }
    public double add(double n1, double n2)
    {
        double result3 = n1 + n2;
        return result3;
    }
    public double add(int n1, double n2)
    {
        double result4 = n1 + n2;
        return result4;
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        calc obj = new calc();
        int result = obj.add(4 , 3);
        System.out.println(result);

        double return3 = obj.add(3.3,2.12);
        System.out.println(return3);

        double return4 = obj.add(2.4,2.02);
        System.out.println(return4);
    }
}
