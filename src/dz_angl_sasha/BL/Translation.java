/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz_angl_sasha.BL;
import dz_angl_sasha.BD.TranslateGateWay;
import dz_angl_sasha.BD.TranslationFinder;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class Translation {
    private Integer id;
    private String word;
    private  String translation;

    public static TranslateGateWay find (String word)
    {
        TranslateGateWay tr=null;
        if(!word.isEmpty()){
        try {
            tr = TranslationFinder.find(word);
        } catch (SQLException ex) {
            Logger.getLogger(Translation.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return tr;        
    }
}
