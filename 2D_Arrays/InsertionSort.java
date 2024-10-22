public class InsertionSort {

    // Método para ordenar un arreglo usando el algoritmo de ordenamiento por inserción
    public static void sortArray(int array[]) {
        // Comienza desde el segundo elemento del arreglo
        for(int i = 1; i < array.length; i++) {
            // Guardar el elemento actual que se va a insertar
            int curr = array[i];
            // Inicializar el índice del elemento anterior
            int prev = i - 1;

            // Desplazar los elementos del arreglo que son mayores que 'curr'
            // hacia la derecha para hacer espacio
            while(prev >= 0 && array[prev] > curr) {
                // Mover el elemento mayor una posición a la derecha
                array[prev + 1] = array[prev];
                // Decrementar el índice del elemento anterior
                prev--;
            }
            // Insertar el elemento 'curr' en su posición correcta
            array[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        // Crear un arreglo desordenado de enteros
        int array[] = {5, 4, 1, 3, 2};
        
        // Llamar al método sortArray para ordenar el arreglo
        sortArray(array);
        
        // Imprimir el arreglo ordenado
        for(int i = 0; i < array.length; i++) {
            // Mostrar cada elemento del arreglo ordenado
            System.out.print(array[i] + " ");
        }
    }
}

/*
 *    Output:
 *    1 2 3 4 5
 */
