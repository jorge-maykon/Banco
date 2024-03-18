package com.banco;
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
    Object  opcao;

    Object[] cargos = 	{"Gerente", "Coordenador", "Analista", "Programador"};
    Object[] empresas = {"Alimenticio", "Transporte"};
    Object empresa; 
    Object[] opspf ={"Consultar Dados","Consultar Saldo", "Depositar saldo", "Sacar", "Sair"};
    Object oppf;
    
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

		  int opca = Integer.parseInt(opcao.toString());

		  switch (opca){
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

		  }
	}
}




			/*Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Tela.add(inicializar); // adiciona o painel ao frame ÿ
			Tela.setSize(250, 250); // configura o tamanho do frameÿ
			Tela.setVisible(true); // torna o frame visível*/

					/*opcao = JOptionPane.showInputDialog
					(null, "--- Menu --- :", "tipo: ",
							JOptionPane.PLAIN_MESSAGE, null,menu, menu[0]));
		});*/



		//System.out.println(opcao);
		 /*switch (opcao) {
			 case "Login":
				 User.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			break;
			 case "Novo Usuario":
				 JOptionPane.showInputDialog(null, "Digite seu nome: ", "tipo: ", JOptionPane.PLAIN_MESSAGE, null,opcoes, opcoes[0]);
		 	break;
			 case "Sair":
				 //JOptionPane.show();
			 break;
		 }

		 opcao = JOptionPane.showInputDialog(null, "Selecione o tipo de conta :", "tipo: ", JOptionPane.PLAIN_MESSAGE, null,opcoes, opcoes[0]);
    */
//input data in pessoa fisica



	/*if(opcao == "Conta PF") {
//instance class ContaPF
    	ContaPF cc = new ContaPF(0,0,0.0);
    	
    	cc.setNumAG(10);
    	cc.setNumConta(G.nextInt(10));
    	cc.setSaldo(G.nextDouble(0.0));
    	JOptionPane.showMessageDialog(null, "Vamos iniciar a coleta de dados de usuário");
	    
//instancias dentro do PF	    
	    Pessoa usuario = new Pessoa(G.nextInt(100));
	    PessoaFisica userF = new PessoaFisica();
	    
//get dates of pessoa fisica
	    usuario.setNome(JOptionPane.showInputDialog("Digite seu nome"));
	    userF.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
	    userF.setRg(JOptionPane.showInputDialog("Digite seu RG: "));
	     
//Definindo salarios aos cargos
	    userF.setCargo(JOptionPane.showInputDialog(null, "Selecione o seu cargo:", "Menu de Cargos", JOptionPane.PLAIN_MESSAGE, null, cargos, cargos[0]));
	    if(userF.getCargo() == "Programador") {
	    	userF.setSalario(5000);
	    	}
	    else if (userF.getCargo() == "Gerente") {
	    	userF.setSalario(10000);
	    	}
	    else if (userF.getCargo() == "Coordenador") {
	    	userF.setSalario(20000);
	    	}
	    else {
	    	userF.setSalario(3000);
	    	}
	    
//pessoa fisica chose what want to do with your count
	   do { oppf = JOptionPane.showInputDialog(null, "Selecione a operação", "Operações", JOptionPane.PLAIN_MESSAGE, null, opspf, opspf[0]);
	   
//add references of other class
		   //UserF = usuario.setNome();
		   //usuario.n = userF;
	    
	    if (oppf == "Consultar Dados") {
	    	JOptionPane.showMessageDialog(null, "CPF: " + usuario.getNome());
	    }
	    //else if (oppf == "Consultar Saldo") {
	    //	JOptionPane.showMessageDialog(null, "Saldo: "+ usuario.getSalario());
	    //}
	    } while (oppf != "Sair");
    }

    
//Caso a conta seja de pessoa juridica 
    else if (opcao == "Conta PJ") {
    		empresa = JOptionPane.showInputDialog(null, "Selecione seu tipo de Empresa", "Menu de Tipos", JOptionPane.PLAIN_MESSAGE, null, empresas, empresas[0]);
    		
    		PessoaJuridica user = new PessoaJuridica(G.nextInt(), empresa);
    		user.setCnpj(JOptionPane.showInputDialog("Digite seu CNPJ: "));
    		user.setInscricao(JOptionPane.showInputDialog(null, "Informe sua inscrição :"));
    		user.setSite(JOptionPane.showInputDialog(null, "Informe seu site :"));
    		
    	} 

		*/


