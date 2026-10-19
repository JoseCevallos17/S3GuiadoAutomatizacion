package automatizacion;

public class MainSensor {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        sensor1.setNombre("Sensor Temperatura");
        sensor1.setTipo("Temperatura");
        sensor1.setLectura(17.5);

        System.out.println("Nombre: " + sensor1.getNombre());
        System.out.println("Tipo: " + sensor1.getTipo());
        System.out.println("Lectura: " + sensor1.getLectura());

        sensor1.setLectura(-5.6);
        System.out.println("Lectura: " + sensor1.getLectura());
    
    }
}
