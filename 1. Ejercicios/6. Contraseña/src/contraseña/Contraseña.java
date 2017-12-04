/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Long,SumCor=0, SumLeMa=0, SumNum=0, SumEsVa=0, SumLe=0;
        String Contraseña;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Escriba contraseña para verificar validez");
        Contraseña=s.nextLine();
        String digito = Contraseña.charAt(0)+"";
               
        Long=Contraseña.length();
        if(Long>=8&&Long<=12){
            if(digito.matches("[0-9]")){
                System.out.println("La contraseña no debe iniciar con un numero");
            }else{
                for(int i=0;i<Long;i++){
                    digito=Contraseña.charAt(i)+"";
                    if(digito.matches("^/")){
                       SumCor=SumCor+1;
                    }
                        if(digito.matches("[A-Z]")){
                          SumLeMa=SumLeMa+1;  
                        }
                            if(digito.matches("[0-9]")){
                               SumNum=SumNum+1;
                            }
                                if(digito.matches("[\\s]")){
                                  SumEsVa=SumEsVa+1;   
                                }
                                    if(digito.matches("[a-zA-Z]")){
                                      SumLe=SumLe+1;
                                    }
                                }
        if(SumCor>0){
                System.out.println("La contraseña no debe tener /");    
        }
        if(SumLeMa==0){
                System.out.println("La contraseña debe contener al menos una mayuscula");  
        }
        if(SumNum==0){
                System.out.println("La contraseña debe contener al menos un numero");
        }
        if(SumEsVa>0){
                System.out.println("La contraseña no debe contener espacios vacios");  
        }
        if(SumLe==0){
                System.out.println("La contraseña debe contener al menos una letra"); 
        }              
            }      
        }else{
            System.out.println("La contraseña debe tener de 8 a 12 caracteres");
        }
    }
    
}
