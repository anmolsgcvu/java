import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inser_sort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();
        int arr[] = new int[4];
        int a = 0;
        while (true) {
            while (true) {
                System.out.println("enter number to be array to be sort  ");

                int i = scanner.nextInt();
                arr[a] = i;
                a += 1;

                System.out.println("exit for 1");
                i = scanner.nextInt();
                if (i == 1) {
                    break;
                } else {

                }
            }
            int o, u = 0, c = 0, min, max, lc = 0;
            c = arr.length;
            o = 0;
            System.out.println("all element to be lcm");

            for (int j = 0; j <= c; j++) {
                System.out.print(arr[j]);
            }
            for (int i = 1; i < c; ++i) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {

                    arr[j] = arr[j];

                    j = j - 1;
                }
                arr[j + 1] = key;

            }
            System.out.println();
            for (int j = 0; j <= c; j++) {
                System.out.print(arr[j]);
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
