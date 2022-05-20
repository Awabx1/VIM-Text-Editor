/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import java.util.List;
/**
 *
 * @author PC
 */
public interface texteditorDAO {
   public List<textEditorGui> getAllfiles();
   public textEditorGui getfile(int id);
   public void save(textEditorGui txtedit);
   
}
