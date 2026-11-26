import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        long n = sc.nextLong();
        long sum = 0;
        if(n<1){
            System.out.println("Enter a positive number");
        }
        else{
            for (long i = 1; i <= n; i++) {
                sum = sum + i;                 // Loop: Time O(n), Space O(1)

            }
            System.out.println("Using loop : " + sum);
            long formulaSum = n * (n + 1) / 2; // Formula: Time O(1), Space O(1)
            System.out.println("Using Formula : " + formulaSum);
    }
        sc.close();

    }
}
