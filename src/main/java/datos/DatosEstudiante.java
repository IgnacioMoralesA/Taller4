package datos;

import dominio.Estudiante;

import java.util.List;

public class DatosEstudiante {
    private List<Estudiante> estudiantes;

    public void añadirEstudiante(String rut, String nombre, String email){
        VerificarRut verificarRut = new VerificarRut();
        Estudiante estudiante = new Estudiante(rut,nombre,email);
        if(VerificarRut.verificarRut(Estudiante.getRut())){
            this.estudiantes.add(estudiante);
        }else{
            System.out.println("Rut no valido");
        }
    }
}
