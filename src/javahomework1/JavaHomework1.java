/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework1;

import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class JavaHomework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Напишите температуру в градусах Цельсия:");
        double temperatureC=scanner.nextDouble();
        System.out.format("Температура в градусах Цельсия::%.2f%n", temperatureC);
        final double temperatureF=(double) temperatureC*9/5+32;
        System.out.format("Температура в градусах Фаренгейта:%.2f%n", temperatureF);
    }
    
}
