
package ejercicio3_practico_empresadetelefonia;


public class Plan {
    private final String nombrePlan;
    private final int minutosIncluidos;
    private final double datosGB;
    private final double precioMensual;

    public Plan(String nombrePlan, int minutosIncluidos, double datosGB, double precioMensual) {
        this.nombrePlan = nombrePlan;
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }

    public Plan(String nombrePlan, double precioMensual) {
        this.nombrePlan = nombrePlan;
        this.minutosIncluidos = 200;
        this.datosGB = 5.0;
        this.precioMensual = precioMensual;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public double getDatosGB() {
        return datosGB;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }
}