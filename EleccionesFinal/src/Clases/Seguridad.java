
package Clases;

/**
 *
 * @author Leonel
 */

import java.util.Scanner;

public class Seguridad {
    private static String operador = "admin";
    private static String contra = "123";

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (autenticacion(usuario, contrasena)) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
    
    private static boolean autenticacion(String usuario, String contrasena) {
        return verificar(usuario, operador) && verificar(contrasena, contra);
    }
    
    private static boolean verificar(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        for (int i = 0; i < str1.length(); i++) {
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true; 
    }        
}


