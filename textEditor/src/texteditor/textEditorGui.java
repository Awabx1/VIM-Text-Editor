package texteditor;

import java.awt.AWTException;
import java.awt.FileDialog;
import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class textEditorGui extends javax.swing.JFrame {
String filename;
String fileaddress;
Clipboard clipboard = getToolkit().getSystemClipboard();
    public textEditorGui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        newbutton = new javax.swing.JMenuItem();
        openbutton = new javax.swing.JMenuItem();
        savebutton = new javax.swing.JMenuItem();
        saveasbutton = new javax.swing.JMenuItem();
        exitbutotn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        cutbutton = new javax.swing.JMenuItem();
        copybutton = new javax.swing.JMenuItem();
        pastebutton = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        jMenu3.setText("File");

        newbutton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        newbutton.setText("New");
        newbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbuttonActionPerformed(evt);
            }
        });
        jMenu3.add(newbutton);

        openbutton.setText("Open");
        openbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbuttonActionPerformed(evt);
            }
        });
        jMenu3.add(openbutton);

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        jMenu3.add(savebutton);

        saveasbutton.setText("Save As");
        saveasbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasbuttonActionPerformed(evt);
            }
        });
        jMenu3.add(saveasbutton);

        exitbutotn.setText("Exit");
        exitbutotn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbutotnActionPerformed(evt);
            }
        });
        jMenu3.add(exitbutotn);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");

        cutbutton.setText("Cut");
        cutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutbuttonActionPerformed(evt);
            }
        });
        jMenu4.add(cutbutton);

        copybutton.setText("Copy");
        copybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copybuttonActionPerformed(evt);
            }
        });
        jMenu4.add(copybutton);

        pastebutton.setText("Paste");
        pastebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastebuttonActionPerformed(evt);
            }
        });
        jMenu4.add(pastebutton);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copybuttonActionPerformed
        
         Robot robot;
    try {
        robot = new Robot();
        robot.mouseMove(WIDTH, WIDTH);
    } catch (AWTException ex) {
        Logger.getLogger(textEditorGui.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        String copytext = textArea.getSelectedText();
        StringSelection copyselection = new StringSelection(copytext);
        clipboard.setContents(copyselection, copyselection);
    }//GEN-LAST:event_copybuttonActionPerformed

    private void newbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbuttonActionPerformed
        textArea.setText("");
        setTitle(filename);
        
    }//GEN-LAST:event_newbuttonActionPerformed

    private void openbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbuttonActionPerformed
       FileDialog fileDialog = new FileDialog(textEditorGui.this, "Open File", FileDialog.LOAD);
       fileDialog.setVisible(true);
       
       if(fileDialog.getFile()!=null){
           filename = fileDialog.getDirectory() + fileDialog.getFile();
           setTitle(filename);
       }
       
      try {
          BufferedReader reader= new BufferedReader(new FileReader(filename));
          StringBuilder sb =new StringBuilder();
          
          String line=null;
          
          while((line = reader.readLine()) != null) {
              sb.append(line+ "\n");
              textArea.setText(sb.toString());
          }
          reader.close();
          
          
      } catch (IOException e) {
          System.out.println("File Not Found");
      }
       
    }//GEN-LAST:event_openbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        FileDialog fileDialog = new FileDialog(textEditorGui.this, "save file", FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null) {
        filename=fileDialog.getDirectory() + fileDialog.getFile();
        setTitle(filename);
        
        try{
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(textArea.getText());
            setTitle(filename);
            fileWriter.close();
            
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void exitbutotnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbutotnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbutotnActionPerformed

    private void cutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutbuttonActionPerformed
        String cutstring = textArea.getSelectedText();
        StringSelection cutselection=new StringSelection(cutstring);
        clipboard.setContents(cutselection, cutselection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutbuttonActionPerformed

    private void pastebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastebuttonActionPerformed
        try{
            Transferable pastetext = clipboard.getContents(textEditorGui.this);
            String sel = (String) pastetext.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(sel,textArea.getSelectionStart(), textArea.getSelectionEnd());
        } catch (Exception e) {
            System.out.println("Did not Work");
        }
    }//GEN-LAST:event_pastebuttonActionPerformed

    private void saveasbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasbuttonActionPerformed
        FileDialog fd = new FileDialog (textEditorGui.this, "Save", FileDialog.SAVE);
        fd.setVisible(true);
        
        if(fd.getFile()!=null)
        {
            filename=fd.getDirectory() + fd.getFile();
            setTitle(filename);
        }
        
        try{
            FileWriter fw=new FileWriter(filename);
            fw.write(textArea.getText());
            fw.close();
        }catch(Exception e){
            System.out.println("File Not Found");
        }
        
    }//GEN-LAST:event_saveasbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copybutton;
    private javax.swing.JMenuItem cutbutton;
    private javax.swing.JMenuItem exitbutotn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newbutton;
    private javax.swing.JMenuItem openbutton;
    private javax.swing.JMenuItem pastebutton;
    private javax.swing.JMenuItem saveasbutton;
    private javax.swing.JMenuItem savebutton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
