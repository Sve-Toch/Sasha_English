/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz_angl_sasha.GOF;

import dz_angl_sasha.BD.TranslateGateWay;
import dz_angl_sasha.BD.TranslationFinder;
import dz_angl_sasha.BL.*;
import dz_angl_sasha.BL.Translation;

/**
 *
 * @author user
 */
public class SearchWord {
private static MainForm mf;

    public  void setMain(MainForm mf)
    {
         this.mf = mf;
    }

       public static void searchWord(String word)
            {
        try {
            TranslateGateWay tr=Translation.find(word);
            mf.putTrans(tr.getTranslation());
        } catch (Exception ex) {
           mf.putTrans("Ошибка поиска");
        }}
    
}
