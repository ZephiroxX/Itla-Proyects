
package ejercicio9_condicional;

import java.util.Scanner;

//🟣 Ejercicio 8 — Contraseña y usuario ⭐⭐⭐⭐
//
//Crea un programa en Java que solicite:
//
//Un nombre de usuario.
//Una contraseña.
//
//El programa debe comprobar si ambos datos son correctos.
//
//Usa como datos válidos:
//
//Usuario: admin
//Contraseña: 1234
//
//Si ambos son correctos:
public class Ejercicio9_Condicional {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    String usuarioCorrecto = "miguel";
    int contrasenaCorrecta = 29101987;
        
    
    System.out.println("Ingrese su usuario");
    String usuarioIntroducido = input.nextLine();
    
    System.out.println("Ingrese su contrasena");
    int contrasenaIntroducida = input.nextInt();
    
    if(usuarioIntroducido.equals(usuarioCorrecto) && contrasenaIntroducida == contrasenaCorrecta )
    {
        System.out.println("Acceso concedido");
    }
    else
    {
        System.out.println("Usuario o contraseña incorrectos");
    }
    
    }

}
