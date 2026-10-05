package ejercicio1_mostrarmatriz;

//🟢 Ejercicio 1 — Mostrar una matriz ⭐
//
//Crea una matriz de 3 × 3 con los siguientes valores:
//
//1 2 3
//4 5 6
//7 8 9
//
//Debes mostrar todos los elementos utilizando dos ciclos for.
//
//Restricciones
//Utiliza int[][].
//Utiliza dos for.
//No escribas manualmente cada System.out.println.
//Debes acceder a los elementos mediante índices.
public class Ejercicio1_MostrarMatriz {

    public static void main(String[] args) {
        int[][]matriz ={
        
            {1,3,8}, 
            {3,5,2},
            {9,7,4}
        
        
        };

        
        
       for(int i = 0; i < matriz.length; i++)
       {
           for(int j = 0; j < matriz[0].length; j++)
           {
               System.out.print(matriz[i][j]);
           }
         System.out.println("");
       }
      
    }

}
