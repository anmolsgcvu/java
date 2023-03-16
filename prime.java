import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();
        int k;

        while (true) {

            while (true) {
                System.out.println("enter number to be prime  ");

                int i = scanner.nextInt();
                k = i;
                System.out.println("exit for 1");
                i = scanner.nextInt();

                if (i == 1) {
                    break;
                } else {

                }
            }
            int o, u = 0, c = 0, min = 0, max, lc = 0;

            o = 0;

            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    min++;
                    break;
                }

            }
            if (min > 0) {
                System.out.println("not prime");
            } else {
                System.out.println(" prime");
            }

            System.out.println("exit for 1");
            int i = scanner.nextInt();
            if (i == 1) {
                break;
            } else {

            }

        }

    }

}
