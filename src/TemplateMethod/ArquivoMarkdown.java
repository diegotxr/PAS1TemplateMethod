/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TemplateMethod;

/**
 *
 * @author diegotxr
 */
public class ArquivoMarkdown extends Arquivo {

    @Override
    protected String preencherArquivo(Usuario usuario) {
        String dados= "# " + usuario.getNome() + "\n" + 	 usuario.getProfissao() + "\n" + usuario.getEmail() ;
                System.out.println("\n\nDados Arquivo MarkDown  \n");
                return dados;
    }

    

}
