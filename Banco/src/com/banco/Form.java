package com.banco;
import javax.swing.*;
public class Form extends JFrame {

    public JButton BtnSair;

    public JLabel TxtSair;
    public JTextField TxtNome;

    public Form(){
        this.inicializar();
    }
    private void inicializar(){
        this.setTitle("Bank");
        this.setSize(640, 480);
    }

}