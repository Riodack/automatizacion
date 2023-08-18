package org.example.Interface;

public class Coche implements Vehiculo{

    private int velocidadActual;
    @Override
    public void acelerar(int velocidad) {
        velocidadActual = velocidadActual + velocidad;
        //velocidadActual += velocidad;
        System.out.println("El coche ha acelerado a: " + velocidadActual + " Km/h.");
    }

    @Override
    public void frenar() {
        velocidadActual = velocidadActual - 10;
        //velocidadActual -= 10;
        System.out.println("El coche ha frenado a: " + velocidadActual + " Km/h.");

    }
}
