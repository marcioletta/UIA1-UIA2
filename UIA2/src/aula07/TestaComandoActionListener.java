/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1714290044
 */
public class TestaComandoActionListener 
{
    public static void main(String[] args) 
    {
    ComandoActionListener ouvinte = new ComandoActionListener();
        JButton botao = new JButton("Ok");
        botao.addActionListener(ouvinte);
        botao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Outro ouvinte");
        }
    });
        
        JTextField campo = new JTextField("Pressione enter");
        campo.addActionListener(ouvinte);
        
        JFrame janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.add(botao);
        janela.add(campo);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300,200);
        janela.setVisible(true);
    
    }
    
}
