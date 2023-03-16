import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hotel1 {
    public static void main(String[] args) {
        System.out.println("1.a 10");
        System.out.println("2.b 20");
        System.out.println("3.c 30");
        System.out.println("4.d 40");
        System.out.println("5.e 50");
        System.out.println("6.f 60");
        System.out.println("7.g 70");
        System.out.println("8.h 80");
        System.out.println("9.i 90");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int f, bill = 0;
        List<Integer> h = new ArrayList<>();

        while (true) {
            System.out.println("Enter the choice");
            System.out.println("Enter the c ");
            int i = scanner.nextInt();
            if (i >= 1 & i < 10) {
                list.add(i);
            } else {
                break;
            }
        }

        for (int j = 1; j < 9; j++) {
            h.add(j * 10);

        }
        for (int g = 0; g < list.size(); g++) {

            System.out.println((list.get(g)));
            f = (list.get(g));
            bill = bill + (h.get(f));

        }
        System.out.println("bill" + bill);

    }
}
