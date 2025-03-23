package exe2;

import javax.swing.*;

public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente() {
        this.nome = "sem nome";
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }


    public void realizarDeposito(float x){
        this.saldo += x;
    }

    public void realizarSaque(float x){
        if(this.saldo - x >= 0){
            this.saldo -= x;
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque");
        }
    }

    public void dadosCliente(){
        JOptionPane.showMessageDialog(null, "número do conta: " + this.numeroConta
                + " Nome do Cliente: " + this.nome
                + " Saldo do Cliente: " + this.saldo
        );
    }

}
