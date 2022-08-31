package com.chess.piece;

import com.chess.Alliance;
import com.chess.board.Board;
import com.chess.board.Move;
import com.chess.board.Square;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {

    private final int[] CANDIDATE_MOVE = {-17, -15, -10, -6, 6, 10, 15, 17};

    Knight(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public List<Move> legalMoves(Board board) {

        int candidateDestination;
        final List<Move> legalMoves = new ArrayList<>();

        for(int currentCandidate : CANDIDATE_MOVE){

            candidateDestination = this.piecePosition + currentCandidate;
            if(true){
                final Square candidateDestinationSquare = board.getSquare(candidateDestination);
                if(!candidateDestinationSquare.squareOccupied()){
                legalMoves.add(new Move());
                }

            }

        }

        return null;
    }
}
