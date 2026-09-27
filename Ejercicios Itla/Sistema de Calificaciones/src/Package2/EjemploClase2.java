
package Package2;

public class EjemploClase2 {
    public static void main(String[] args) {
           int nota = 85;
           String calificacion;
           
     
           if(nota >= 90)      
           {
               calificacion = "A - Excelente";
           }
           else if( nota >= 80)
           {
               calificacion = "B - Muy Bueno";
           }
           else if (nota >= 70)
           {
                calificacion = "C - Bueno";

           }
           else if(nota >= 60)
           {
                 calificacion = "D - Suficiente";
           }
           else
           {
                 calificacion = "F - Reprobado";

           }
    
           System.out.println("Nota "+ nota);
           System.out.println("Calificacion "+calificacion);
    
    }
}
