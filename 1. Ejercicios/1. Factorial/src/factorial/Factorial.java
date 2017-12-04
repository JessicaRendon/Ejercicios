/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      Scanner s = new Scanner(System.in);
        int N,Fac=0;
        System.out.println("Ingrese un numero entre 1 y 7 para calcular factorial");
        N=s.nextInt();
        if(N>0&&N<=7){
        for(int i=0;i<=N;i++){
            if(i==0){
            Fac=1; 
            }else{
                Fac=Fac*i;
            }
            }
            System.out.println("El factorial de "+N+" es igual a "+Fac);
        }else{
            System.out.println("El numero debe estar entre 1 y 7");
        }    
    }
    
}

