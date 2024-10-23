/*
Dada una lista de números enteros, tu tarea es escribir un programa que intercambie dos elementos en posiciones específicas dentro de la lista.
Por ejemplo, si tienes una lista [2, 5, 9, 3, 6] y necesitas intercambiar los elementos en los índices 1 y 3, el resultado debe ser [2, 3, 9, 5, 6].
*/

import java.util.ArrayList;

public class SwapTwoNumber {

    // Método para intercambiar dos elementos de la lista según sus índices
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Guardamos temporalmente el valor en el índice idx1
        int temp = list.get(idx1);
        
        // Asignamos el valor en idx2 a idx1
        list.set(idx1, list.get(idx2));
        
        // Asignamos el valor temporal (original en idx1) a idx2
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Creamos una lista de números enteros
        ArrayList<Integer> list = new ArrayList<>();
        
        // Agregamos números a la lista
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Especificamos los índices que queremos intercambiar
        int idx1 = 1, idx2 = 3;

        // Imprimimos la lista original
        System.out.println(list);  // [2, 5, 9, 3, 6]

        // Imprimimos un mensaje de cambio
        System.out.println("After swap Numbers..");

        // Llamamos al método 'swap' para intercambiar los elementos en idx1 e idx2
        swap(list, idx1, idx2);

        // Imprimimos la lista después de realizar el intercambio
        System.out.println(list);  // [2, 3, 9, 5, 6]
    }
}
