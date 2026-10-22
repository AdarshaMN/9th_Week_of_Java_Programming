public class RecurAb {
    
    public static void main(String[] args)
    {
        int result = aPowerB(2, 5);
        System.out.println(result);
    }

    public static int aPowerB(int a, int b)
    {
        if(b == 0)
        {
            return 1;
        }
        int result = a * aPowerB(a, b-1);
        System.out.println("B: " + b);
        return result;
    }
}
