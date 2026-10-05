//🟢 Ejercicio 3.B: Control de Estado y Lógica de Batería
//Consigna:
//
//En tu proyecto, crea una clase llamada Telefono (en su propio archivo Telefono.java).
//
//Atributos que debe tener:
//
//modelo (String)
//
//nivelBateria (int)
//
//estaEncendido (boolean)
//
//Agrega los siguientes métodos a la clase Telefono:
//
//encender(): Método sin retorno que cambia estaEncendido a true solo si nivelBateria es mayor a 0.
//
//usarAplicacion(): Método sin retorno. Si el teléfono está encendido, disminuye el nivelBateria en 25 unidades. (Ojo: la batería no debería bajar de 0).
//
//necesitaCarga(): Método que retorna un boolean. Devuelve true si la batería está en 20 o menos.
//
//El reto en la clase principal (main):
//
//Instancia un Telefono.
//
//Asígnale un nivel de batería inicial de 100 y enciéndelo.
//
//Mediante un bucle, haz que el teléfono use aplicaciones repetidamente mientras NO necesite carga.
//
//Muestra por consola cómo va bajando la batería en cada ciclo.
//
//Diseña la clase Telefono y la clase principal. Cuando lo tengas listo, publica tu código y dime qué razonamiento usaste.
package ejercicio2_controldeestado;

public class Ejercicio2_controlDeEstado {

    public static void main(String[] args) {
        Telefono iphone = new Telefono();

        iphone.nivelBateria = 100;
        iphone.encender();
        
        while (!iphone.necesitaCarga()) {
            iphone.usarAplicacion();
            

            System.out.println("La bateria de el telefono es: " + iphone.nivelBateria);

            System.out.println("\nLa bateria necesita carga? "+iphone.necesitaCarga());

        }

    }

}
