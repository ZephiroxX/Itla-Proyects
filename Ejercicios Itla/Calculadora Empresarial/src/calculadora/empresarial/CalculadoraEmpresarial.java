
package calculadora.empresarial;

public class CalculadoraEmpresarial {

    // Metodo para calcular salario neto
    public static double calcularSalarioNeto(double salarioBruto, double porcentajeImpuesto) {
        double impuesto = salarioBruto * (porcentajeImpuesto / 100);
        double salarioNeto = salarioBruto - impuesto;
        return salarioNeto;
    }

    // Metodo para calcular bono anual
    public static double calcularBonoAnual(double salarioMensual, int mesesTrabajados) {
        if (mesesTrabajados >= 12) {
            return salarioMensual * 2; // 2 meses de bono
        } else if (mesesTrabajados >= 6) {
            return salarioMensual; // 1 mes de bono
        } else {
            return 0;
        }
    }

    // Metodo para mostrar desglose de nómina
    public static void mostrarDesglose(String nombre, double salarioBruto, double impuesto, double salarioNeto, double bono) {
        System.out.println("\n=== DESGLOSE DE NOMINA ===");
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Impuestos: -$" + impuesto);
        System.out.println("Salario neto: $" + salarioNeto);
        System.out.println("Bono anual: $" + bono);
        System.out.println("TOTAL ANUAL: $" + (salarioNeto * 12 + bono));
    }

    // Metodo principal
    public static void main(String[] args) {
        String empleado = "Carlos Mendoza";
        double salarioBruto = 3500.00;
        double porcentajeImpuesto = 15.0;
        int mesesTrabajados = 12;

        // Llamada a metodos
        double salarioNeto = calcularSalarioNeto(salarioBruto, porcentajeImpuesto);
        double bono = calcularBonoAnual(salarioBruto, mesesTrabajados);
        double impuesto = salarioBruto - salarioNeto;

        mostrarDesglose(empleado, salarioBruto, impuesto, salarioNeto, bono);
    }
}