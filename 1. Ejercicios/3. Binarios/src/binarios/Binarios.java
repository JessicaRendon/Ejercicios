/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class Binarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int   NB=0,ND=0,N=0,dig=0;
  String cadena;
  Scanner s=new Scanner(System.in);
  
        System.out.println("Ingrese un numero binario maximo de 8 digitos");
        NB=s.nextInt();
        cadena=NB+"";
        if(cadena.length()<=8){
            while(NB!=0){
              dig=NB%10;
              ND=ND+dig*(int)Math.pow(2,N);
              NB=NB/10;
              N++;
            }
            System.out.println("El numero decimal es "+ND);
        }
        else
        {
            System.out.println("Excedio el limite de digitos");
        }

    }
    
}
