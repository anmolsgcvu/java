import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class patte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int f, marks = 0, bill, first, sec;
        double result;
        int g = 8, p = 1, k, d = 8;
        int i, o = 8;
        List<String> h = new ArrayList<>();
        while (true) {

            System.out.println("patten");
            i = scanner.nextInt();
            o = i;
            if (i == 1) {
                for (int j = 8; j > 1; j--) {
                    for (int l = 8; l > 1; l--) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            } else if (o == 2) {
                for (int j = 8; j > 1; j--) {
                    for (int l = 8; l > 1; l--) {
                        if ((j == 8 || j == 2)) {
                            System.out.print("*");
                        } else if ((l == 2 || l == 8) && (j > 2 || j < 8)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }
            } else if (o == 3) {
                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }
            } else if (o == 4) {
                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }

            } else if (o == 5) {
                for (int j = 1; j <= 8; j++) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }
            } else if (o == 6) {
                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }
                for (int j = 1; j <= 8; j++) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }
            } else if (o == 7) {
                for (int j = 1; j <= 8; j++) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }
                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }

            } else if (o == 8) {

                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }

            } else if (o == 9) {
                p = 1;

                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = p;
                    p++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }
                p = 1;

            } else if (o == 10) {
                p = 1;
                g = 8;

                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = p;
                    p++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }
                p = 1;
                g = 8;
                for (int j = 1; j <= 8; j++) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = g;
                    g--;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }

                    System.out.println();

                }
                p = 1;
                g = 8;

            } else if (o == 11) {
                p = 0;
                for (int j = 8; j >= 1; j--) {
                    k = p;
                    p++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }

            } else if (o == 12) {
                int y = 0;
                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    k = y;
                    y++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();

                }

            } else if (o == 13) {
                p = 1;
                g = 8;
                for (int j = 8; j >= 1; j--) {

                    k = p;
                    p++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }

                    System.out.println();

                }
                p = 1;
                g = 8;
                for (int j = 1; j <= 8; j++) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = g;
                    g--;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }

                    System.out.println();

                }
                g = 8;

            } else if (o == 14) {
                p = 1;
                g = 8;
                for (int j = 1; j <= 8; j++) {
                    k = p;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = g;
                    g++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }
                p = 1;
                g = 8;
                for (int j = 1; j <= 8; j++) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = g;
                    g--;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }

                    System.out.println();

                }
                p = 1;
                g = 8;

            } else if (o == 15) {
                g = 8;
                for (int j = 1; j <= g; j++) {
                    for (int l = 1; l <= g; l++) {
                        if ((j == 1 || j == 7)) {
                            System.out.print("*");

                        } else if (l == 1 || l == 8) {
                            System.out.print("*");

                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }

            } else if (o == 16) {
                g = 8;
                for (int j = g; j >= 1; j--) {
                    for (int l = g; l >= 1; l--) {
                        if (((j == 1 || j == 8) || (l == g || l == 1)) || (j == 7)) {
                            System.out.print("*");

                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }

            } else if (o == 17) {
                g = 8;
                for (int j = 8; j >= 1; j--) {
                    k = g;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    d = 8;
                    for (int l = d; l >= 1; l--) {
                        if (l == d || l == 1) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }

            } else if (o == 18) {
                g = 8;
                for (int j = 8; j >= 1; j--) {
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == d || l == 1) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }

            } else if (o == 19) {
                g = 8;
                d = 8;
                g = 8;
                for (int j = 8; j >= 1; j--) {
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == d || l == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }
                p = 1;
                d = 8;

                for (int j = 8; j >= 1; j--) {
                    k = p;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == d || l == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (p >= 8) {
                        System.out.println();
                        break;
                    } else {
                        p++;
                    }
                    System.out.println();

                }
            } else if (o == 20) {
                p = 1;
                d = 8;

                for (int j = 8; j >= 1; j--) {
                    k = p;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == d || l == 1) || (j == 8)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (p >= 8) {

                        break;
                    } else {
                        p++;
                    }
                    System.out.println();

                }
                g = 8;
                d = 8;
                g = 8;
                for (int j = 8; j >= 1; j--) {
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == d || l == 1) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }

            } else if (o == 21) {
                p = 1;
                g = 8;

                for (int j = 8; j >= 1; j--) {
                    k = j;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print(" ");
                            k--;
                        }

                        else {
                            System.out.print("*");

                        }
                    }
                    k = p;
                    p++;
                    for (int l = 8; l >= 1; l--) {
                        if ((k != 0)) {
                            System.out.print("*");
                            k--;
                        }

                        else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println();

                }
            } else if (o == 22) {

                g = 8;
                d = 8;
                g = 8;
                for (int j = 8; j >= 1; j--) {
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }
                p = 1;
                d = 8;
                g = 8;
                for (int j = 8; j >= 1; j--) {
                    k = p;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    if (p >= 8) {
                        System.out.println();
                        break;
                    } else {
                        p++;
                    }
                    System.out.println();

                }
            } else if (o == 23) {
                g = 8;
                int e = 1;
                for (int j = 8; j >= 1; j--) {
                    k = g;

                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    e++;
                    for (int l = 1; l <= e; l++) {
                        if ((l == e) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }
                e = 1;

            } else if (o == 24) {
                p = 1;
                int e = 8;
                for (int j = 8; j >= 1; j--) {
                    k = p;

                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1) || (j == 1) || (j == 8)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    e--;
                    for (int l = 1; l <= e; l++) {
                        if ((l == e) || (j == 1) || (j == 8)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    k = p;
                    d = 1;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    if (p >= 8) {
                        System.out.println();
                        break;
                    } else {
                        p++;
                    }
                    System.out.println();

                }
                e = 8;

            } else if (o == 25) {
                g = 8;
                int e = 1;
                for (int j = 8; j >= 1; j--) {
                    k = g;

                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    e++;
                    for (int l = 1; l <= e; l++) {
                        if ((l == e)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }
                e = 1;

                p = 1;
                e = 8;
                for (int j = 8; j >= 1; j--) {
                    k = p;

                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    e--;
                    for (int l = 1; l <= e; l++) {
                        if ((l == e) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    k = p;
                    d = 1;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    if (p >= 8) {
                        System.out.println();
                        break;
                    } else {
                        p++;
                    }
                    System.out.println();

                }
                e = 8;

            } else if (o == 26) {
                p = 1;
                int e = 8;
                for (int j = 8; j >= 1; j--) {
                    k = p;

                    d = 8;
                    for (int l = 32; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1) || (j == 1) || (j == 8)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    e--;
                    for (int l = 1; l <= e; l++) {
                        if ((l == e) || (j == 1) || (j == 8)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    k = p;
                    d = 1;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    if (p >= 8) {
                        System.out.println();
                        break;
                    } else {
                        p++;
                    }
                    System.out.println();

                }
                e = 8;
                g = 8;
                e = 1;
                for (int j = 8; j >= 1; j--) {
                    k = g;

                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }

                    for (int l = 1; l <= d; l++) {
                        if ((l == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    e++;
                    for (int l = 1; l <= e; l++) {
                        if ((l == e) || (j == 1)) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    k = g;
                    d = 8;
                    for (int l = 8; l >= 1; l--) {
                        if (k == 0) {
                            break;

                        } else {
                            k--;
                            d--;
                            System.out.print(" ");

                        }
                    }
                    if (g <= 1) {
                        System.out.println();
                        break;
                    } else {
                        g--;
                    }
                    System.out.println();

                }
                e = 1;

            } else if (o == 27) {
                int y = -1;

                for (int j = 0; j <= 32; j++) {

                    d = 8;
                    y++;
                    System.out.print("*");

                    for (int u = 1; u <= 32; u++) {
                        if ((j == 1) || (j == 32) || (u == y) || (u == (33 - y))) {
                            System.out.print("*");

                        } else {

                            System.out.print(" ");

                        }
                    }
                    System.out.println("*");
                }
            }

            System.out.println("exit for 1");
            k = scanner.nextInt();
            if (k == 1) {
                break;
            } else {

            }
            p = 1;
            g = 8;
            d = 8;
        }

    }

}
