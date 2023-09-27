package org.example;

public class Move {
    private String nome;
    private int power;

    public Move(String nome, int power){
        this.nome = nome;
        this.power = power;
    }

    public String getNome() {
        return nome;
    }

    public int getPower() {
        return power;
    }
}
