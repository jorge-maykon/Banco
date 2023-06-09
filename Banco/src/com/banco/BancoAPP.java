package com.banco;
import java.awt.JobAttributes;
import java.util.Random;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.JOptionPane;


public class BancoAPP extends ContaPF  {
  public static void main(String[] args) {
    
	Object[] opcoes = 	{"Conta PF", "Conta PJ", "Sair"};
    Object opcao;
    Object[] cargos = 	{"Gerente", "Coordenador", "Analista", "Programador"};
    Object[] empresas = {"Alimenticio", "Transporte"};
    Object empresa; 
    Object[] opspf ={"Consultar Dados","Consultar Saldo", "Depositar saldo", "Sacar", "Sair"};
    Object oppf;
    
//all instances
    Random G = new Random();
    
//menu initial
    opcao = JOptionPane.showInputDialog(null, "Selecione o tipo de conta :", "tipo: ", JOptionPane.PLAIN_MESSAGE, null,opcoes, opcoes[0]);
    
//input data in pessoa fisica   
    if(opcao == "Conta PF") {
//instance class ContaPF
    	ContaPF cc = new ContaPF();
    	
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
	    usuario.n = userF;
	    
	    if (oppf == "Consultar Dados") {
	    	JOptionPane.showMessageDialog(null, "CPF: " + usuario.n.getCpf()+ "\nRg: " +usuario.n.getRg()+ "\nCArgo: "+ usuario.n.getCargo()+"\nSalario: "+ usuario.n.getSalario());
	    }
	    else if (oppf == "Consultar Saldo") {
	    	JOptionPane.showMessageDialog(null, "Saldo: "+ usuario.n.getSalario());
	    }
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
   } 
}

