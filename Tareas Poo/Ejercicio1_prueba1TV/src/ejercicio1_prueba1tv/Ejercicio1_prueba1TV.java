package ejercicio1_prueba1tv;

public class Ejercicio1_prueba1TV {

 
    public static void main(String[] args) {

        TV new1 = new TV();
        TV new2 = new TV();
        TV new3 = new TV();

        System.out.println("\n== TV 1 ==");

        new1.marca = "TCL";
        new1.pulgadas = 59;
        new1.volumen = 80;

        System.out.println("");

        System.out.println("La marca de la television es: " + new1.marca);
        System.out.println("Las pulgadas de la television son :" + new1.pulgadas);
        System.out.println("El volumen de la television es " + new1.volumen);

        System.out.println("");

        new1.encender();
        new1.subirVolumen();
        new1.bajarVolumen();
        new1.apagar();

        System.out.println("\n== TV 2 ==");

        new2.marca = "Samsung";
        new2.pulgadas = 70;
        new2.volumen = 50;

        System.out.println("");

        System.out.println("La marca de la television es: " + new2.marca);
        System.out.println("Las pulgadas de la television son :" + new2.pulgadas);
        System.out.println("El volumen de la television es " + new2.volumen);

        System.out.println("");

        new2.encender();
        new2.subirVolumen();
        new2.bajarVolumen();
        new2.apagar();

        System.out.println("\n== TV 3 ==");

        new3.marca = "Air nax";
        new3.pulgadas = 50;
        new3.volumen = 20;

        System.out.println("");

        System.out.println("La marca de la television es: " + new3.marca);
        System.out.println("Las pulgadas de la television son :" + new3.pulgadas);
        System.out.println("El volumen de la television es " + new3.volumen);

        System.out.println("");

        new3.encender();
        new3.subirVolumen();
        new3.bajarVolumen();
        new3.apagar();

    }

}
