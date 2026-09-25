package ejercicio.pkg4.itla;

public class Ejercicio4Itla {

    public static void main(String[] args) {

        int edad = 17;

        String mensaje1;

        if (edad >= 18) {
            mensaje1 = "Mayor de edad";
        } else {
            mensaje1 = "Menor de edad";
        }

        String mensaje2 = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println(mensaje2);

        int precio = 100;

        double precioFinal = (precio > 50) ? precio * 0.9 : precio;
        System.out.println("Precio final: $"+precioFinal );
        
    }

}
