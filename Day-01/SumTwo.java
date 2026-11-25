import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
        int result = a+b;

        System.out.println("Sum is : "+ result);
        sc.close();
    

    }
    
}
