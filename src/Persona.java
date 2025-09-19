public class Persona {
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludado){
        if(this.edad > 40) return "Buenos dias, querido "+saludado;
        return "Hola, como estas " + saludado + "?";
    }
}
