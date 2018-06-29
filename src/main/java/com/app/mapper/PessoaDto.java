package com.app.mapper;

public class PessoaDto {
	
	private String nome;
	private String cpf;
	private Integer idades;
	
	public PessoaDto(String nome, String cpf, Integer idades) {
		this.nome = nome;
		this.cpf = cpf;
		this.idades = idades;
	}
	
	public PessoaDto() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdades() {
		return idades;
	}
	public void setIdades(Integer idades) {
		this.idades = idades;
	}
}
