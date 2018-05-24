/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristobal
 */
public class PanelBotonesPrueba extends JPanel implements FocusListener {

    private JTextField tfPregunta;

    public PanelBotonesPrueba() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        GridLayout distribucion = new GridLayout(4, 2);
        this.setLayout(distribucion);
        BorderLayout borde = new BorderLayout();
        this.tfPregunta = new JTextField("");
        this.add(this.tfPregunta);
    }

    public JTextField getTfPregunta() {
        return tfPregunta;
    }

    public void setTfPregunta(JTextField tfPregunta) {
        this.tfPregunta = tfPregunta;
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.tfPregunta) {

        }
    }
}
