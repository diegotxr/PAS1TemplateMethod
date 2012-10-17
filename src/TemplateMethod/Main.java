/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TemplateMethod;

/**
 *
 * @author diegotxr
 */
public class Main {

    public static void main(String... args) {
       Usuario usuario1 = new Usuario("Diego", "estudante", "diego.teixeira@dce.ufpb.br");
       
       Arquivo arquivo= new ArquivoHTML();
       arquivo.criarArquivo(usuario1);
		
       Arquivo arquivo1= new ArquivoJSON();
       arquivo1.criarArquivo(usuario1);
		
       Arquivo arquivo2= new ArquivoMarkdown();
       arquivo2.criarArquivo(usuario1);
    }
}
