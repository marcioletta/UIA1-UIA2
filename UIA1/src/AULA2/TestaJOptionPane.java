/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA2;

import javax.swing.JOptionPane;

public class TestaJOptionPane 
{
    public static void main(String[] args) 
    {
    String valor = JOptionPane.showInputDialog(null,"informe um valor");
    JOptionPane.showMessageDialog(null,"o valor informado foi: " + valor);
    int opcao = JOptionPane.showConfirmDialog(null,"deseja continuar?","Confirmação",
            JOptionPane.YES_NO_OPTION );
    JOptionPane.showMessageDialog(null,"a opção escolhida foi: " + opcao);
    }
    
}
