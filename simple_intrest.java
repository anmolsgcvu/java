import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the HRA");
        int hra = scanner.nextInt();
        System.out.println("Enter the TA");
        int ta = scanner.nextInt();
        System.out.println("Enter the MA ");
        int ma = scanner.nextInt();
        System.out.println("Enter the PF");
        int pf = scanner.nextInt();
        int bs = hra + ta + ma + pf;
        int gshra = (int) (hra * 1.50);
        int gsta = (int) (ta * 1.30);
        int gsma = (int) (ma * 1.250);
        int gspf = (int) (pf * 1.10);
        int gs = gshra + gsta + gsma + gspf;
        int tax = (int) (gs * 0.1);
        int ns = gs - tax - pf;
        System.out.println("basic salary IS " + bs);
        System.out.println("Gross salary IS " + gs);
        System.out.println("Tax IS " + tax);

        System.out.println("NET SALARY IS " + ns);

    }

}
