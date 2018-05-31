/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA2;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJPanel {

    public static void main(String[] args) {
        JPanel painel = new JPanel();        
        painel.setBorder(BorderFactory.createLineBorder(Color.RED,20));
        
        JPanel outro = new JPanel();
        outro.setBorder(BorderFactory.createLineBorder(Color.yellow,20));
        
        painel.add(outro);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
