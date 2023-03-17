import java.util.*;

public class CarreraPopular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradas = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < entradas; i++) {
            int hermanos = 0;
            String linea = sc.nextLine();
            ArrayList<String> apellidos = new ArrayList<>();
            String[] lineassplit;
            while (!linea.contains("====")) {
                lineassplit = linea.split(",");
                apellidos.add(lineassplit[0].toUpperCase(Locale.ROOT));
                linea = sc.nextLine();
            }
            Set<String> her = new HashSet<>();
            apellidos.forEach(s -> her.add(s));
            if(her.size()==1)hermanos=apellidos.size();
            else hermanos=(apellidos.size()-her.size())+1;
            System.out.println(apellidos.size()+" "+hermanos);
        }
    }
}
