package controlador;

import Modelo.Instrumento;
import Modelo.ModeloTablaInstrumento;
import Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class controladorInstrumento extends MouseAdapter {
    private Ventana view;
    private ModeloTablaInstrumento modelo;

    public controladorInstrumento(Ventana view) {
        this.view = view;
        modelo= new ModeloTablaInstrumento();
        this.view.gettblinstrumento().setModel(modelo);
        this.view.getBtncargar().addMouseListener(this);
        this.view.getBtnagregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.view.getBtncargar()){
        modelo.cargardatos();
        this.view.gettblinstrumento().setModel(modelo);
        this.view.gettblinstrumento().updateUI();
        }
        if (e.getSource()==this.view.getBtnagregar()){
            Instrumento instrumento= new Instrumento();
            instrumento.setId(0);
            instrumento.setNombre(this.view.getTxtnombre().getText());
            instrumento.setClasificacion(this.view.getTxtclasificacion().getText());
            instrumento.setTipo(this.view.getTxtTipo().getText());
            instrumento.setFamoso(this.view.getTxtFamoso().getText());
            instrumento.setUrl(this.view.getTxtUrl().getText());
            if(modelo.agregarInstrumento(instrumento)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.gettblinstrumento().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. por favor revise su conexion","Erro",JOptionPane.ERROR_MESSAGE);

            }
            this.view.limpiar();
        }
    }

}
