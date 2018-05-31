/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import javax.swing.JFrame;

public class TestaMouseMotionListener {
    public static void main(String[] args) {
        OuvinteWheel ouvinteW = new OuvinteWheel();
        OuvinteMotion ouvinte = new OuvinteMotion();
        JFrame janela = new JFrame();
        
        janela.addMouseWheelListener(ouvinteW);
        janela.addMouseMotionListener(ouvinte);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
