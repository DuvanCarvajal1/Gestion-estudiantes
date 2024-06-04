public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String numeroEstudiante;

    public Estudiante(String nombre, String apellido, int edad, String numeroEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroEstudiante() {
        return numeroEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", numeroEstudiante='" + numeroEstudiante + '\'' +
                '}';
    }
}

