import java.util.Scanner;

public class ElprecioDeLaGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        while (e!=0){
            int[] array = new int[e];
            for (int i = 0; i < e; i++) {
                int p = sc.nextInt();
                array[i]=p;
            }
            int contador=1;
            int contact=1;
            int ult;
            for (int i = 1; i < e; i++) {
                ult=array[i-1];
                if(contador<contact)contador=contact;
                if(ult<array[i]){
                    contact++;
                }
            }
            if(contador<contact)contador=contact;
            System.out.println(contador);
            e=sc.nextInt();
        }
    }
}


