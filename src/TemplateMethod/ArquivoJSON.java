/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author diegotxr
 */
public class ArquivoJSON extends Arquivo {
    
    
	

	@Override
	protected String preencherArquivo(Usuario usuario) {
		
		String dados= "{\n    \"nome\": \""+usuario.getNome()+"\" ,\n    \"profissao\": \""+usuario.getProfissao()+"\",\n    \"email\":  \""+usuario.getEmail()+"\"\n}";
                System.out.println("\n\nDados Arquivo JSON \n");
                return dados;
}


}
