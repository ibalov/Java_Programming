import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
    public static void main(String[] args) {
        // Crear una lista de enteros
        ArrayList<Integer> list = new ArrayList<>();
        
        // Agregar números a la lista
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(0);
        list.add(4);

        // Imprimir la lista original
        System.out.println(list + " \nSort ArrayList");

        // Ordenar la lista en orden ascendente
        Collections.sort(list); // ascendente
        System.out.println(list); // [0, 1, 3, 4, 5, 6]

        // Ordenar la lista en orden descendente
        Collections.sort(list, Collections.reverseOrder()); // descendente
        System.out.println(list); // [6, 5, 4, 3, 1, 0]
    }
}
