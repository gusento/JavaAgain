public class Estudiante {
    public String name;
    public String lastName;
    public String code;
    public String course;
    public String craest;
    public Boolean exchange;
    public String entryYear;

    public void saludaAmigo(String nombre){
        System.out.println("Soy "+this.name+" y saludo a: "+nombre);
    }

    public void ciclosRestantes(){
        System.out.println("");
    }
    public void cambiarCarrera(String newCourse){
        course = newCourse;
    }

}

