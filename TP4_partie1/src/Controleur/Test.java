/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;
import Modele.*;

import java.util.*;

/**
 *
 * @author antoi
 */
public class Test
{
    public static void main(String[] args)
    {
        Portefeuille p = new Portefeuille();
        System.out.println("Veuillez saisir une clé.");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);
        
        p.rechercherFonds(str);
    }
}
