package br.com.vemprafam.pojo;

import java.util.Date;

public class Funcionarios {
	private int re;
	private String nome;
	private Date dataDeAdmissao;
	private double salario;
	public Funcionarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcionarios(int re, String nome, Date dataDeAdmissao, double salario) {
		super();
		this.re = re;
		this.nome = nome;
		this.dataDeAdmissao = dataDeAdmissao;
		this.salario = salario;
	}
	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionarios [re=" + re + ", nome=" + nome + ", dataDeAdmissao=" + dataDeAdmissao + ", salario="
				+ salario + "]";
	}

}
