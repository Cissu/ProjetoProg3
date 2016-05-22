/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import classes.Dentista;
import classes.Funcionario;

/**
 *
 * @author Ewerton
 */
public interface IFclinica {
    
    public void create(Funcionario f);
    public void update(Funcionario f);
    public void consultar(Funcionario f);
    public void delete(Funcionario f);
    public void buscar(Funcionario f);
    
}
