import java.util.Scanner;

public class Factorial {
    public static int fact(int n)
    {
        int result=1;
        for(int i=n; i>1; i--)
        {
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
