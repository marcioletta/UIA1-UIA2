/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import javax.swing.JFrame;

public class TestaWindowListener 
{
    public static void main(String[] args) {
        OuvinteJanela ouvinte = new OuvinteJanela();
        OuvinteFocus ouvinteF = new OuvinteFocus();
        OuvinteState ouvinteS = new OuvinteState();
        
        JFrame janela = new JFrame();
        janela.addWindowListener(ouvinte);
        janela.addWindowFocusListener(ouvinteF);
        janela.addWindowStateListener(ouvinteS);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setVisible(true);
    }
}
