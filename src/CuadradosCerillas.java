import java.util.Scanner;

public class CuadradosCerillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e=sc.nextInt();
        for (int i=0;i<e;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a*(b+1))+((a+1)*b));
        }
    }
}
