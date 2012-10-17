/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TemplateMethod;

/**
 *
 * @author diegotxr
 */
public abstract class Arquivo {

    public void criarArquivo(Usuario usuario) {
                 
		String impressão=preencherArquivo(usuario);
                System.out.println(impressão);
    }

    protected abstract String preencherArquivo(Usuario usuario);    
        
    
}
