package br.com.fiap;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome;
	private String idSecreta;
	private String[] poderes;
	private String[] fraquezas;
	
	public SuperHeroi() {}
	
	public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
		this.nome = nome;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
		this.fraquezas = fraquezas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdSecreta() {
		return idSecreta;
	}

	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}

	public String[] getPoderes() {
		return poderes;
	}

	public void setPoderes(String[] poderes) {
		this.poderes = poderes;
	}

	public String[] getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(String[] fraquezas) {
		this.fraquezas = fraquezas;
	}
	
	public void listaHeroi() {
		String exibe = "Nome do Héroi: " + nome + "\nIdentidade Secreta: "
				+ idSecreta + "\n";
		
		for (int i = 0; i < poderes.length; i++) {
			exibe += "Poder " + (i+1) + "°: " + poderes[i] + "\n";
		}
		
		for (int i = 0; i < fraquezas.length; i++) {
			exibe += "Fraqueza " + (i+ 1) + "°: "+ fraquezas[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, exibe);
	}

}
