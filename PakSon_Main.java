/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_modifier;

/**
 *
 * @author abdulkodir
 */
public class PakSon_Main {
    
    public static void main(String[] args) {
        PakSon_Modifier privateModifier = new PakSon_Modifier();
        PakSon_Modifier1 publicModifier = new PakSon_Modifier1();
        PakSon_Modifier2 noModifier = new PakSon_Modifier2();
        PakSon_Modifier3 protectedModifier = new PakSon_Modifier3();
        
        PakSon_Modifier2_child childNoModifier = new PakSon_Modifier2_child();
        
//        privateModifier.name?    -> not showing its attribute "name"
//        the others work just well
        
        publicModifier.changeName("Fathimah");
    
        privateModifier.setName("Aqira");
        System.out.println("Using private modifier: " + privateModifier.getName());
        
        noModifier.setName("Akira");
        System.out.println("Using no modifier: " + noModifier.getName());
        
        protectedModifier.setName("Aqilah");
        System.out.println("Using protected modifier: " + protectedModifier.getName());
        
    }
}
