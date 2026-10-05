
package ejercicio3_practico_empresadetelefonia;


public class Main {
    public static void main(String[] args) {
        Plan planBasico = new Plan("Plan Conectados", 150, 3.0, 25.0);
        Plan planPro = new Plan("Plan Ultra", 29.99); 

        Cliente c1 = new Cliente("Wilkin Matos", "809-555-0192", planBasico);

        Factura f1 = new Factura(c1, 180, 4.5); 
        f1.generarFactura();
    }
}