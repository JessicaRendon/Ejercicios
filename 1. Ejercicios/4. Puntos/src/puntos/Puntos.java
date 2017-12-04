/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Puntos,N,Total=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese numero de puntos");
        Puntos=s.nextInt();
        N=Puntos/7;
        for(int i=1;i<=N;i++){
            Total=Total+(7*i);
        }
        System.out.println("La cantidad final de flexiones es de "+Total);
    }
    
}
