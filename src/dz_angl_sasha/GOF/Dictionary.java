/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz_angl_sasha.GOF;

import dz_angl_sasha.BD.*;
import dz_angl_sasha.*;


/**
 *
 * @author user
 */
public class Dictionary {
    private DataBase dataBase;
    private MainForm mainForm;
    private Registry registry;
    private SearchWord searchWord;

    public Dictionary() {
    this.dataBase = new DataBase();
    this.mainForm=new MainForm();
    this.registry=new Registry();
    this.searchWord= new SearchWord();
    }
    public  void startDictionary()
    {
        searchWord.setMain(mainForm);
        mainForm.setVisible(true);  
    }   
    
}
