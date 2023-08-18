package ejercicio_Encapsulamiento;

public class Cuenta {
    public String Titular;
    public double cantidad;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
     public void ingresar(double cantidad){
        this.cantidad = this.cantidad + cantidad;
        if(cantidad > 0){
            System.out.println("La cantidad ingresada es: " + cantidad);
        }
         System.out.println("Cantidad actual es: " + this.cantidad);
     }

     public void retirar(double cantidad){
         this.cantidad = this.cantidad - cantidad;
         if(this.cantidad<0){
             this.cantidad =0;

         }
         System.out.println("La cantidad actual es: " + this.cantidad);
     }


}
