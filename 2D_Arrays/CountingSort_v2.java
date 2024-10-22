//Array con numeros positivos y negativos

public class CountingSort {

    // Método que implementa Counting Sort para arrays con números negativos y positivos
    public static void sortArray(int array[]) {
        // Encontramos el valor más pequeño y el más grande del array
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(array[i], largest);   // Actualiza el mayor
            smallest = Math.min(array[i], smallest); // Actualiza el menor
        }

        // Ajustamos el tamaño del array de conteo considerando el desplazamiento
        int range = largest - smallest + 1;  // El rango incluye negativos y positivos
        int count[] = new int[range];        // Array de conteo basado en el rango total

        // Llenamos el array de conteo desplazando los índices para manejar negativos
        for (int i = 0; i < array.length; i++) {
            count[array[i] - smallest]++;  // Restamos 'smallest' para ajustar los índices
        }

        // Proceso de ordenación
        int j = 0;  // Índice del array original
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i + smallest;  // Restauramos el valor original al sumar 'smallest'
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // Array de ejemplo con números positivos y negativos
        int array[] = {4, -1, 2, -3, 3, -2, 1, -4};

        // Ordenamos el array
        sortArray(array);

        // Imprimimos el array ordenado
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");  // Imprime el array ordenado
        }
    }
}

/*
 * Output:
 * -4 -3 -2 -1 1 2 3 4
 */
