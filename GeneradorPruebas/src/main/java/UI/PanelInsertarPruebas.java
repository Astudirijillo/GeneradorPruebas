/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Cristobal
 */
public class PanelInsertarPruebas extends JPanel {

    public JButton btnLimpiar;
    public JButton btnCalcular;

    public PanelInsertarPruebas() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        Border bordejpanel = new TitledBorder(new LineBorder(Color.BLACK), "Ingresar Pruebas");
        this.setBorder(bordejpanel);

        this.btnLimpiar = new JButton("Limpiar");
        this.btnLimpiar.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.add(this.btnLimpiar);
        this.btnLimpiar = new JButton("Calcular");
        this.btnLimpiar.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.add(this.btnLimpiar);
    }
}
