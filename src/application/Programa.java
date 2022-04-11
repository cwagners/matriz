package application;

import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Integer m, n, x, i, j;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        x = sc.nextInt();

        for (i = 0; i < m; i++) {
            System.out.printf("\n");
            for (j = 0; j < n; j++) {

                if (matriz[i][j] == x) {
                    System.out.printf("Position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }


                }
            }


        }
    }
}
