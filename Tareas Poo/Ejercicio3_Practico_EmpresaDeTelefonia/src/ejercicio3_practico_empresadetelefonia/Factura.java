package ejercicio3_practico_empresadetelefonia;

public class Factura {

    private final Cliente cliente;
    private final int minutosConsumidos;
    private final double datosConsumidosGB;

    private static final double COSTO_MINUTO_EXTRA = 0.15;
    private static final double COSTO_GB_EXTRA = 5.00;

    public Factura(Cliente cliente, int minutosConsumidos, double datosConsumidosGB) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidosGB = datosConsumidosGB;
    }

    public double calcularExcesoMinutos() {
        int limite = cliente.getPlan().getMinutosIncluidos();
        if (minutosConsumidos > limite) {
            return (minutosConsumidos - limite) * COSTO_MINUTO_EXTRA;
        }
        return 0.0;
    }

    public double calcularExcesoDatos() {
        double limite = cliente.getPlan().getDatosGB();
        if (datosConsumidosGB > limite) {
            return (datosConsumidosGB - limite) * COSTO_GB_EXTRA;
        }
        return 0.0;
    }

    public double calcularMontoTotal() {
        double base = cliente.getPlan().getPrecioMensual();
        return base + calcularExcesoMinutos() + calcularExcesoDatos();
    }

    public void generarFactura() {
        Plan planActual = cliente.getPlan();

        System.out.println("========================================");
        System.out.println("         FACTURA DE TELEFONIA           ");
        System.out.println("========================================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getNumeroTelefono());
        System.out.println("Plan contratado: " + planActual.getNombrePlan());
        System.out.println("----------------------------------------");
        System.out.println("Consumo de minutos: " + minutosConsumidos + " / " + planActual.getMinutosIncluidos() + " min");
        System.out.println("Consumo de datos: " + datosConsumidosGB + " / " + planActual.getDatosGB() + " GB");
        System.out.println("----------------------------------------");
        System.out.println("Cargo base del plan: $" + planActual.getPrecioMensual());
        System.out.println("Cargo extra por minutos: $" + calcularExcesoMinutos());
        System.out.println("Cargo extra por datos: $" + calcularExcesoDatos());
        System.out.println("----------------------------------------");
        System.out.println("MONTO TOTAL A PAGAR: $" + calcularMontoTotal());
        System.out.println("========================================");
    }
}

