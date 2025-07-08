/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PermitApp;

/**
 *
 * @author anish
 */

import java.util.Scanner;

public class PermitApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PermitManager manager = new PermitManager();
        String permitNumber;

        // Re-query user until valid permit number entered
        while (true) {
            System.out.print("Enter permit number (5 digits): ");
            permitNumber = sc.nextLine();

            if (PermitValidator.isValid(permitNumber)) {
                break;
            } else {
                System.out.println("Invalid permit number format. Please try again.");
            }
        }

        // Display category options
        System.out.println("Select a category:");
        PermitCategory[] categories = PermitCategory.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        // User selects category
        int choice = sc.nextInt();
        PermitCategory selectedCategory = categories[choice - 1];

        // Create permit and display success message
        Permit permit = manager.createPermit(permitNumber, selectedCategory);
        System.out.println("Permit created successfully:");
        System.out.println("Permit Number: " + permit.getPermitNumber());
        System.out.println("Category: " + permit.getCategory());
    }
}

