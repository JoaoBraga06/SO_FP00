/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SO_FP00_Ex4;

import Exceptions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author joaop
 */
public class SO_FP00_Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1;
        try{
            if(args.length!=1)
                throw new NumberArgsException();
            if(args.length==0)
                throw new NullArgsException();
            
            File file = new File(args[0]+".txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                System.out.println("Linha "+i+": "+scanner.nextLine());
                i++;
            }        
            
        }catch(NumberArgsException | NullArgsException e){
        }catch (FileNotFoundException ex) {
            System.out.println("ERRO: O ficheiro "+args[0]+" náo existe!!!");
        }  
    }    
}
