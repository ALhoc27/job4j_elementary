package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ChessBoardTest {

        @Test
        void wayIs6() {
            int x1 = 0;
            int y1 = 0;
            int x2 = 0;
            int y2 = 6;
            int result = ChessBoard.figureRook(x1, y1, x2, y2);
            int expected = 6;
            assertThat(result).isEqualTo(expected);
            System.out.println("figureRook wayIs6 " + ChessBoard.wayRook(x1, y1, x2, y2));
        }

        @Test
        void wayIs5() {
            int x1 = 0;
            int y1 = 0;
            int x2 = 5;
            int y2 = 0;
            int result = ChessBoard.figureRook(x1, y1, x2, y2);
            int expected = 5;
            assertThat(result).isEqualTo(expected);
            System.out.println("figureRook wayIs5 " + ChessBoard.wayRook(x1, y1, x2, y2));
        }

        @Test
        void wayIs0() {
            int x1 = 0;
            int y1 = 0;
            int x2 = 5;
            int y2 = 6;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure wayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void wayIS5() {
            int x1 = 6;
            int y1 = 7;
            int x2 = 1;
            int y2 = 2;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 5;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure wayIS5 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void wayIs7() {
            int x1 = 7;
            int y1 = 0;
            int x2 = 0;
            int y2 = 7;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 7;
            assertThat(result).isEqualTo(expected);
            System.out.println("figureRook wayIs7 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void wayIs00() {
            int x1 = 2;
            int y1 = 6;
            int x2 = 4;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure wayIs00 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenX1isMinus1ThenWayIs0() {
            int x1 = -1;
            int y1 = 6;
            int x2 = 4;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenX1isMinus1ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenY1isMinus1ThenWayIs0() {
            int x1 = 2;
            int y1 = -1;
            int x2 = 4;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenY1isMinus1ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenX2isMinus1ThenWayIs0() {
            int x1 = 2;
            int y1 = 6;
            int x2 = -1;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenX2isMinus1ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenY2isMinus1ThenWayIs0() {
            int x1 = 2;
            int y1 = 6;
            int x2 = 4;
            int y2 = -1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenY2isMinus1ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenX1isGreater7ThenWayIs0() {
            int x1 = 10;
            int y1 = 6;
            int x2 = 4;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenX1isGreater7ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenY1isGreater7ThenWayIs0() {
            int x1 = 2;
            int y1 = 10;
            int x2 = 4;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenY1isGreater7ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenX2isGreater7ThenWayIs0() {
            int x1 = 2;
            int y1 = 6;
            int x2 = 10;
            int y2 = 1;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenX2isGreater7ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }

        @Test
        public void whenY2isGreater7ThenWayIs0() {
            int x1 = 2;
            int y1 = 6;
            int x2 = 4;
            int y2 = 10;
            int result = ChessBoard.elephantFigure(x1, y1, x2, y2);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
            System.out.println("elephantFigure whenY2isGreater7ThenWayIs0 " + ChessBoard.wayElephant(x1, x2));
        }
}
