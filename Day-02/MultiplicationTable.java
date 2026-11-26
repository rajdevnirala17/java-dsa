import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long a = sc.nextLong();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i); // Time: O(1), Space: O(1)
        }
        sc.close();
    }
}
