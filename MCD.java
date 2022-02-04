/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ramlloto
 */
public class MCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //validar que los números sean positivos: con if-fin o while-repetir petición
        int num1 = 0;
        int num2 = 0;
        do {
            System.out.println("Introduzca un numero");
            num1 = sc.nextInt();

            System.out.println("Introduzca otro numero");
            num2 = sc.nextInt();
            
            if(num1 <= 0 || num2 <= 0) System.out.println("Error. Los numeros deben ser positivos");

        } while (num1 <= 0 || num2 <= 0);

        //los numeros ya son positivos
        //veo cual es el mayor
        int mayor = 0;
        int menor = 0;
        int resto = 0;

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        //aplico algoritmo de Euclides
        int aux = 0;
        do {
            resto = mayor % menor;
            if (resto != 0) {
                aux = menor;
                menor = resto;
                mayor = menor;
            }
        } while (resto != 0);

        System.out.println("MCD = " + menor);
        

    }

}
