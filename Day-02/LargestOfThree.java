import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("1st no is largest : " + a);
        } else if (b >= a && b >= c) {
            System.out.println("2nd no is largest : " + b);
        } else {
            System.out.println("3rd no is largest : " + c);
        }
        int result = Math.max(a, Math.max(b, c));
        System.out.println("largest number is : " + result);
        sc.close();
    }

}
