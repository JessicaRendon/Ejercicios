/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscando;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class Buscando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
       int n;
       boolean esta=false;
        int[] N=new int[5]; 
        System.out.println("Ingrese 5 numeros"); 
        for(int i=0; i<5;i++){
            System.out.println("Ingrese el numero "+(i+1));
            N[i]=s.nextInt();
        }
        System.out.println("Ingrese un numero adicional");
        n=s.nextInt();
        for(int i=0;i<5;i++){
            if(N[i]==n){
               esta=true;
            }
          
        }
            if(esta==true){
                System.out.println("El numero "+n+" aparece en los primeros 5 numeros"); 
            }
            else
            {
                System.out.println("El numero "+n+" no aparece en los primeros 5 numeros"); 
            }

    }
    
}
