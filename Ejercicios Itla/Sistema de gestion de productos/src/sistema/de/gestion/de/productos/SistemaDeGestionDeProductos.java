
package sistema.de.gestion.de.productos;

public class SistemaDeGestionDeProductos {

    // Método para calcular precio con IVA
    public static double calcularPrecioConIVA(double precioBase, double porcentajeIVA) {
        return precioBase * (1 + porcentajeIVA / 100);
    }

    // Método para aplicar descuento
    public static double aplicarDescuento(double precio, double descuento) {
        return precio * (1 - descuento / 100);
    }

    // Método para verificar disponibilidad
    public static boolean verificarDisponibilidad(int stock, int cantidad) {
        return stock >= cantidad;
    }

    // Método para calcular total de venta
    public static double calcularTotalVenta(double precioUnitario, int cantidad, double descuento) {
        double subtotal = precioUnitario * cantidad;
        return aplicarDescuento(subtotal, descuento);
    }

    // Metodo para generar código de producto
    public static String generarCodigoProducto(String categoria, int id) {
        return categoria.substring(0, 3).toUpperCase() + String.format("%05d", id);
    }

    public static void main(String[] args) {
        // Datos del producto
        String producto = "Laptop";
        String categoria = "Electronica";
        int id = 123;
        double precio = 800.00;
        int stock = 15;
        int cantidadVenta = 3;
        double descuento = 10.0; // 10%
        double iva = 16.0; // 16%

        // Procesamiento
        String codigo = generarCodigoProducto(categoria, id);
        double precioConIVA = calcularPrecioConIVA(precio, iva);
        boolean disponible = verificarDisponibilidad(stock, cantidadVenta);

        System.out.println("=== INFORMACIÓN DEL PRODUCTO ===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Producto: " + producto);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con IVA: $" + precioConIVA);
        System.out.println("Stock disponible: " + stock);

        if (disponible) {
            double total = calcularTotalVenta(precioConIVA, cantidadVenta, descuento);
            System.out.println("\n=== VENTA ===");
            System.out.println("Cantidad: " + cantidadVenta);
            System.out.println("Descuento: " + descuento + "%");
            System.out.println("TOTAL: $" + total);
        } else {
            System.out.println("\nStock insuficiente para la venta.");
        }
    }
}