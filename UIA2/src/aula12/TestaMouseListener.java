/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import javax.swing.JFrame;

/**
 *
 * @author 1714290044
 */
public class TestaMouseListener {
    public static void main(String[] args) {
        OuvinteMouse ouvinte = new OuvinteMouse();
        JFrame janela = new JFrame();
        janela.addMouseListener(ouvinte);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
