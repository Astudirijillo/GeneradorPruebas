/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristobal
 */
public class VtnCrearPrueba extends JFrame {

    public PanelBotonesPrueba pnlBtn;
    public PanelInsertarPruebas pnlInsrtPrueba;

    public VtnCrearPrueba() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Generador de Pruebas");
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(400, 500);

        this.pnlBtn = new PanelBotonesPrueba();
        this.pnlInsrtPrueba = new PanelInsertarPruebas();
        
        this.add(this.pnlBtn, BorderLayout.NORTH);
        this.add(this.pnlInsrtPrueba, BorderLayout.CENTER);
    }

}
