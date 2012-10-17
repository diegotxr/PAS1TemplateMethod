/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author diegotxr
 */
public class Usuario {
    private String nome;
	private String profissao;
	private String email;
	
	
	public Usuario (String _nome, String _profissao, String _email){
		this.nome = _nome;
		this.profissao = _profissao;
		this.email = _email;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String _nome){
		this.nome = _nome;
	}
	
	public String getProfissao(){
		return profissao;
	}
	
	public void setProfissao(String _profissao){
		this.nome = _profissao;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String _email){
		this.nome = _email;
	}
	

}
