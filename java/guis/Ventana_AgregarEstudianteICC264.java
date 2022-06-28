package guis;

import datos.DatosEstudiante;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_AgregarEstudianteICC264 extends Ventana {
    DatosEstudiante datosEstudiante;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    protected Ventana_AgregarEstudianteICC264(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        panelVentanas();
        etiquetasVentana();
        camposTextoVentana();
        botonesVentana();
    }

    private void panelVentanas() {
        panel = new JPanel();
    }

    private void etiquetasVentana() {
        generarJLabel(label1,"Rut: ",20,60,150,20);
        generarJLabel(label2,"Nombre: ",20,110,150,20);
        generarJLabel(label3,"Email: ",20,160,150,20);
    }

    private void camposTextoVentana() {
        textField1 = generarJTextField(200,60,240,20);
        this.add(textField1);
        textField2 = generarJTextField(200,110,240,20);
        this.add(textField2);
        textField3 = generarJTextField(200,160,150,20);
        this.add(textField3);
    }

    private void botonesVentana() {
        JButton button1 = generarBoton("Agregar",70,350,150,20);
        this.add(button1);
        JButton button2 = generarBoton("Cancelar",260,350,150,20);
        this.add(button2);
        accionBotones(button1,button2);
    }

    private void accionBotones(JButton button1, JButton button2) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datosEstudiante.añadirEstudiante(textField1.getText(),textField2.getText(),textField3.getText());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_CursoICC264 ventana_cursoICC264 = new Ventana_CursoICC264("Curso ICC264",500,250);
                dispose();
            }
        });
    }

}