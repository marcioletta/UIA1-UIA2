/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author 1714290044
 */
public class TestaKeyListener {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        OuvinteTeclado ouvinte = new OuvinteTeclado();
        JTextField campo = new JTextField();
        
        campo.addKeyListener(ouvinte);
        janela.add(campo,BorderLayout.NORTH);
        janela.addKeyListener(ouvinte);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
