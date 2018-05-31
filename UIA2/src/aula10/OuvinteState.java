/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class OuvinteState implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent we) {
        System.out.println("A janela passou de " + we.getOldState() + " para " + we.getNewState());
    }

}
