import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quick_sort {
    List<Integer> list = new ArrayList<>();

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
            int o, u = 0, c = 0, min = 0, r = 0, l = 0, lc = 0;
            c = list.size();
            o = 0;
            System.out.println("all element to be lcm");

            for (int j = 0; j <= (c - 1); j++) {
                System.out.print(list.get(j));
            }

            /*
             * for (int j = 0; j < c - 1; j++) {
             * min = j;
             * 
             * for (int p = c; p > o; p--) {
             * if (list.get(p) < list.get(min)) {
             * r = p;
             * int g = list.get(min);
             * list.set(min, list.get(r));
             * list.set(r, g);
             * break;
             * }
             * }
             * for (int p = 1; p > c; p++) {
             * if (list.get(p) > list.get(min)) {
             * l = p;
             * int g = list.get(min);
             * list.set(min, list.get(l));
             * list.set(l, g);
             * break;
             * }
             * }
             * if (r > l) {
             * f(list, 0, c);
             * 
             * } else {
             * int g = list.get(min);
             * list.set(min, list.get(r));
             * list.set(r, g);
             * g = list.get(min);
             * list.set(min, list.get(l));
             * list.set(l, g);
             * 
             * }
             * 
             * }
             */
            quick(list, 0, c);

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

    public static int f(List list, int s, int e) {
        int pivot = (int) list.get(e); // pivot element
        int i = (s - 1);

        for (int j = s; j <= e - 1; j++) {
            // If current element is smaller than the pivot
            if ((int) list.get(j) < pivot) {
                i++; // increment index of smaller element
                int g = (int) list.get(i);
                list.set(i, list.get(j));
                list.set(j, g);
            }
        }
        int g = (int) list.get(i = 1);
        list.set(i + 1, list.get(e));
        list.set(e, g);
        return i + 1;
    }

    static void quick(List list, int start, int end) {
        if (start < end) {
            int p = f(list, start, end);
            quick(list, start, p - 1);
            quick(list, p + 1, end);
        }
    }
}
