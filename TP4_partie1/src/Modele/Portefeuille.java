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
public class Portefeuille extends Exception
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
    public Fonds rechercherFonds(String cle){
        
        boolean x = hFonds.containsKey(cle);
        
        Fonds f = null;
        
        try
        {
            if(x==false)
            {
                
                throw new Exception ("FondsInexistant");
            }
            else
            {
                f = hFonds.get(cle);
            }
        }
        catch(Exception e)
        {
            System.out.println("Fond inexistant");
           
        } 
        return f;
    }
    
    public Instrument rechercherInstrument(String cle){
        
        boolean x = hInstrument.containsKey(cle);
        
        Instrument I =null;
        
        try
        {
            if(x==false)
            {
                
                throw new Exception ("InstrumentInexistant");
            }
            else
            {
                I = hInstrument.get(cle);
            }
        }
        catch(Exception e)
        {
            System.out.println("Instrument inexistant");
        } 
        return I ;
    }
 
    public void ajouterFond(String x, double a)
    {
        try
        {
            if(hFonds.get(x)==null)
            {
                System.out.println("Fond existant");
            }
            else
            {
                throw new Exception("FondsExistant");
            }
        }
        catch(Exception e)
        {
            Fonds f = new Fonds(a);
            hFonds.put(x,f);
        }
        
    }
    
    public void ajouterInstrument(String x, Fonds f)
    {
        Instrument i = hInstrument.get(x);
        i.ajouter(f);
    }
}
