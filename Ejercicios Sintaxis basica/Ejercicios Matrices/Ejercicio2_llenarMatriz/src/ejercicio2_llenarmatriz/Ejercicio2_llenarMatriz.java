package ejercicio2_llenarmatriz;
//🟢 Ejercicio 2 — Llenar una matriz ⭐⭐
//

import java.util.Scanner;

//Crea una matriz de 3 × 3.
//
//Solicita al usuario los valores de cada posición utilizando Scanner.
//
//Por ejemplo:
//
//Introduce el valor de [0][0]:
//Introduce el valor de [0][1]:
//...
//
//Al terminar, muestra la matriz completa.
//
//Objetivo
//
//Practicar:
//
//Scanner
//int[][]
//for
//matriz[i][j]
public class Ejercicio2_llenarMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el valor de la posiciones ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz [" + i + "] [" + j + "]");
                matriz[i][j] = input.nextInt();
            }
        }
        
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            
            }
            System.out.println("");
        }
    }

}
