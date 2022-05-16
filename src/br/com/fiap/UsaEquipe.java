package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaEquipe {
	public static void main(String[] args) {
		Equipe grupo;
		String aux, escolha = "sim", nome;
		String[] integrantes;
		int qtde;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome da equipe:");
				aux = JOptionPane.showInputDialog("Digite a quantidade de integrantes");
				qtde = Integer.parseInt(aux);
				integrantes = new String[qtde];
				for (int i = 0; i < integrantes.length; i++) {
					integrantes[i] = JOptionPane.showInputDialog("Integrante " + (i + 1) + "�");
				}
				grupo = new Equipe(nome, integrantes);
				grupo.listaEquipe();
				
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Programa Encerrado! At� mais!");
		
	}

}
