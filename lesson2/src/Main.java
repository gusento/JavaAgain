public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Curso c = new Curso();
        p.setCurso(c);
        p.getCurso().setNombre("Redes definidas por software");
        System.out.println("El curso es que lleva la persona es: "+ p.getCurso().getNombre());
    }
}