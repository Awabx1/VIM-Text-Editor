/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author amnas
 */
public class KeyHandler implements KeyListener{
    textEditorGui gui;
   
    public KeyHandler(textEditorGui gui)
    {
        this.gui=gui;
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if((e.getKeyCode())==KeyEvent.VK_Y)
        {
           gui.copybuttonActionPerformed();
            
        }
        
        else if((e.getKeyCode())==KeyEvent.VK_I)
        {
           gui.newbuttonActionPerformed();
            
        }
        else if((e.getKeyCode())==KeyEvent.VK_E)
        {
          gui.openbuttonActionPerformed();
            
        }
        else if((e.getKeyCode())==KeyEvent.VK_Q)
        {
           gui.exitbutotnActionPerformed();   
        }
        
        else if((e.getKeyCode())==KeyEvent.VK_K)
        {
            gui.cutbuttonActionPerformed() ;
         }
        
        else if((e.getKeyCode())==KeyEvent.VK_P)
        {
            gui.pastebuttonActionPerformed();
        }
        else if((e.getKeyCode())==KeyEvent.VK_S)
        {
            gui.saveasbuttonActionPerformed();
        }
        else if((e.getKeyCode())==KeyEvent.VK_W)
        {
            gui.savebuttonActionPerformed();
        }
        else
        {
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
