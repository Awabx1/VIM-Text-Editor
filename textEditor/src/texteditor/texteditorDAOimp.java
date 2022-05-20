/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class texteditorDAOimp implements texteditorDAO {
    
     List<textEditorGui> txteditor;

   public texteditorDAOimp(){
      txteditor = new ArrayList<>();
         textEditorGui txtedit = null;
//      textEditorGui txtedit = new textEditorGui("Robert");
      txteditor.add(txtedit);		
   }

    @Override
    public List<textEditorGui> getAllfiles() {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        return txteditor;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public textEditorGui getfile(int id) {
      return  txteditor.get(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(textEditorGui txtedit) {
        
      try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(textEditorGui.class.getName()).log(Level.SEVERE, null, ex);
            }
String url ="jdbc:mysql://localhost:3306/file";

                                            try (Connection con = DriverManager.getConnection(url,"root", "12345678")) {
                                                
                                               
//Statement st=con.createStatement();
PreparedStatement ps=con.prepareStatement("insert into filesave values(?,?)");
    String fi;
//File f=new File(fileName);
FileReader fr = null;
                
                    fr = new FileReader(txtedit.filename);
                
double rd=Math.random();
int id=(int)rd;
ps.setInt(1,id);
ps.setCharacterStream(2,fr,(int)txtedit.filename.length());
int i=ps.executeUpdate();
System.out.println(i+" records affected");
        try{
            FileWriter fileWriter = new FileWriter(txtedit.filename);
            fileWriter.write(textArea.getText());
            setTitle(txtedit.filename);
            fileWriter.close();
            
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }       catch (SQLException ex) {
                Logger.getLogger(textEditorGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
             Logger.getLogger(texteditorDAOimp.class.getName()).log(Level.SEVERE, null, ex);
         }
    }             

    private void setTitle(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


