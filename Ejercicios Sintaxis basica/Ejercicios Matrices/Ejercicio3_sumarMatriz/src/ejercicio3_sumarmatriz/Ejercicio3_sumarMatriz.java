package ejercicio3_sumarmatriz;
//Crea una matriz:
//
//5  8  2
//4  1  7
//9  3  6
//
//Calcula la suma de todos los elementos.
//
//Resultado esperado:
//
//45
//Pista conceptual
//
//Necesitas una variable acumuladora.
//
//Pregúntate:
//
//¿En qué momento debo agregar cada elemento a la suma?

public class Ejercicio3_sumarMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
            {5, 8, 2},
            {4, 1, 7},
            {9, 3, 6}

        };

        int sumaMatriz = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }

        System.out.println("La suma de todos los elementos de la matriz es: "+sumaMatriz);
        
        
    }

}
