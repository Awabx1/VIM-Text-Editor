/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication10;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import texteditor.textEditorGui;
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
        switch (e.getKeyCode()) {
            case KeyEvent.VK_Y:
                gui.copybuttonActionPerformed();
                break;
            case KeyEvent.VK_I:
                gui.newbuttonActionPerformed();
                break;
            case KeyEvent.VK_E:
                gui.openbuttonActionPerformed();
                break;
            case KeyEvent.VK_Q:
                gui.exitbutotnActionPerformed();
                break;
            case KeyEvent.VK_K:
                gui.cutbuttonActionPerformed() ;
                break;
            case KeyEvent.VK_P:
                gui.pastebuttonActionPerformed();
                break;
            case KeyEvent.VK_S:
                gui.saveasbuttonActionPerformed();
                break;
            case KeyEvent.VK_W:
                gui.savebuttonActionPerformed();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
