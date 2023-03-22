import java.util.*;

public class CarreraPopular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradas = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < entradas; i++) {
            Map<String, Integer> con = new HashMap<>();
            String linea = sc.nextLine();
            String[] lineassplit;
            int cont =0;
            while (!linea.contains("====")) {
                lineassplit = linea.split(",");
                if(con.containsKey(lineassplit[0].toLowerCase(Locale.ROOT))){
                    con.put(lineassplit[0].toLowerCase(Locale.ROOT), con.get(lineassplit[0].toLowerCase(Locale.ROOT))+1);
                }
                else{
                    con.put(lineassplit[0].toLowerCase(Locale.ROOT),0);
                }
                linea = sc.nextLine();
                ++cont;
            }
            int sum = 0;
            System.out.println(cont+" "+(cont-sum));


        }

    }
}
