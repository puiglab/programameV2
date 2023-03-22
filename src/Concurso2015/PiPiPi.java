package Concurso2015;

import java.util.Scanner;

public class PiPiPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int cadenas = sc.nextInt();
        int d =0;
        int h =0;
        int m=0;
        int s=0;
            while (dias != 0 & cadenas!=0) {
               int segundos = ((cadenas*6)*24)*dias;
               while (segundos>=86400){
                   segundos=segundos-86400;
                   ++d;
               }
               while (segundos>=3600){
                   segundos=segundos-3600;
                   ++h;
               }
               while (segundos>=60){
                   segundos=segundos-60;
                   ++m;
               }
               s=segundos;
                if(h<10 & m<10 & s<10)System.out.println(d+":0"+h+":0"+m+":0"+s);
                else if( m<10 & s<10)System.out.println(d+":"+h+":0"+m+":0"+s);
                else if( h<10 & s<10)System.out.println(d+":0"+h+":"+m+":0"+s);
                else if( h<10 & m<10)System.out.println(d+":0"+h+":0"+m+":"+s);
                else if( m<10 )System.out.println(d+":"+h+":0"+m+":"+s);
                else if( s<10)System.out.println(d+":"+h+":"+m+":0"+s);
                else if( h<10)System.out.println(d+":0"+h+":"+m+":"+s);
                else System.out.println(d+":"+h+":"+m+":"+s);
                dias=sc.nextInt();
                cadenas=sc.nextInt();
                d=0;
                h=0;
                m=0;
                s=0;

        }
    }

}
