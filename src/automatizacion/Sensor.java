package automatizacion;

public class Sensor {
    private String nombre;
    private String tipo;
    private double lectura;

    public void setNombre(String nombre) {
        if(nombre!= null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }

    public void setTipo(String tipo) {
        if(tipo!= null && !tipo.isBlank()) {
            this.tipo = tipo;
        }
    }

    public void setLectura(double lectura) {
            this.lectura = lectura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getLectura() {
        return lectura;
    }
}
