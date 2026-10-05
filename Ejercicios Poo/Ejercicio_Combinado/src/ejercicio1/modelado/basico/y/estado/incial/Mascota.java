package ejercicio1.modelado.basico.y.estado.incial;

public class Mascota {

    String nombre;
    int edad;
    String tipo;
    boolean tieneVacunas;

    public void cumplirAnios(int edad) {
        edad++;

    }

    public void cumplirAnios() {
        edad++;
    }
    
    public boolean esMayorDeEdad(){
        return edad >=4;
    }
    
    public void vacunar(){
    if(esMayorDeEdad())
    {
        tieneVacunas = true;
    }
    
    }

}
