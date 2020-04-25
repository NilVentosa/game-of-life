package io.ventosa.gameoflife;

public class Game {
  int interval;
  Board board;

  int[][] SIMKIN_GLIDER_GUN = {{1,1}, {2,1}, {1,2}, {2,2}, {9,1}, {8,1}, {9,2}, {8,2}, {5,4}, {6,4}, {5,5}, 
                               {6,5}, {23,10}, {24,10}, {26,10}, {27,10}, {22,11},
                               {22,12}, {22,13}, {23,13}, {24,13}, {28,11}, {29,12}, {28,13}, {27,14}, {32,12}, 
                               {33,12}, {32,13}, {33,13}, {21,18}, {22,18},
                               {21,19}, {22,20}, {23,20}, {24,20}, {24,21}};

  int[][] GOSPER_GLIDER_GUN = {{}};

  Game(int width, int height, int interval) {
    this.interval = interval;
    this.board = new Board(width, height);
    this.setInitialState(SIMKIN_GLIDER_GUN);
  }

  public void setInitialState(int[][] initialState) {
    for (int i = 0; i < initialState.length; i++) {
      this.board.setPixel(initialState[i][0],initialState[i][1], true);
    }
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
