/**
 * Lab          : OS Lab 4
 * Name         : Pho Sophors
 * Class        : ITE-M3
 * Generation   : 7th
 * Date         : 8 december 2022
 */

import java.util.Scanner;

public class SingleThread {
    public static void main(String[] args){
        createMenu();
    }

    /**
     * createMenu method to generate menu that allows user to choose
     */
    public static void createMenu() {
        int choose;
        do {
            System.out.println("\n1. Create Matrix");
            System.out.println("2. Auto Generate Matrix");
            System.out.println("3. Multiply Matrix");
            System.out.println("4. Exit");
            System.out.print("=> Please choose one : ");

            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();

            switch (choose) {
                // 1. Create Matrix
                case 1 -> Matrix.createMatrix();


                // 2. Auto Generate Matrix
                case 2 -> {
                    Matrix.multiply();
                    System.out.println("Matrix create success..!!!");
                }

                // 3. Multiply Matrix
                case 3 -> Matrix.display();
            }
        } while (choose != 4);
    }
}

