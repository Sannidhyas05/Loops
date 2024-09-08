// Set of integers and printing sun of odd and even numbers

import java.util.Scanner;

public class Even {
    public static int sumofeven(int n)
    {
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"\t");
                sum+=i;
            }
        }
        return sum;
    }
    public static int sumofodd(int n)
    {
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+"\t");
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(sumofeven(n));
        System.out.println(sumofodd(n));
    }
}