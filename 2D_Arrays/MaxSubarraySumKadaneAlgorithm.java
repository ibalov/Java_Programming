/*
Escribe un programa en Java que encuentre la suma máxima de un subarreglo dentro de un arreglo dado de enteros. 
Utiliza el algoritmo de Kadane, que es eficiente para este propósito. 
Por ejemplo, para el arreglo {1, -2, 6, -1, 3}, 
el programa debe calcular la suma máxima del subarreglo y mostrarla en la consola.
*/

public class MaxSubarraySumKadaneAlgorithm {
    
    // Método para encontrar la suma máxima de un subarreglo usando el algoritmo de Kadane
    public static void maxSubarraySum(int array[]) {
        // Inicializar la suma actual a 0 y el máximo encontrado a un valor muy bajo
        int currentSum = 0; 
        int max = Integer.MIN_VALUE; // Representa el menor entero posible

        // Recorrer todos los elementos del arreglo
        for(int i = 0; i < array.length; i++) {
            // Sumar el elemento actual a la suma actual
            currentSum += array[i];

            // Si la suma actual se vuelve negativa, reiniciarla a 0
            if(currentSum < 0) {
                currentSum = 0; // Reiniciar para considerar nuevos subarreglos
            }

            // Actualizar el máximo si la suma actual es mayor
            max = Math.max(currentSum, max);
        }

        // Imprimir la suma máxima encontrada
        System.out.println("Max Subarray Sum: " + max);
    }

    public static void main(String[] args) {
        // Crear un arreglo de enteros
        int array[] = {1, -2, 6, -1, 3};
        // Llamar al método para calcular la suma máxima del subarreglo
        maxSubarraySum(array);
    }
}

/*
 *   Output:
 *   Max Subarray Sum: 8
 */
