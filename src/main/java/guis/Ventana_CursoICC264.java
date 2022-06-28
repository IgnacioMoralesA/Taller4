package guis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

public class Ventana_CursoICC264 extends Ventana {
    Ventana ventana;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JButton button;
    JComboBox<String> combo;

    public Ventana_CursoICC264(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        panelVentanas();
        comboBox();
        etiquetasVentana();
        camposTextoVentana();
        botonesVentana();
    }

    private void panelVentanas() {
        panel = new JPanel();
    }

    private void etiquetasVentana() {
        generarJLabel(label1,"Nombre: ",20,60,150,20);
        generarJLabel(label2,"Email: ",20,110,150,20);
    }

    private void camposTextoVentana() {
        textField1 = generarJTextField(200,60,240,20);
        this.add(textField1);
        textField2 = generarJTextField(200,110,240,20);
        this.add(textField2);
    }

    private void botonesVentana() {
        button = generarBoton("Nuevo Estudiante",250,150,150,20);
        this.add(button);
        accionBoton();
    }

    private void accionBoton() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_AgregarEstudianteICC264 ventana_agregarEstudianteICC264= new Ventana_AgregarEstudianteICC264("Agregar Estudiante ICC264",500,500);
                dispose();
            }
        });
    }

    public void Combo(){
        setLayout(null);
        combo=new JComboBox<String>();
        combo.setBounds(10,10,80,20);
        add(combo);
        combo.addItem("20081365-0");
    }
    private void items(ItemEvent e){
        if(e.getSource()==combo){
            String seleccionado=(String) combo.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    private void inic(){
       Combo();

    }

    private void comboBox() {
        textField3=new JTextField(20);
        combo = new JComboBox();
        combo.addItem("20081365-0");
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.setText(combo.getSelectedItem().toString());
            }
        });
    }

}
