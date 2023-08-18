package Ejercicio_Practico;

import java.lang.reflect.Array;

public class Alumno {
    //Atributos
    public String nombre;
    public double[] calificaciones = new double[5];
    //Constructor
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    //Metodos get
    public String getNombre() {
        return nombre;
    }
    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void ingresarCalificacion(int index, int calificacion){
        for(int i=0; i< calificaciones.length;i++){
            calificaciones[i]=calificacion;
            System.out.println("La calificacion es:");
        }
        System.out.println();
    }
    public double calcularPromedio(){
        double promedio;
        double suma=0;

        for(int i = 0; i<calificaciones.length;i++){
            suma = suma + calificaciones[i];

        }
        promedio = suma/calificaciones.length;
        return promedio;
    }
}
