public class Animal {
    String nombre;
    int edad;
    static int contadorAnimales = 0;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.contadorAnimales++;
    }

    public String hacerSonido(){
        return "Hacer sonido generico";
    }

    public static int getCantAnimales(){
        return contadorAnimales;
    }

    
}
