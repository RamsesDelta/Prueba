package ejercico1;

public class Mejoras {

    private String nombre;
    private int cantidad;


    public Mejoras(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    void imprimeFactura() {
        imprimeEncabezado();
        //imprime los detalles
        System.out.println ("Nombre:        " +  nombre );
        System.out.println ("Cantidad       " + getCantidad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void imprimeEncabezado(){
        System.out.println("Imprime encabezado");
    }

}
