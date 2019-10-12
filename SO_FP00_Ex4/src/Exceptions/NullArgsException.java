/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author joaop
 */
public class NullArgsException extends Exception {

    /**
     * Creates a new instance of <code>NullArgsException</code> without detail
     * message.
     */
    public NullArgsException() {
        System.out.println("Argumento não existe, deverá inserir o nome do ficheiro a ler na secção de argumentos do programa.");
    }

    /**
     * Constructs an instance of <code>NullArgsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NullArgsException(String msg) {
        super(msg);
    }
}
