public class Recur1 {
    
    static void fun(int n)
    {
        if(n > 0)
        {
            System.out.println("Enter: " + n);
            fun(n-1);

            System.out.println("Exit: " + n);
        }
    }

    static void forLoop(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }


    static void printVal(int n)
    {
        if(n > 5)
        {
            return;
        }
        System.out.println(n);
        printVal(n+1);
    }

    static void Nto1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n + " ");
        Nto1(n-1);
    }

    static int count = 0;
    static void counter(int n)
    {
        count += n;
        if(n == 5)
        {
            System.out.println(count);
            return;
        }
        counter(n+1);
    }

    static int sum = 0;
    static void sumOfDigits(int n)
    {
        if(n == 0)
        {
            System.out.println(sum);
            return;
        }
        sum += n;
        sumOfDigits(n-1);

    }

    public static void main(String[] args) {
        Nto1(10);
        System.out.println();
        counter(1);
        System.out.println();
        sumOfDigits(count);

        System.out.println();
        printVal(1);
    }
}
