package org.example;

import java.util.HashMap;
import java.util.Map;

public class MoveFactory {

    private static Map<String, Move> moves = new HashMap<>();

    public static Move getMove(String nome, int power){
        Move move = moves.get(nome);
        if (move == null){
            move = new Move(nome, power);
            moves.put(nome, move);
        }
        return move;
    }

    public static int getTotalMoves(){
        return moves.size();
    }
}
