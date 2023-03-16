import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();

        while (true) {
            /*
             * while (true) {
             * System.out.println("enter number to be array to be sort  ");
             * 
             * int i = scanner.nextInt();
             * list.add(i);
             * System.out.println("exit for 1");
             * i = scanner.nextInt();
             * if (i == 1) {
             * break;
             * } else {
             * 
             * }
             * }
             * int o, u = 0, c = 0, min = 0, max, lc = 0;
             * c = list.size();
             * o = 0;
             * System.out.println("all element to be lcm");
             * 
             * for (int j = 0; j <= (c - 1); j++) {
             * System.out.print(list.get(j));
             * }
             */
            int[] a = { 156, 344, 54, 546, 767, 23, 34, 64, 234, 654, 234,
                    65, 234, 65, 87, 3, 5, 76, 24, 2, 3, 7, 9, 5, 34, 32,
                    4525, 345, 0 };
            MaxHeapify(a, a.length);

            System.out.println(a.length);
            for (int j = 0; j <= (a.length - 1); j++) {
                System.out.println(a[j]);
            }
            System.out.println("exit for 1");
            int i = scanner.nextInt();
            if (i == 1) {
                break;
            } else {

            }

        }

    }

    private static int heapSize = 29;

    private static void MaxHeapify(int[] A, int i) {
        int l = Left(i); // lets find left child of the given index.
        int r = Right(i);// lets find right child of the given index.
        int max;
        if (l < heapSize) {
            if (A[l] > A[i]) {
                max = l;
            } else {
                max = i;
            }
        } else {
            max = i;
        }
        if (r < heapSize) {
            if (A[r] > A[max]) {
                max = r;
            }
        }
        if (max != i) {
            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
            MaxHeapify(A, max);
        }
    }

    private static int Left(int i) {
        return 2 * i;
    }

    private static int Right(int i) {
        return (2 * i) + 1;
    }
}
