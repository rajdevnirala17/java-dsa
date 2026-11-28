
// Time: O(d), Space: O(1), where d is the number of digits.

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        long original = n;
        long reversed = 0;
        if (n < 0) {
            System.out.println("Error use a valid whole Number!");
        } else {

            while (n > 0) {
                int last = n % 10;
                reversed = reversed * 10 + last;
                n = n / 10;
            }
            if (original == reversed) {
                System.out.println("The number is palindrome");
            } else {
                System.out.println("Not a palindrome number");
            }
        }
        sc.close();
    }

}
