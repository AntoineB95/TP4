/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.util.*;

/**
 *
 * @author Feray Beaumont
 */
public class Portefeuille 
{
    
    public HashMap<String, Fonds> hFonds;
    
    public HashMap<String, Instrument> hInstrument;
    
    public Portefeuille()
    {
        hFonds=new HashMap<>();
        hInstrument=new HashMap<>();
    }
    
    public Portefeuille(String x, Fonds f)
    {
        hFonds=new HashMap<>();
        hFonds.put(x,f);
    }
    
    public Portefeuille(String x, Instrument i)
    {
        hInstrument=new HashMap<>();
        hInstrument.put(x,i);
    }
}
