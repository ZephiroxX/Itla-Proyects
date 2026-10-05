package ejercicio4_encontrarmayor_matriz;

import java.util.Scanner;

//🟡 Ejercicio 4 — Encontrar el mayor ⭐⭐⭐
//
//Crea una matriz de 4 × 4.
//
//Solicita los valores al usuario.
//
//Después encuentra y muestra:
//
//el número mayor;
//su fila;
//su columna.
//
//Ejemplo:
//
//El número mayor es: 95
//Fila: 2
//Columna: 3
//Restricción
//
//No puedes utilizar:
//
//Math.max()
//
//Debes realizar la comparación tú mismo.
public class Ejercicio4_encontrarMayor_Matriz {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        Scanner input = new Scanner(System.in);
        int nMayor = 0;
        int fila = 0;
        int columna = 0;
        
        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz [" + i + "] [" + j + "]");
                matriz[i][j] = input.nextInt();
                
                
                
                if(matriz[i][j] == 0)
                {
                    nMayor = 0;
                }
                
                if (matriz[i][j] > nMayor) {
                    nMayor = matriz[i][j];
                
                fila = i;
                columna = j;
                }
                
            }
        }

        
        System.out.println("El numero mayor "+nMayor);
        System.out.println("La fila es: "+fila);
        System.out.println("La columna es: "+columna);
        
    }

}
