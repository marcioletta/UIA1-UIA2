/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaBorderLayout 
{
    public static void main(String[] args) 
    {
        
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.yellow));

        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.RED));

        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JFrame janela = new JFrame();
        
        janela.add(painel1,BorderLayout.NORTH);
        janela.add(painel2,BorderLayout.SOUTH);
        janela.add(painel3,BorderLayout.WEST);
        janela.add(painel4,BorderLayout.EAST);
        janela.add(painel5,BorderLayout.CENTER);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
