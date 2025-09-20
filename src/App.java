public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Pedro", "Pascal", 48);
        persona1.setNombre("Ricardo");
        persona1.setApellido("Darin");

        System.out.println(persona1.darNombreCompleto()+" tiene " + persona1.getEdad() +" años.");

    }
}
