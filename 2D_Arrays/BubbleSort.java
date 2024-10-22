/**
Escribe un programa en Java que implemente el algoritmo de ordenamiento Bubble Sort. 
Dado un array de números enteros desordenados, el programa debe ordenarlos en orden ascendente 
y descendente utilizando este algoritmo.
*/

public class BubbleSort {

    // Método que implementa el algoritmo de Bubble Sort en orden ascendente
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia si el elemento actual es mayor que el siguiente
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método que implementa el algoritmo de Bubble Sort en orden descendente
    public static void bubbleSortDescending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Intercambia si el elemento actual es menor que el siguiente
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método para imprimir el array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Nueva línea después de imprimir todos los elementos
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Ordenar el array en orden ascendente y mostrar el resultado
        bubbleSort(arr);
        System.out.println("Array ordenado en forma ascendente:");
        printArray(arr);

        // Ordenar el array en orden descendente y mostrar el resultado
        bubbleSortDescending(arr);
        System.out.println("Array ordenado en forma descendente:");
        printArray(arr);
    }
}

/*
 * Output:
 * 1 2 3 4 5 6 7 8 9
 */

