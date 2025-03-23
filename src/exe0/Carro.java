package exe0;

import javax.swing.*;

public class Carro {
    //variaveis

    //do tipo primitivo
    public int ano;
    public float velocidade;

    //do tipo classe
    public String marca, modelo;


    //metodos construtores
    public Carro(){ //sem parametros
        this.marca = "Marca inválida";
        this.modelo = "Modelo inválido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodos
    public void exibirDetalhes(){
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca
                + " Modelo: " + this.modelo
                + " Ano: " + this.ano
                + " Velocidade: " + this.velocidade);
    }

    //vai acelerar o carro de X unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;

    }

    public void frear(float x){
        if(this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else{
            System.out.println("Não foi possivel frear");
        }
    }

}
