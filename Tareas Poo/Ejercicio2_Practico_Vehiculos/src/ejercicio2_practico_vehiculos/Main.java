 
package ejercicio2_practico_vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("A123456", "Toyota", "Corolla");
        Vehiculo v2 = new Vehiculo("B987654", "Honda");
        Vehiculo v3 = new Vehiculo();

        System.out.println("=== VEHICULOS REGISTRADOS ===");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println();

        System.out.println("=== CALCULOS DE MANTENIMIENTO ===");
        
        double costo1 = v1.calcularMantenimiento(35000);
        System.out.println("Costo basico para " + v1.getMarca() + " (35,000 km): $" + costo1);

        double costo2 = v1.calcularMantenimiento(60000, "Mayor");
        System.out.println("Costo servicio Mayor para " + v1.getMarca() + " (60,000 km): $" + costo2);

        double costo3 = v1.calcularMantenimiento(60000, "Mayor", 20.0);
        System.out.println("Costo con $20 de descuento: $" + costo3);
    }
}