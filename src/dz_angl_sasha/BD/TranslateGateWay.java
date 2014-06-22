/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz_angl_sasha.BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class TranslateGateWay {
    //поля таблицы
    private Integer id;
    private String word;
    private  String translation;

    private TranslateGateWay(Integer idn, String wordn, String transn) {
        id=idn;
        word=wordn;
        translation=transn;
//To change body of generated methods, choose Tools | Templates.
    }
    // set
    public void setId(Integer id)
    {this.id=id;}
    public void setWord(String word)
    {this.word=word;}
     public void setTranslation(String translation)
    {this.translation=translation;}
     //get
     public Integer getId( )
    {return id;}
    public String getWord()
    {return word;}
     public String getTranslation()
    {return translation;}     
     public static TranslateGateWay load(ResultSet rs) throws SQLException
     {
          String wordn = new String(rs.getString(2));
          TranslateGateWay result = (TranslateGateWay) Registry.getTranslate(wordn);
          if ( result != null ) return result;
          Integer idn=rs.getInt(1);      
          String transn = rs.getString(3);    
          result = new TranslateGateWay(idn, wordn, transn);
          Registry.addTranslate(result);
          return result;        
     }
    public void insert() throws SQLException
    {
         Connection conn=  DataBase.getInstance();
         Statement st =conn.createStatement();     
         String statement = "Insert INTO Dictionary.Translate (id,word,translation)  VALUES ('"+id+"','"+word+"','"+translation+")";
        System.out.println(statement);
        int rs=st.executeUpdate(statement);      
    }
    public Integer update() throws SQLException
     {
         Connection conn=  DataBase.getInstance();
         Statement st =conn.createStatement();  
       //  setId(findNextDatebaseId());
         String statement = "Update Dictionary.Translate set word="+word+",translation="+translation+" where id="+id; 
        System.out.println(statement);
        int rs=st.executeUpdate(statement);  
        return getId();
     }    
  
    
    
    
}
