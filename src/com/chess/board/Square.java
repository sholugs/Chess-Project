package com.chess.board;

import com.chess.piece.Piece;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public abstract class Square {
    protected final int squareCoordinate;

    private static final Map<Integer, EmptySquare> EMPTY_SQUARE_MAP = createAllEmptySquare();

    private static Map<Integer, EmptySquare> createAllEmptySquare() {
      final Map<Integer, EmptySquare> emptySquareMap = new HashMap<>();

      for(int i = 0; i < 64; i++){
          emptySquareMap.put(i,new EmptySquare(i));
      }

        return ImmutableMap.copyOf(emptySquareMap);
    }

    public static Square createSquare(final int squareCoordinate, final Piece piece){
        return piece != null ? new OccupiedSquare(squareCoordinate, piece) : EMPTY_SQUARE_MAP.get(squareCoordinate);
    }

    private Square(int squareCoordinate) {
        this.squareCoordinate = squareCoordinate;
    }

    public abstract boolean squareOccupied();

    public abstract Piece getPiece();

    public static final class EmptySquare extends Square {
        EmptySquare(final int coordinate) {
            super(coordinate);
        }

        @Override
        public boolean squareOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
    }
    public static final class OccupiedSquare extends Square {
        private final Piece pieceOnSquare;
        private OccupiedSquare(int squareCoordinate, Piece pieceOnSquare){
            super(squareCoordinate);
            this.pieceOnSquare = pieceOnSquare;
        }
        @Override
        public boolean squareOccupied(){
            return true;
        }
        @Override
        public Piece getPiece() {
            return this.pieceOnSquare;
        }

    }
}


