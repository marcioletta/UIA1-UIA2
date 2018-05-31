/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 1714290044
 */
public class OuvinteJanela implements WindowListener {

    public void windowActivated(WindowEvent e) {
        System.out.println("Janela ativa");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Janela fechada");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Fechando a janela");
        int opcao = JOptionPane.showConfirmDialog(null,"deseja fechar a janela?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION)
        {
            ((JFrame)e.getSource()).dispose();
        }
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Janela inativa");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Janela restaurada");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Janela minimizada");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Janela aberta");
    }
}
