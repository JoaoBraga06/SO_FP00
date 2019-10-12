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
public class NumberArgsException extends Exception {

    /**
     * Creates a new instance of <code>Exception</code> without detail message.
     */
    public NumberArgsException() {
        System.out.println("O número de argumentos é inválido.");
    }

    /**
     * Constructs an instance of <code>Exception</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NumberArgsException(String msg) {
        super(msg);
    }
}
