package Ejercicio_Practico;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = scan.next();
        Alumno alumno = new Alumno(nombre);
        System.out.println("Ingrese calificaciones");
        for (int i = 0; i<alumno.getCalificaciones();i++){
            int calificacion = scan.nextInt();
            alumno.ingresarCalificacion(i,calificacion);
        }





        alumno.ingresarCalificacion(calificacion);
    }
}
