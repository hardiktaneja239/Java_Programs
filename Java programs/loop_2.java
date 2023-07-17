import java.util.*;

public class loop_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pattern of * ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j == i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
