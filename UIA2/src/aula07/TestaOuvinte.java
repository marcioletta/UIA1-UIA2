/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import javax.swing.JFrame;

public class TestaOuvinte 
{
    public static void main(String[] args) 
    {
    Ouvinte ouvinte = new Ouvinte();
        JFrame janela = new JFrame();
        janela.addKeyListener(ouvinte);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocation(500,300);
        janela.setVisible(true);
    }
}
