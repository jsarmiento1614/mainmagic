/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmagic;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class MainMagic {

    /**
     * @param args the command line arguments
     */
    Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=0; 
        MainMagic call =new MainMagic();  
        call.numMagico(numero);
            
    }
    
    public void numMagico(int numero){
        int numMagico=10;
        int intento=0;
        int salir=0;
        do{
           System.out.println("Ingresa un numero");
           numero=teclado.nextInt();
           intento++;
           if(numMagico-3==numero || numMagico+3==numero||numMagico-2==numero || numMagico+2==numero||numMagico-1==numero || numMagico+1==numero){
              System.out.println("Esta Cerca");
           }else if(numero!=numMagico){
              System.out.println("Esta Frio");
              
           }else if(numero==numMagico){
                 System.out.println("Los adivinaste en "+ intento + " intentos");
                 break; 
           }else{
              break; 
           }
        }while(salir!=1);
   
        }
    }
 
