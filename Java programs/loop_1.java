import java.util.*;

public class loop_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int sum = num * i;
            System.out.println(num + " * " + i + " = " + sum);
        }
        sc.close();
    }
}