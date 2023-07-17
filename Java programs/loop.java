import java.util.*;

public class loop {
    public static void main(String argd[]) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.print(i + " ");
        // }

        // int i = 0;
        // while (i <= 10) {
        // System.out.print(i + " ");
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.println(i);4
        // i++;
        // } while (i <= 10);

        // sum of first n naturak numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
