/*
 *       Counting Sort
 *       Algoritmo de ordenación para arrays de enteros no negativos.
 */

public class CountingSort {

    // Método que implementa el algoritmo de Counting Sort
    public static void sortArray(int array[]) {
        // Encontramos el valor más grande del array para determinar el tamaño del array 'count'
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(array[i], largest);  // Actualiza el valor más grande
        }

        // Creamos un array de conteo basado en el número más grande encontrado
        int count[] = new int[largest + 1];  // El tamaño es el valor más grande + 1

        // Llenamos el array de conteo
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;  // Incrementa la cuenta de cada número
        }

        // Proceso de ordenación
        int j = 0;  // Índice para recorrer el array original
        for (int i = 0; i < count.length; i++) {
            // Mientras haya elementos en count[i], los colocamos en el array original
            while (count[i] > 0) {
                array[j] = i;  // Coloca el valor i en el array original
                j++;           // Avanza el índice del array original
                count[i]--;    // Decrementa el contador en la posición i
            }
        }
    }

    public static void main(String[] args) {
        // Array de ejemplo a ordenar
        int array[] = {1, 4, 1, 3, 2, 4, 3, 7};

        // Llamamos al método para ordenar el array
        sortArray(array);

        // Imprimimos el array ordenado
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");  // Imprime el array ordenado
        }
    }
}

/*
 *   Output:
 *   1 1 2 3 3 4 4 7
 */
