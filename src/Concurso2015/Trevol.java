package Concurso2015;

import java.util.Scanner;

public class Trevol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = sc.nextInt();

        for(int i=0;i<bucle;i++){
            int num = sc.nextInt();
            if(num>0 & num<20000){

            if(num<3 | num==5){
                System.out.println("IMPOSIBLE");
            }
            else if(num%3==0){
                System.out.println("0");
            }
            else{
                System.out.println(num%3);

            }
            }

        }


    }
}
