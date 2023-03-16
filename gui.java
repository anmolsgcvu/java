import java.util.Scanner;
import javax.swing.*;

public class gui {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the HRA");
        int hra = scanner.nextInt();
        System.out.println("Enter the TA");
        int ta = scanner.nextInt();
        System.out.println("Enter the MA ");
        int ma = scanner.nextInt();
        System.out.println("Enter the PF");
        int pf = scanner.nextInt();
        int gshra = (int) (hra * 1.50);
        int gsta = (int) (ta * 1.30);
        int gsma = (int) (ma * 1.250);
        int gspf = (int) (pf * 1.10);
        int gs = gshra + gsta + gsma + gspf;
        int tax = (int) (gs * 0.1);
        int ns = gs - tax - pf;

        JFrame f = new JFrame("TextField Example");
        JTextField t1, t2, t3, t4, t5;
        t1 = new JTextField(gshra);
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Enter the TA");
        t2.setBounds(50, 150, 200, 30);
        t3 = new JTextField("Enter the MA");
        t3.setBounds(50, 200, 200, 30);
        t4 = new JTextField("Enter the PF.");
        t4.setBounds(50, 250, 200, 30);
        t5 = new JTextField("Enter the HRA");
        t5.setBounds(50, 300, 200, 30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }

}
