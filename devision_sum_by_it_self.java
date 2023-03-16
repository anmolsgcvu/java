import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class devision_sum_by_it_self {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();
        int k;

        while (true) {

            while (true) {
                System.out.println("sum of the digits is divisble its number  ");

                int i = scanner.nextInt();
                k = i;
                System.out.println("exit for 1");
                i = scanner.nextInt();

                if (i == 1) {
                    break;
                } else {

                }
            }
            int o, u = k, c = 0, min = 0, max, lc = 0;

            o = 0;

            for (int j = 0; j <= k;) {
                c = k % 10;

                list.add(c);
                if (k == 0) {

                    break;
                }
                k = k / 10;
            }
            c = list.size();

            for (int j = 0; j <= c - 1; j++) {

                lc += list.get(j);

            }
            if (u % lc == 0) {
                System.out.println("yes");

            } else {
                System.out.println("no");
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
