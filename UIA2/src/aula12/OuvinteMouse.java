/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OuvinteMouse implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicando com o botão" + me.getButton());
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Pressionando o botão"
                + me.getButton());
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberando o botão "
                + me.getButton());
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrando...");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Saindo...");
    }

}
