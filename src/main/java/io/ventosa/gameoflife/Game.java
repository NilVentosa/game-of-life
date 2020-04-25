package io.ventosa.gameoflife;

public class Game {
  int interval;
  Board board;

  Game() {
    interval = 500;
    board = new Board(40, 10);
  }

  public void play() {
    while(true) {
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println(board);
      try {
        Thread.sleep(interval);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
