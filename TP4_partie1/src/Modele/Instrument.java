/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.util.ArrayList;

/**
 *
 * @author Feray Beaumont
 */
public class Instrument {
    
    public ArrayList<Fonds> aInstrument;
    
    public Instrument(){
        aInstrument = new ArrayList<>();
    }
    
    public Instrument(ArrayList<Fonds> tab){
        
        for(int i=0;i<tab.size();i++){
            aInstrument.add(tab.get(i)); 
        }
    }
    public void ajouter(Fonds f){
        aInstrument.add(f);
    }
}
