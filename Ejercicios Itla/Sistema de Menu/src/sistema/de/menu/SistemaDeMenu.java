package sistema.de.menu;

public class SistemaDeMenu {

    public static void main(String[] args) {
        int opcion = 3;
        String plato = "";
        double precio;

        switch (opcion) {
            case 1:
                plato = "Hamburguesa Clasica";
                precio = 8.99;
                break;

            case 2:
                plato = "Pizza Margherita";
                precio = 12.50;
                break;

            case 3:
                plato = "Ensalada Cesar";
                precio = 7.99;
                break;

            case 4:
                plato = "Pasta Carbonara";
                precio = 11.00;
                break;

            case 5:
                plato = "Sushi Roll (8 piezas)";
                precio = 15.99;
                break;

            default:
                System.out.println("Opcion no Valida");
                precio = 0.0;
                break;

        }

        System.out.println("=== PEDIDO ===");
        System.out.println("Plato Seleccionado: "+ plato);
        System.out.println("Precio $"+precio);
        
        
    }

}
