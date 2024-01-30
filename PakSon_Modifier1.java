/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_modifier;

/**
 *
 * @author abdulkodir
 */
public class PakSon_Modifier1 {
    PakSon_Modifier privateModif = new PakSon_Modifier();
    
    public String name;
    
    public void changeName(String newName) {
        this.name = newName;
        System.out.println("This is new name (public): "+newName); 
    }
}
