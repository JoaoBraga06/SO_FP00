/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SO_FP00_Ex1;

import java.util.Scanner;

/**
 *
 * @author joaop
 */
public class SO_PP00_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicialização de um Scanner
        Scanner scanner = new Scanner(System.in);
        
        try{
            //Solicitação de valores
            System.out.println("Escreva o primeiro valor");
            float v1 = scanner.nextFloat();
            System.out.println("Escreva o segundo valor");
            float v2 = scanner.nextFloat();
            
            //Operações
            System.out.println("Soma: "+(v1+v2));
            System.out.println("Subtração: "+(v1-v2));
            System.out.println("Multiplicação: "+(v1*v2));
            System.out.println("Divisão: "+(v1/v2));
        }catch(java.util.InputMismatchException e){
            System.out.println("Valores inválidos.");
        }
        

    }
    
}
