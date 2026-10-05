package ejercicio2_controldeestado;


//Sin terminar. Leer de nuevo el enunciado
public class Telefono {

    String modelo;
    int nivelBateria;
    boolean estaEncendido;

    public void encender() {

        if (nivelBateria > 0) {
            estaEncendido = true;
        }
    }

    public void usarAplicacion() {
        if()
        
        
        if (estaEncendido) {
            nivelBateria -= 25;
        }
    }

    public boolean necesitaCarga() {
        return nivelBateria <= 20;
    }


}
