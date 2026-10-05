//🟢 Ejercicio 1: Modelado Básico y Estado Inicial
//Consigna:
//Crea una clase llamada Mascota en un archivo Mascota.java.
//
//Debe contener los siguientes atributos: nombre (String), edad (int), tipo (String, ej. "Perro", "Gato") y tieneVacunas (boolean).
//
//En tu clase principal (con el método main), instancia un objeto Mascota sin asignarle ningún valor manualmente a sus atributos.
//
//Imprime por consola los valores iniciales de cada uno de sus atributos accediendo directamente a ellos.
//
//Luego, asígnales valores reales a cada atributo e imprímelos nuevamente para demostrar el cambio de estado.
//



//🟡 Ejercicio 2: Referencias e Identidad en Memoria
//Consigna:
//
//En la clase principal, crea un objeto de la clase Mascota asignado a una variable llamada mascota1 con el nombre "Bobi" y edad 3.
//
//Declara una segunda variable de tipo Mascota llamada mascota2 e igualala a mascota1 (Mascota mascota2 = mascota1;).
//
//Modifica la edad a 5 utilizando únicamente la variable mascota2.
//
//Imprime la edad de mascota1 en consola.
//
//Pregunta conceptual para responder junto a tu código: ¿Qué edad se imprimirá y por qué ocurrió ese comportamiento?
//




//🔴 Ejercicio 3: Métodos, Reutilización y Validaciones
//Consigna:
//Agrega comportamiento a la clase Mascota agregando los siguientes métodos (sin modificar atributos directamente desde el main):
//
//cumplirAnios(): Método que no retorna nada (void) y no recibe parámetros. Su función es incrementar la edad de la mascota en +1.
//
//esMayorDeEdad(): Método que retorna un boolean. Consideraremos que la mascota es mayor de edad si su edad es mayor o igual a 4 años.
//
//vacunar(): Método que cambia el atributo tieneVacunas a true.
//
//En el main, crea una mascota, hazla cumplir años hasta que sea mayor de edad (verificándolo con el método esMayorDeEdad()), e invoca sus métodos para observar cómo cambia el estado del objeto de forma controlada.


package ejercicio1.modelado.basico.y.estado.incial;

public class Ejercicio1ModeladoBasicoYEstadoIncial {

    public static void main(String[] args) {

        //Ejercicio 1
        Mascota exp = new Mascota();

        System.out.println(exp.nombre + " " + exp.edad + " " + exp.tipo + " " + exp.tieneVacunas);
        exp.nombre = "pepe";
        exp.edad = 10000;
        exp.tipo = "perro";
        exp.tieneVacunas = true;

        System.out.println(exp.nombre + " " + exp.edad + " " + exp.tipo + " " + exp.tieneVacunas);

        System.out.println("");

        //Ejercicio 2
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Bobi";
        mascota1.edad = 3;

        Mascota mascota2;
        mascota2 = mascota1;

        mascota2.edad = 5;
        System.out.println(mascota1.edad);

        System.out.println("");

        
        //Ejercicio 3
        Mascota exp2 = new Mascota();

        while (!exp2.esMayorDeEdad()) {
            
            exp2.cumplirAnios();
            System.out.println("La mascota cumplio anios nueva edad "+exp2.edad);
        }

    }

}
