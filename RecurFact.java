public class RecurFact {
    static int fact = 1;
    public static void main(String[] args)
    {
        factorialNum(1);
        System.out.println("Factorial: " + calculateFactorial(1));
    }

    public static void factorialNum(int n)
    {
        fact *= n;
        if(n >= 5)
        {
            System.out.println("Factorial: " + fact);
            return;
        }
        factorialNum(n + 1);
        System.out.println("N: " + n);
    }

    public static int calculateFactorial(int n)
    {
        if(n >= 6)
        {
            return 1;
        }
        int result = n * calculateFactorial(n + 1);
        return result;
    }
}