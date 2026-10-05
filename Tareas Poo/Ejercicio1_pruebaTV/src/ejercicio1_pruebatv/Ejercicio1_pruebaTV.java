package ejercicio1_pruebatv;

public class Ejercicio1_pruebaTV {

    public static void main(String[] args) {

        TV new1 = new TV();
        TV new2 = new TV();
        TV new3 = new TV();

        new1.marca = "TCL";
        new1.pulgadas = 59;
        new1.volumen = 80;

        new1.encender();
        new1.subirVolumen();
        new1.bajarVolumen();
        new1.apagar();

    }

}
