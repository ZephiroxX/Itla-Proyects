
package ejercicio3_practico_empresadetelefonia;


public class Cliente {
    private final String nombre;
    private final String numeroTelefono;
    private Plan plan;

    public Cliente(String nombre, String numeroTelefono, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.plan = plan;
    }

    public Cliente(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.plan = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}