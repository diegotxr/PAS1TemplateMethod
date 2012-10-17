/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TemplateMethod;

/**
 *
 * @author diegotxr
 */
public class ArquivoHTML extends Arquivo {

    @Override
    protected String preencherArquivo(Usuario usuario) {
       String dados=  "<html>\r\n  <body>\r\n   <h1>"+usuario.getNome()+"</h1>\r\n   <p>"+usuario.getProfissao()+"</p>\r\n   <p>"+usuario.getEmail()+"</p\r\n  </body>\r\n</html>";
                System.out.println("Dados arquivo HTML \n");
		return dados;
                
    }

    
}
