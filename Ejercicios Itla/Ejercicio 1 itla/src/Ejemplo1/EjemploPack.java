package Ejemplo1;

public class EjemploPack {
       public static void main(String[] args) {
           System.out.println("Hello world");
           
          String nombre = "Maria";
          int edad = 28;
          double salario = 45000.50;
          boolean esEmpleado = true;
          
          double salarioAnual = salario* 12;
          int edadProxima = edad +1;
          
           System.out.println("==INFORMACION DEL EMPLEADO==");
           System.out.println("Nombre"+ nombre);
           System.out.println("Edad actual "+edad);
           System.out.println("Edad proximo ano: "+edadProxima);
           System.out.println("Salario mensual: $"+salario);
           System.out.println("Salario anual $"+salarioAnual);
           System.out.println("Es empleado activo? "+esEmpleado);
          
    }
            
    
}
