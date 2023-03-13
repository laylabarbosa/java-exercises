/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1_200539617;

/**
 *
 * @author layladesouzabarbosa
 */

public class HouseRunner {
    public static void main(String[] args) {
        House house1= new House(2002,  "12 Queens Quay, Toronto, Ontario", 2500000.00);
        House house2= new House(5000000.00, 2019, "2111 Yonge Street, Toronto, Ontario");
        House house3= new House("55 Dundas Street, Hamilton, Ontario", 150000, 1940);

        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf("                            Ontario House Market                                  %n");
        System.out.printf("----------------------------------------------------------------------------------%n");
        
        System.out.printf(" %-40s | %-18s |   %13s %n", "ADRESS", "CONSTRUCTION YEAR", "PRICE");
        System.out.printf(" %-40s | %-18d | CAD$ %10.2f %n", house1.adress, 
                house1.getConstructionYear(), house1.getSellingPrice());
        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf(" %-40s | %-18d | CAD$ %10.2f %n", house2.adress, 
                house2.getConstructionYear(), house2.getSellingPrice());
        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf(" %-40s | %-18d | CAD$ %10.2f %n", house3.adress, 
                house3.getConstructionYear(), house3.getSellingPrice());
        System.out.printf("----------------------------------------------------------------------------------%n");
    }
}
