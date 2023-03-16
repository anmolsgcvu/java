import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class seed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();
        int k, p;

        while (true) {

            while (true) {
                System.out.println("x is seed  ");

                int i = scanner.nextInt();
                k = i;
                System.out.println("x is seed  ");
                i = scanner.nextInt();
                p = i;
                System.out.println("exit for 1");
                i = scanner.nextInt();

                if (i == 1) {
                    break;
                } else {

                }
            }
            int o, u = k, c = 0, min = 0, max, lc = 0;

            o = 0;

            for (int j = 0; j <= k + 11; j++) {
                if (k == 0) {

                    break;
                } else {
                    c = k % 10;
                    list.add(c);
                }
                k = k / 10;

            }
            c = list.size();
            min = u;

            for (int j = 0; j <= c - 1; j++) {
                System.out.println(list.get(j) + "  " + min);
                lc = list.get(j);
                min *= lc;
            }
            if (min == p) {
                System.out.println("yes" + min + "   " + p);

            } else {
                System.out.println("no" + min + "  " + p);
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
