import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input for factorial ");
        } else if (n > 20) {
            System.out.println("Result exceeds the long limit (max n is 20)");
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i; // Time: O(n), Space: O(1)
            }
            System.out.println("Value of " + n + "! is : " + result);
        }
        sc.close();
    }
}