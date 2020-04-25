package io.ventosa.gameoflife;

public class Game {
  int interval;
  Board board;

  Game(int width, int height, int interval) {
    this.interval = interval;
    this.board = new Board(width, height);
    board.setPixel(30, 5, true);
    board.setPixel(30, 6, true);
    board.setPixel(30, 7, true);
    board.setPixel(20, 5, true);
    board.setPixel(12, 5, true);
  }

  public void play() {
    while(true) {
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println(board);
      board = board.nextBoard();
      try {
        Thread.sleep(interval);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
