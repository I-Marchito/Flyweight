package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AceTest {

    @Test
    void deveRetornarPokemonsAce() {
        Ace aces = new Ace();
        aces.salvarAce("Arcanine", "Fire Blitz", 120);
        aces.salvarAce("Dragonite", "Draco Meteor", 150);
        aces.salvarAce("Rayquaza", "Draco Meteor", 150);
        aces.salvarAce("Gengar", "Shadow Ball", 90);

        List<String> saida = Arrays.asList(
                "Pokemon{nome='Arcanine', SignatureMove='Fire Blitz', SignatureMovePower='120'}",
                "Pokemon{nome='Dragonite', SignatureMove='Draco Meteor', SignatureMovePower='150'}",
                "Pokemon{nome='Rayquaza', SignatureMove='Draco Meteor', SignatureMovePower='150'}",
                "Pokemon{nome='Gengar', SignatureMove='Shadow Ball', SignatureMovePower='90'}");

        assertEquals(saida, aces.obterAces());
    }

    @Test
    void deveRetornarTotalSignatureMoves() {
        Ace aces = new Ace();
        aces.salvarAce("Arcanine", "Fire Blitz", 120);
        aces.salvarAce("Dragonite", "Draco Meteor", 150);
        aces.salvarAce("Rayquaza", "Draco Meteor", 150);
        aces.salvarAce("Gengar", "Shadow Ball", 90);

        assertEquals(3, MoveFactory.getTotalMoves());
    }

}