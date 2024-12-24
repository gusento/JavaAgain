import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from java!");
        Estudiante estudiante1 = new Estudiante();
        estudiante1.name="Sebastian";
        estudiante1.lastName="Segura";
        estudiante1.course="Computer Science";
        estudiante1.code="20203368";
        //ingreso por teclado Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa algo: ");
        String nombre = scanner.nextLine();
        scanner.close();
        
        System.out.println("lo que ingrese fue: " + nombre);
    }
}