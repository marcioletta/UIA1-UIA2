/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 *
 * @author 1714290044
 */
public class OuvinteWheel implements MouseWheelListener{

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("Você girou o wheel "+ e.getWheelRotation()+" vez(es)" );    }
    
}
