package com.weverson.hibernate;

public class Endereco {
	
	private int end_Id;
	private String cidade;
	private String estado;
	private String pais;
	private Empregado empregado;
	
	public int getEnd_Id() {
		return end_Id;
	}
	public void setEnd_Id(int end_Id) {
		this.end_Id = end_Id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}
	

}
