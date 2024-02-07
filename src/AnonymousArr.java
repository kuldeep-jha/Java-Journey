class Cal
{
    public int add(int num[])
    {
        int result = 0;
        for ( int n : num)
        {
            result = 0 + n;
        }
        return result;
    }
}



public class AnonymousArr
{
    public static void main(String[] args) {

        Cal obj = new Cal();

        int result = obj.add(new int[]{7,8,9,4,5});
        System.out.println(result);

    }
}
