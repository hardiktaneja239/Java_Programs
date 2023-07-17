import java.util.*;

public class Switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :  ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 :  ");
        int num2 = sc.nextInt();
        System.out.println("Enter the button : ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                int sum = num1 + num2;
                System.out.println(sum);
                break;

            case 2:
                sum = num1 - num2;
                System.out.println(sum);
                break;

            case 3:
                sum = num1 * num2;
                System.out.println(sum);
                break;

            case 4:
                sum = num1 / num2;
                System.out.println(sum);
                break;

            case 5:
                sum = num1 % num2;
                System.out.println(sum);
                break;

            case 6:
                sum = num1 ^ num2;
                System.out.println(sum);
                break;

            default:
                System.out.println("Invalid button");
                break;

        }
        sc.close();

    }
}
