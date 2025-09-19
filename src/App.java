public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona();
        persona1.nombre = "Nestor";
        persona1.apellido = "Bardel";
        persona1.edad = 39;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ingenieria en sistemas";
        carrera1.duracion= 6;
        carrera1.estaEnCurso = false;

        persona1.carrera = carrera1;

        Persona persona2 = new Persona();
        persona2.nombre = "Pitu";
        persona2.apellido = "Alonso";
        persona2.edad = 45;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Arquitectura";
        carrera2.duracion = 5;
        carrera2.estaEnCurso = false;

        persona2.carrera = carrera2;

        String saludado1 = "Gisela Perez";
        String saludado2 = "Master of puppets";

        System.out.println(persona1.darNombreCompleto()+" tiene " + persona1.edad +" años.");
        System.out.println(persona2.darNombreCompleto()+" tiene " + persona2.edad +" años.");
        System.out.println(persona1.enviarSaludo(saludado2));
        System.out.println(persona2.enviarSaludo(saludado1));

    }
}
