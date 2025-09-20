public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludado){
        if(this.edad > 40) return "Buenos dias, querido "+saludado;
        return "Hola, como estas " + saludado + "?";
    }
}
