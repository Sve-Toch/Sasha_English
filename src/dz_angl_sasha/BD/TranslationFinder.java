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
public class TranslationFinder {
    public static TranslateGateWay  find(String word) throws SQLException
    {
        TranslateGateWay result =(TranslateGateWay) Registry.getTranslate(word);
        if (result!=null){
        return result;
        }
        else {
            Connection conn=  DataBase.getInstance();
         Statement st =conn.createStatement();      
         String statement = "Select id,word,translation from Dictionary.Translate where word='"+word+"'"; 
        System.out.println(statement);
        ResultSet rs=st.executeQuery(statement);  
        rs.next();
        result = TranslateGateWay.load(rs);
        return result;
        }
    }
}
