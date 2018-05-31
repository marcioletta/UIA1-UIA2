/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import javax.swing.JFrame;

/**
 *
 * @author 1714290044
 */
public class TestaJFrame {

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Minha Janela");
        janela.setSize(300, 100);
        janela.setLocationRelativeTo(null);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
