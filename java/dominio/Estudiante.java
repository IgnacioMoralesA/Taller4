package dominio;

public class Estudiante {

    private static String rut;
    private String nombre;
    private String email;

    public Estudiante(String rut,String nombre,String email){
        this.rut=rut;
        this.nombre=nombre;
        this.email=email;
    }

    public static String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return rut + ',' + nombre + ',' + email;
    }
}
