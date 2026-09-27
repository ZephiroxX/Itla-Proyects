
package sistema.de.dias.laborales;

public class SistemaDeDiasLaborales {

  
    public static void main(String[] args) {
    
    String dia = "Lunes";
    String tipoJornada;
    int horasTrabajo;
    
    
    switch(dia)
    {
        case "Lunes":
        case "Martes":
        case "Miercoles":
        case "Jueves":
        case "Viernes":
            tipoJornada = "Dia laboral";
            horasTrabajo = 8;
            break;
        case "Sabado":
            tipoJornada = "Medio Dia";
            horasTrabajo = 4;
            break;
        case "Domingo":
            tipoJornada = "Descanso";
            horasTrabajo = 0;
            break;
        default:
            tipoJornada = "Dia no Valido";
            horasTrabajo = 0;
    }



        System.out.println("Dia "+dia);
        System.out.println("Tipo "+tipoJornada);             System.out.println("Horas de trabajo "+horasTrabajo);


    
    }

}
