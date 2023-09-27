package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ace {
    private List<Pokemon> aces = new ArrayList<>();

    public void salvarAce(String nomePokemon, String nomeMove, int power) {
        Move move = MoveFactory.getMove(nomeMove, power);
        Pokemon ace = new Pokemon(nomePokemon, move);
        aces.add(ace);
    }

    public List<String> obterAces() {
        List<String> saida = new ArrayList<String>();
        for (Pokemon ace : this.aces) {
            saida.add(ace.obterPokemon());
        }
        return saida;
    }
}
