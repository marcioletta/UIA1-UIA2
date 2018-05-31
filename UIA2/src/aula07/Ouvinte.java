/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 1714290044
 */
public class Ouvinte implements KeyListener
{
    public void keyTyped(KeyEvent e)
    {
        JOptionPane.showMessageDialog(null,"Tratando o evento...");
    }
    public void keyPressed(KeyEvent e){ }
    public void keyReleased(KeyEvent e){ }
}
