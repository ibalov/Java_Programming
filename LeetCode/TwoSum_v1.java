import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        
        System.out.println("Choose method");
        System.out.println("1 - BruteForce (bucle for)");
        System.out.println("2 - Two pass Has Map");
        System.out.println("3 - One pass HashTable");
        option = sc.nextInt();
        
        switch (option) {
            case 1:
                int[] array;
                int size, target;
                
                // Capturar el tamaño del array
                System.out.print("Size array: ");
                size = sc.nextInt();
                
                array = new int[size];
                
                // Rellenar el array
                System.out.print("Enter " + size + " numbers:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Number " + i + ": ");
                    array[i] = sc.nextInt();
                }

                // Capturar el target
                System.out.print("Enter target: ");
                target = sc.nextInt();
                
                // Llamar al método twoSum
                twoSum(array, target);
                break;
                

            default:
                throw new AssertionError();
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    // Imprime la salida y la explicación
                    System.out.println("Output: [" + i + "," + j + "]");
                    System.out.println("Explanation: Because nums[" + i + "] + nums[" + j + "] == " + target + ", we return [" + i + ", " + j + "].");
                    return new int[]{i, j};                    
                }
            }
        }
        System.out.println("No solution!");
        return new int[]{};//
    }
}
