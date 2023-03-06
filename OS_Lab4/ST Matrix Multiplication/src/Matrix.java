import java.util.Scanner;

public class Matrix {

    static int row1, col1, row2, col2;
    static Scanner input = new Scanner(System.in);

    // Declaring 2D array
    static int[][] a, b, mul;



    /**
     * createMatrix method to create matrix N rows M columns
     */
    public static void createMatrix() {
        // Input dimensions of First Matrix: A
        System.out.print("\nEnter first number of row: ");
        row1 = input.nextInt();
        System.out.print("Enter first number of columns: ");
        col1 = input.nextInt();

        // Input dimensions of second matrix: B
        System.out.print("\nEnter second number of row: ");
        row2 = input.nextInt();
        System.out.print("Enter second number of columns: ");
        col2 = input.nextInt();
    }

    /**
     * Print 2D array method ========================================================
     */
    private static void printArr2D(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
    /** +++++++++++++++++++++++++++ end Print 2D array method +++++++++++++++++++++++++++ */


    /**
     * multiply method to perform matrix multiplication between two matrices
     */
    public static void multiply() {
        // Creating a 2D array
        a = new int[row1][col1];
        b = new int[row2][col2];
        mul = new int[row1][col2];

        // Input the values of matrices A
        System.out.println("\nEnter values for matrix A : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++){
                a[i][j] = input.nextInt();
            }
        }
        // Input the values of matrices B
        System.out.println("\nEnter values for matrix B : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = input.nextInt();
            }
        }

        /* Print value of matrix A and matrix B */
        System.out.println("\n+============= Matrix A ============+");
        printArr2D(a);
        System.out.println("+============= Matrix B ============+");
        printArr2D(b);

    }
    /** +++++++++++++++++++++++++++ end multiply method +++++++++++++++++++++++++++ */

    /**
     * Display method to display the matrix ===========================================
     */
    public static void display() {
        mul = new int[row1][col2];

        if (row1 == 0) {
            System.out.println("\n++++++ Matrix not found..! +++++\nPlease choose 1 to create matrix.");
        } else {
            System.out.println("\nMatrix A multiplication B (A x B ) is : \n");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    // Initialize the element C(i,j) with zero
                    mul[i][j] = 0;

                    // Dot product calculation
                    for (int k = 0; k < col1; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(mul[i][j] + "\t"); // print result matrix a x b
                }
                System.out.println();
            }
        }

    }
    /** +++++++++++++++++++++++++++ end display method +++++++++++++++++++++++++++ */

}