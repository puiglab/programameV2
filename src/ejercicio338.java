import java.util.*;

public class ejercicio338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examinados = sc.nextInt();
        int recorda = sc.nextInt();
        sc.nextLine();
        int copiados=0;
        int pillados=0;
        int[] resulados = new int[examinados];
        for(int i=0;i<examinados;i++){
            resulados[i]=sc.nextInt();
        }
        sc.nextLine();

        Set<Integer> repetidos = new HashSet<>();
        for (int j =0;j<resulados.length;j++) {
            repetidos.add(resulados[j]);
        }

        Set<Integer> examenesVistos = new HashSet<>();
        for (int i = 0; i < examinados; i++) {
            int examenActual = resulados[i];
            if (examenesVistos.contains(examenActual)) {
                pillados++;
            if (i >= recorda) {
                examenesVistos.remove(resulados[i-recorda]);
            }

              /*  if (i >= recorda && !examenesVistos.contains(resulados[i-recorda])) {
                    pillados++;
                }

               */
            }
            examenesVistos.add(examenActual);
        }
        System.out.println(resulados.length-repetidos.size() + " " + pillados);


    }
}
