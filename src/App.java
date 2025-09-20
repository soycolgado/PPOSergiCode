public class App {
    public static void main(String[] args) throws Exception {

        // Persona persona1 = new Persona("Pedro", "Pascal", 48);
        // persona1.setNombre("Ricardo");
        // persona1.setApellido("Darin");

        // System.out.println(persona1.darNombreCompleto()+" tiene " + persona1.getEdad() +" años.");

        Animal animal = new Animal("Bestia", 200);
        Gato gato = new Gato("Manchita", 15);
        Perro perro = new Perro("Firulais", 3);

        System.out.println("El animal llamado " + animal.nombre + " hace:");
        System.out.println(animal.hacerSonido());

        System.out.println("El gato llamado " + gato.nombre + " hace:");
        System.out.println(gato.hacerSonido());

        System.out.println("El perro llamado " + perro.nombre + " hace:");
        System.out.println(perro.hacerSonido());

        System.out.println("El total de los animales creados es de: " + Animal.getCantAnimales());
        System.out.println("Yo atiendo a mis animalistos en " + Veterinaria.nombre);

    }
}
