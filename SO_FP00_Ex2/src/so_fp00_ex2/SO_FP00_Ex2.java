/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_fp00_ex2;
import Exceptions.NumberArgsException;



/**
 *
 * @author joaop
 */
public class SO_FP00_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            if(args.length<2)
                throw new NumberArgsException();
            
            float v1 = Float.parseFloat(args[0]);
            float v2 = Float.parseFloat(args[1]);
            
            System.out.println("Soma: "+(v1+v2));
            System.out.println("Subtração: "+(v1-v2));
            System.out.println("Multiplicação: "+(v1*v2));
            System.out.println("Divisão: "+(v1/v2));        
        } catch (NumberArgsException ex) {}
    }
    
}
