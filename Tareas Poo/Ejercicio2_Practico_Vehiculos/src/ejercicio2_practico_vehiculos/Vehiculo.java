
package ejercicio2_practico_vehiculos;


public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = "No especificado";
    }

    public Vehiculo() {
        this.placa = "S/N";
        this.marca = "Generico";
        this.modelo = "Estandar";
    }


    public double calcularMantenimiento(int kilometraje) {
        double costoBase = 50.0;
        if (kilometraje > 50000) {
            costoBase += 30.0;
        }
        return costoBase;
    }

    public double calcularMantenimiento(int kilometraje, String tipoServicio) {
        double costoBase = calcularMantenimiento(kilometraje);

        if (tipoServicio.equalsIgnoreCase("General")) {
            costoBase += 75.0;
        } else if (tipoServicio.equalsIgnoreCase("Mayor")) {
            costoBase += 150.0;
        }

        return costoBase;
    }

    public double calcularMantenimiento(int kilometraje, String tipoServicio, double descuento) {
        double costoTotal = calcularMantenimiento(kilometraje, tipoServicio);
        return costoTotal - descuento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo [Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo + "]";
    }
}