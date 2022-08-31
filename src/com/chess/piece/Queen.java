package com.chess.piece;

import com.chess.Alliance;
import com.chess.board.Board;
import com.chess.board.Move;

import java.util.List;

public class Queen extends Piece{
    Queen(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public List<Move> legalMoves(Board board) {
        return null;
    }
}
