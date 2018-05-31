/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaJDialog 
{
    public static void main(String[] args) 
    {
        JFrame janela = new JFrame();
        janela.setSize(1000,700);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setVisible(true);
        JDialog dialogo = new JDialog(janela,true);
        //dialogo.setModal(true);
        dialogo.setSize(300,300);
        dialogo.setResizable(false);
        dialogo.setLocationRelativeTo(janela);
        dialogo.setVisible(true);
        
    }
    
}
