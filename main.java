package konstruktor;


import konstruktor.PakSon_User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdulkodir
 */
public class main {
    public static void main(String[] args) {
        PakSon_User user = new PakSon_User("Aqilah", "1234567");
        
        System.out.println(user.username);
        System.out.println(user.password);
    }
}
