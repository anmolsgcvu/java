import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();

        while (true) {
            while (true) {
                System.out.println("enter number to be array to be sort  ");

                int i = scanner.nextInt();
                list.add(i);
                System.out.println("exit for 1");
                i = scanner.nextInt();
                if (i == 1) {
                    break;
                } else {

                }
            }
            int o, u = 0, c = 0, min = 0, max, lc = 0;
            c = list.size();
            o = 0;
            System.out.println("all element to be lcm");

            for (int j = 0; j <= (c - 1); j++) {
                System.out.print(list.get(j));
            }

            for (int j = 0; j < c - 1; j++) {
                min = j;

                for (int p = 1 + j; p < c; p++) {
                    if (list.get(p) < list.get(min)) {
                        min = p;

                    }
                }

                int g = list.get(min);
                list.set(min, list.get(j));
                list.set(j, g);

            }

            System.out.println();
            for (int j = 0; j <= (c - 1); j++) {
                System.out.print(list.get(j));
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
