/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Ewerton
 */
public class SalarioInvalidoException extends Exception{
    
    SalarioInvalidoException(String msg) {
        super("Valor inv�lido");
    }
}
