/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz_angl_sasha.BD;

import java.util.Map;
import java.util.TreeMap;


/**
 * Класс для сохранения всех уже обработанных наборов.
 * @author user
 */
public class Registry {
    private static Map wordToTranslateGateWay;

    public Registry() {
        wordToTranslateGateWay=new TreeMap<String,TranslateGateWay>();
         }
    public static TranslateGateWay getTranslate(String word)
    {
        return (TranslateGateWay) wordToTranslateGateWay.get(word);
    }
       public static void addTranslate(TranslateGateWay tr)
    {
        wordToTranslateGateWay.put(tr.getWord(), tr);
    }
    
    
}
