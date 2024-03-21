/*package com.banco;

import java.awt.font.TextLayout;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;

public class BancoAPP extends ContaPF  {
	public BancoAPP(int numAg, int numConta, double saldo) {
		super(1, 2, 0.00);
	}
	public static void main(String[] args) {

		Object[] menu = {"Login", "Novo Usuario", "sair"};
		Object[] opcoes = 	{"Conta PF", "Conta PJ", "Sair"};
		int opcao;
		int opcao1;

		Object[] cargos = 	{"Gerente", "Coordenador", "Analista", "Programador"};
		Object[] empresas = {"Alimenticio", "Transporte"};
		Object empresa;
		Object[] opspf ={"Consultar Dados","Consultar Saldo", "Depositar saldo", "Sacar", "Sair"};
		//Object oppf;

//all instances
		Random G = new Random();
		Pessoa User = new Pessoa(01);
		Form Tela = new Form();

//menu initial
		opcao = JOptionPane.showOptionDialog(null,
				"Escolha uma opção",
				"SeuBank",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				menu,
				menu[0]);


		switch (opcao){
			case 0:
				SwingUtilities.invokeLater(() -> {
					Tela.setVisible(true);
					Tela.getJMenuBar();
					Tela.setSize(750, 600);
					Tela.setLocationRelativeTo(null);
					Tela.setTitle("My Bank");
					JLabel mensagem = new JLabel("Bem vindo, a tela de Login:");
					Tela.getContentPane().add(mensagem);
					Tela.pack();
				});
				break;


			case 1:
				SwingUtilities.invokeLater(() -> {
					Tela.setVisible(true);
					Tela.getJMenuBar();
					Tela.setSize(750, 600);
					Tela.setLocationRelativeTo(null);
					Tela.setTitle("My Bank");
					JLabel mensagem = new JLabel("Bem vindo, a tela de Novo usuario:");
					Tela.getContentPane().add(mensagem);
					Tela.pack();
				});
				break;
			case 2:
				Tela.setVisible(true);
				Tela.setSize(750, 600);
				Tela.setTitle("My Bank");
				JLabel mensagem = new JLabel("Volte sempre!:");
				Tela.getContentPane().add(mensagem);
				Tela.pack();
				System.out.println("volte sempre");
				break;

		}
	}
}*/


// 	BRACK BOX

/*package com.banco;

import java.awt.font.TextLayout;
import java.util.Random;
import javax.swing.*;

public class BancoAPP {
	// Criação de classes internas para representar diferentes tipos de contas
	private abstract class Conta{
		protected int numAg;
		protected int numConta;
		protected double saldo;

		public Conta(int numAg, int numConta, double saldo) {
			this.numAg = numAg;
			this.numConta = numConta;
			this.saldo = saldo;
		}

		public abstract void consultarDados();
		public abstract void consultarSaldo();
		public abstract void depositar(double valor);
		public abstract void sacar(double valor);
	}

	private class ContaPF extends Conta {
		private String nome;
		private String cpf;

		public ContaPF(int numAg, int numConta, double saldo, String nome, String cpf) {
			super(numAg, numConta, saldo);
			this.nome = nome;
			this.cpf = cpf;
		}

		@Override
		public void consultarDados() {
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
		}

		@Override
		public void consultarSaldo() {
			System.out.println("Saldo: " + saldo);
		}

		@Override
		public void depositar(double valor) {
			saldo += valor;
			System.out.println("Depósito realizado com sucesso!");
		}

		@Override
		public void sacar(double valor) {
			if (saldo >= valor) {
				saldo -= valor;
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}
	}
}*/

 //  COPILOT

package com.banco;

import javax.swing.*;
		import java.util.Random;

// A classe BancoAPP não deve estender ContaPF a menos que haja uma relação de "é um" entre eles.
// Se BancoAPP é uma ContaPF, então a herança faz sentido. Caso contrário, é melhor usar composição.
public class BancoAPP {
	// Removido o construtor que estava chamando super com valores fixos.

	public static void main(String[] args) {
		// As variáveis não utilizadas foram removidas.
		Object[] menu = {"Login", "Novo Usuario", "sair"};
		int opcao;

		// Instâncias não utilizadas foram removidas.
		Random G = new Random();
		Pessoa User = new Pessoa(01);
		Form Tela = new Form();

		// Menu inicial
		opcao = JOptionPane.showOptionDialog(null,
				"Escolha uma opção",
				"SeuBank",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				menu,
				menu[0]);

		switch (opcao) {
			case 0:
				SwingUtilities.invokeLater(() -> {
					Tela.setVisible(true);
					Tela.setSize(750, 600);
					Tela.setLocationRelativeTo(null);
					Tela.setTitle("My Bank");
					JLabel mensagem = new JLabel("Bem vindo, a tela de Login:");
					Tela.getContentPane().add(mensagem);
					Tela.pack();
				});
				break;

			case 1:
				SwingUtilities.invokeLater(() -> {
					Tela.setVisible(true);
					Tela.setSize(750, 600);
					Tela.setLocationRelativeTo(null);
					Tela.setTitle("My Bank");
					JLabel mensagem = new JLabel("Bem vindo, a tela de Novo usuario:");
					Tela.getContentPane().add(mensagem);
					Tela.pack();
				});
				break;
			case 2:
				Tela.setVisible(true);
				Tela.setSize(750, 600);
				Tela.setTitle("My Bank");
				JLabel mensagem = new JLabel("Volte sempre!:");
				Tela.getContentPane().add(mensagem);
				Tela.pack();
				System.out.println("volte sempre");
				break;
		}
	}
}


