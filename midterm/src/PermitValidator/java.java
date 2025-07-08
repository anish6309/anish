/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PermitValidator;

/**
 *
 * @author anish
 */


public class PermitValidator {

    
    public static boolean isValid(String permitNumber) {
        return permitNumber.matches("\\d{5}");
    }
}
