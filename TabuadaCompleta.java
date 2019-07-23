package br.com.tlmtech.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class TabuadaCompleta {

	public static void main(String[] args) throws IOException {

		int valor_inicio_tab, valor_fim_tabuada, numInicio, numFinal, i, cont;
		boolean dadosValidos;
		StringBuilder tabuadas = new StringBuilder();
		do {
			dadosValidos = true;
			valor_inicio_tab = Integer.parseInt(JOptionPane.showInputDialog("Numero inicia a tabuada.: "));
			valor_fim_tabuada = Integer.parseInt(JOptionPane.showInputDialog("Numero termino da tabuada.: "));
			numInicio = Integer.parseInt(JOptionPane.showInputDialog("Inicio do numero.: "));
			numFinal = Integer.parseInt(JOptionPane.showInputDialog("Termino do numero.: "));
			if ((valor_inicio_tab > valor_fim_tabuada) || (numInicio > numFinal)) {
				JOptionPane.showMessageDialog(null,
						"Informacoes invalidas\nNumeros iniciais precisam ser menor que do fim");
				dadosValidos = false;
			} else {
				JOptionPane.showMessageDialog(null, "Numeros validos!!");
				dadosValidos = true;
			}
		} while (dadosValidos == false);
		FileWriter arquivo = new FileWriter("tabuada_completa1.txt");
		PrintWriter gravar = new PrintWriter(arquivo);
		
		for (cont = valor_inicio_tab; cont <= valor_fim_tabuada; cont++) {
			tabuadas.append("=======================");
			tabuadas.append("\n**** TABUADA DE " + cont+" ****");
			tabuadas.append("\n=======================\n");
			for (i = numInicio; i <= numFinal; i++) {
				tabuadas.append("    " + cont + " X " + i + " = " + cont * i+"\n");
			}
		}
		tabuadas.append("=======================");
		tabuadas.append(gravar);
		arquivo.close();
		System.out.println(tabuadas);
		System.out.println("Gravado em Arquivo tabuada_completa1.txt");
	}
}
