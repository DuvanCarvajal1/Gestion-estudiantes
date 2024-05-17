
public class Estudiante
{
    String nombre;
    String apellido;
    int edad;
    String codigo;
    
    public Estudiante(String nombre,String apellido, int edad, String codigo){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.codigo= codigo;
    }
    
    
    //get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCodigo() {
        return codigo;
    }
    
    //set
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
