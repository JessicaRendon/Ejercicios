/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificacionvalida;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class IdentificacionValida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        String Cod;
        Boolean S=true;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Ingrese una identificacion para verificar su validez");
        Cod=s.nextLine();
        N=Cod.length();
        Cod.charAt(1);
        for(int i=0;i<N;i++){
        if(Cod.charAt(i)=='_'){
            if(Cod.charAt(i+1)=='_'){
                S=false;
            }
        }
        }
        if(S==true){
            System.out.println("La identificacion es valida");
        }else{
            System.out.println("La identificion no es valida");
        }
         
    }
    
}
