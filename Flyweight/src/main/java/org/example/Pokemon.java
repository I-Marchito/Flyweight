package org.example;


public class Pokemon {
    private String nome;
    private Move signatureMove;

    public Pokemon(String nome, Move signatureMove){
        this.nome = nome;
        this.signatureMove = signatureMove;
    }

    public String obterPokemon() {
        return "Pokemon{" +
                "nome='" + this.nome + '\'' +
                ", SignatureMove='" + signatureMove.getNome() + '\'' +
                ", SignatureMovePower='" + signatureMove.getPower() + '\'' +
                '}';
    }
}