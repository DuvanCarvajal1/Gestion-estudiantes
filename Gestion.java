import java.util.*;
import java.lang.String;

public class Gestion
{
    private List<Estudiante> estudiantes = new ArrayList<Estudiante>();
    
    public Gestion(){
        
    }
    
    public List<Estudiante>getEstudiante(){
        return estudiantes;
    }
    
    public void setEstudiante(List<Estudiante>estudiantes){
        this.estudiantes= estudiantes;
    }
    
    public void addEstudiante(Estudiante estudiantes){
        this.estudiantes.add(estudiantes);
    }
    
    public void listarEstudiante(){
        for(Estudiante estudiante : estudiantes){
            System.out.println("Nombre: "+ estudiante.getNombre()+ "n/Apellido: "+ estudiante.getApellido()+ "n/Edad: "+ estudiante.getNombre()+ "n/Codigo: "+ estudiante.getCodigo());
        }
    }
    
    public Estudiante buscarEstudiante( String codigo){
        for (Estudiante estudiante : estudiantes){
            if(estudiante.getCodigo() == codigo){
                return estudiante;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
    
    Gestion gestion = new Gestion(); 
    
    System.out.println("Estudiantes registrados; ");
    gestion.listarEstudiante();
    
    System.out.println("Estudiante Buscado es: ");
    gestion.buscarEstudiante(estudiante);
    
    
    
    
    }
}

