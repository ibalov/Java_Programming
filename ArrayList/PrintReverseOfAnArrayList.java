/*
Imprimir una ArrayList en orden inverso:

Dada una ArrayList que contiene varios números enteros, tu tarea es recorrer la lista en orden inverso
e imprimir los elementos uno por uno desde el último hasta el primero.
*/
import java.util.ArrayList;

public class PrintReverseOfAnArrayList {
    
    public static void main(String[] args) {
        
        // Crear una ArrayList de enteros
        ArrayList<Integer> list = new ArrayList<>();
        
        // Agregar números a la lista
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // Imprimir la lista original
        System.out.println(list);  // [1, 2, 3, 4, 5]
        
        // Imprimir la lista en orden inverso
        System.out.println("Reverse arrayList");
        
        // Bucle que recorre la lista desde el último elemento hasta el primero
        for(int i = list.size() - 1; i >= 0; i--) {
            // Imprimir el elemento actual
            System.out.print(list.get(i) + " ");  // 5 4 3 2 1
        }
    }
}
