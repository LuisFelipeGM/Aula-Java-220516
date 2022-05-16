package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaSuperHeroi {
	public static void main(String[] args) {
		SuperHeroi heroi1;
		String aux, nome, idSecreta, escolha = "sim";
		String[] poderes;
		String[] fraquezas;
		int qtdeP, qtdeF;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o Nome do Super Herói:");
				idSecreta = JOptionPane.showInputDialog("Digite Identidade Secreta do Super Herói:");
				aux = JOptionPane.showInputDialog("Digite a Quantidade de Poderes do Herói:");
				qtdeP = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Digite a Quantidade de Fraquezas do Herói:");
				qtdeF = Integer.parseInt(aux);
				// Laço para os Poderes
				poderes = new String[qtdeP];
				for (int i = 0; i < poderes.length; i++) {
					poderes[i] = JOptionPane.showInputDialog("Poder " + (i + 1) + "°:");
				}
				// Laço para as Fraquezas
				fraquezas = new String[qtdeF];
				for (int i = 0; i < fraquezas.length; i++) {
					fraquezas[i] = JOptionPane.showInputDialog("Fraqueza " + (i + 1) + "°:");
				}
				
				heroi1 = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
				heroi1.listaHeroi();
				
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Programa Encerrado! Até mais!");
	}
}
