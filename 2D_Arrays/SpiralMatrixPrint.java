/**
Escribe un programa en Java que imprima los elementos de una matriz de enteros en orden espiral. 
La matriz debe ser cuadrada y el orden de impresión debe comenzar desde la esquina superior izquierda, 
avanzando hacia la derecha, hacia abajo, hacia la izquierda y hacia arriba, 
y repitiendo este patrón hasta que se hayan impreso todos los elementos. 
*/

public class SpiralMatrixPrint {
    // Método para imprimir la matriz  en orden espiral
    public static void spiralMatrixPrint(int matrix[][]) {
        // Inicializar los índices de las filas y columnas
        int startRow = 0; // Fila inicial
        int startCol = 0; // Columna inicial
        int endRow = matrix.length - 1; // Fila final
        int endCol = matrix[0].length - 1; // Columna final
        
        // Mientras las filas y columnas iniciales sean menores que las finales
        while (startRow <= endRow && startCol <= endCol) {
            // Imprimir la fila superior de izquierda a derecha
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            // Imprimir la columna derecha de arriba hacia abajo
            for (int i = startRow + 1; i <= endRow; i++) { // startRow + 1 para evitar repetir el último elemento
                System.out.print(matrix[i][endCol] + " ");
            }
            // Imprimir la fila inferior de derecha a izquierda, si hay filas restantes
            if (startRow < endRow) { // Verificar que haya filas restantes
                for (int i = endCol - 1; i >= startCol; i--) { // endCol - 1 para evitar repetir el último elemento
                    System.out.print(matrix[endRow][i] + " ");
                }
            }
            //   Imprimir la columna izquierda de abajo hacia arriba, si hay columnas restantes
            if (startCol < endCol) { // Verificar que haya columnas restantes
                for (int i = endRow - 1; i > startRow; i--) { // endRow - 1 para evitar repetir el primer elemento
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Mover los límites de la matriz hacia adentro
            startRow++; // Aumentar la fila inicial
            startCol++; // Aumentar la columna inicial
            endRow--;   // Disminuir la fila final
            endCol--;   // Disminuir la columna final
        }
    }

    public static void main(String[] args) {
        // Crear la matriz de enteros
        int matrix[][] = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16} };
        // Llamar al método para imprimir la matriz en orden espiral
        spiralMatrixPrint(matrix);
    }
}

/*
 *    Output: 
 *    1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */
