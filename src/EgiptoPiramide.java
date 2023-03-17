import java.util.Scanner;

public class EgiptoPiramide {


    public static void main(String[] args) {
        int entrada, a, b, c;

        Scanner sc = new Scanner(System.in);

        entrada = sc.nextInt();
        sc.nextLine();
     //   System.out.println(entrada);
        for (int i = 0; i < entrada; i++) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextInt();
            String line = sc.nextLine();
            String[] chunks = line.split(" ");

            a = Integer.parseInt(chunks[0]);
            b = Integer.parseInt(chunks[1]);
            c = Integer.parseInt(chunks[2]);

         //   System.out.println(a);
          //  System.out.println(b);
          //  System.out.println(c);
            if (a < b && b < c || (a > -10000) && (c < 10000)) {
                // + + +
                if (a > 0) {
                    if ((b - a) < (c - b)) System.out.println(a);
                    else if ((b - a) == (c - b)) System.out.println("EMPATE");
                    else System.out.println(c);

                }
                // - + +

                else if (a < 0 && b > 0) {
                    if (((a * -1) + b) - 1 < c - b) System.out.println(a);
                    else if (((a * -1) + b) - 1 == c - b) System.out.println("EMPATE");
                    else System.out.println(c);

                }

                // - - +
                else if (b < 0 && c > 0) {

                    if ((a - b) * -1 < c + (b * -1) - 1) System.out.println(a);
                    else if ((a - b) * -1 == c + (b * -1) - 1) System.out.println("EMPATE");
                    else System.out.println(c);
                }

                //  - - -
                else if (c < 0) {

                    if ((a * -1) - b < (b * -1) - c) System.out.println(a);
                    else if ((a * -1) - b == (b * -1) - c) System.out.println("EMPATE");
                    else System.out.println(c);

                }
            }
        }
    }
}
