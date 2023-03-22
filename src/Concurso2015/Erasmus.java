package Concurso2015;

import java.util.Scanner;

public class Erasmus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paises = sc.nextInt();
        long contador=0;
        long potencia=2;
        if(paises>1){
        while (paises != 0) {
            int gente = sc.nextInt();
            for (int i = 0; i < paises-1; i++) {
                int gente1 = sc.nextInt();
                if(i<1){
                    contador=(long) gente*gente1;
                }
                else {
                    contador =(long) (gente1*potencia)*contador;
                    potencia = potencia*2;
                }
            }
            System.out.println(contador);
            paises=sc.nextInt();
            contador=0;
            potencia=2;
        }
    }
    }
}
