/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PermitManager;

/**
 *
 * @author anish
 */


public class PermitManager {

    public Permit createPermit(String permitNumber, PermitCategory category) {
        return new Permit(permitNumber, category);
    }
}
