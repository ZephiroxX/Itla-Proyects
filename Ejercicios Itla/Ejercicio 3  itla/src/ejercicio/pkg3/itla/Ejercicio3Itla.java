
package ejercicio.pkg3.itla;

public class Ejercicio3Itla {
 
    public static void main(String[] args) {
    double totalCompra = 1500.00;
    String tipoCliente = "Vip";
    double descuento = 0;
    
    if(totalCompra >= 2000){
        descuento = 0.20;
    }
    
    else if(totalCompra >= 1000){
        descuento = 0.15;
    }
    else if (totalCompra >= 500){
        descuento = 0.10;
    }
    
    
    
    if(tipoCliente.equals("Vip")){
        descuento +=  0.05;
    }
    else if (tipoCliente.equals("Premium")){
        descuento +=  0.03;
    }
            
            
   double montoDescuento = totalCompra * descuento;
   double totalFinal = totalCompra -  montoDescuento;
   
    
        System.out.println("=== DETALLE DE COMPRA ===");
        System.out.println("Subtotal $"+totalCompra);
        System.out.println("Tipo de Cliente "+tipoCliente);
        System.out.println("Descuento Aplicado "+ (descuento * 100) +"%" );
        System.out.println("Monto descontado "+montoDescuento);
        System.out.println("TOTAL A PAGAR $"+ totalFinal);
    
    
    
    
    }

}
