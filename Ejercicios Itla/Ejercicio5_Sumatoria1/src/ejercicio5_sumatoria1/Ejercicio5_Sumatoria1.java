
package ejercicio5_sumatoria1;

public class Ejercicio5_Sumatoria1 {

  
    public static void main(String[] args) {
        int num = 0;
        int sumatoria = 0;
        
        do
        {
            sumatoria += num;
             num++;
        }while(num <= 50);
        
        
        System.out.println("La sumatoria de los numeros es "+sumatoria);
        
    }
    
    
}
