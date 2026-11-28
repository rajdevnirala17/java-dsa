
// Time: O(d), Space: O(1), where d is the number of digits.

import java.util.Scanner;

public class ReversalOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        long reversed = 0;
        if (n < 0) {
            System.out.println("Error use a valid whole Number!");
        } else {

            while (n > 0) {
                int last = n % 10;
                reversed = reversed * 10 + last;
                n = n / 10;
            }
            System.out.println("Reversed : " + reversed);
        }
        sc.close();
    }
}