package Concurso2015;

import java.util.Scanner;

public class AsaltoCastillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batallon = sc.nextInt();
        while (batallon != 0) {
            System.out.println(getContador(batallon));
            batallon = sc.nextInt();
        }
    }

    public static int getContador(int batallon) {
        int c = 0;
        for (int i = 1; i <= Math.sqrt(batallon); i++) {
            if (batallon % i == 0) {
                if (i * i != batallon) {
                    c += 2;
                } else {
                    c++;
                }
            }
        }
        return c;
    }
}