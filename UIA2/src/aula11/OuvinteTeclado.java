/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OuvinteTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Pressionando a tecla " + e.getKeyChar());
        if(e.getKeyChar()< KeyEvent.VK_0 || e.getKeyChar()>'9')
        {e.setKeyChar('\0');
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Liberando a tecla " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Digitando a tecla " + e.getKeyCode());
    }

}
