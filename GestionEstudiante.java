import java.util.ArrayList;
import java.util.Scanner;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void buscarEstudiante(String numeroEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroEstudiante().equals(numeroEstudiante)) {
                System.out.println(estudiante);
                return;
            }
        }
        System.out.println("Estudiante no encontrado con el número de estudiante: " + numeroEstudiante);
    }

    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante por Número de Estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            if (opcion == 1) {
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Ingrese edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea
                System.out.print("Ingrese número de estudiante: ");
                String numeroEstudiante = scanner.nextLine();
                Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, edad, numeroEstudiante);
                gestion.agregarEstudiante(nuevoEstudiante);
                System.out.println("Estudiante agregado exitosamente.");
            } else if (opcion == 2) {
                gestion.listarEstudiantes();
            } else if (opcion == 3) {
                System.out.print("Ingrese número de estudiante: ");
                String numeroBuscado = scanner.nextLine();
                gestion.buscarEstudiante(numeroBuscado);
            } else if (opcion == 4) {
                continuar = false;
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opción no válida. Por favor intente nuevamente.");
            }
        }

        scanner.close();
    }
}
