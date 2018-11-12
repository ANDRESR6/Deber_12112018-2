/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB1-PC
 */
public class aplication {
    
    public static void main(String[] args) {
        factorial();
        pares();
        multiplos3();
        figo();
    }
    public static void factorial() {
        long fac=1;
        int num=9;
        for(int i=num;i>0;i--) {
            fac=fac*i;
        }
        System.out.println("El factorial de "+num+" es: "+fac);
        JOptionPane.showConfirmDialog(null,"El factorial de "+num+" es: "+fac);
    }
    public static void pares() {
        int lim=20;
        int t=0;
        System.out.println("Los números pares son:");
        for (int j=1;j<=lim;j++){
            t=j%2;
            if(t==0){               
                System.out.print("- "+j);
                JOptionPane.showConfirmDialog(null,"Es un número par el número "+j);
            }
        }
        System.out.println("");
    }
    public static void multiplos3() {
        int lim=12;
        int t=0;
        System.out.println("Los números multiplos de 3 son:");
        for (int j=1;j<=lim;j++){
            t=j%3;
            if(t==0){               
                System.out.print("- "+j);
                JOptionPane.showConfirmDialog(null,"Es multiplo de 3 el número "+j);
            }
        }
        System.out.println("");
    }
    public static void figo(){
    int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = 100;

        System.out.println(n1);
        System.out.println(n2);

        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
        }
    }
}