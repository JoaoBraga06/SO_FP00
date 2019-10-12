/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_fp00_ex3;

import Exceptions.NumberArgsException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author joaop
 */
public class SO_FP00_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            if(args.length!=1)
                throw new NumberArgsException();
            
            File file = new File(args[0]+".txt");
            Scanner scanner = new Scanner(file);
            
            float v1 = scanner.nextInt();
            float v2 = scanner.nextInt();

            System.out.println("Soma: "+(v1+v2));
            System.out.println("Subtração: "+(v1-v2));
            System.out.println("Multiplicação: "+(v1*v2));
            System.out.println("Divisão: "+(v1/v2));            
        }catch(NumberArgsException e){
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SO_FP00_Ex3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
