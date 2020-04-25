package io.ventosa.gameoflife;

public class Board {
  Pixel[][] state;
  int height;
  int width;

  Board(int width, int height) {
    this.width = width;
    this.height = height;
    state = new Pixel[width][height];
    
    for (int w = 0; w < width; w++) {
      for (int h = 0; h < height; h++) {
        state[w][h] = new Pixel();
      }
    }
  }

  public void setPixel(int x, int y, boolean value) {
    this.state[x][y].state = value;
  }

  public String toString() {
    String result = "\n";
    for (int i = 0; i < width + 2; i++) {
      result = result + "--";
    }
    result = result + "\n";
    for (int h = 0; h < height; h ++) {
      result = result + "| ";
      for (int w = 0; w < width; w++) {
        result = result + state[w][h].toString() + " ";
      }
      result = result + " |\n";
    }
    for (int i = 0; i < width + 2; i++) {
      result = result + "--";
    }
    return result;
  }
  
  public Board nextBoard() {
    Board result = new Board(this.width, this.height);
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        if (this.state[x][y].state == true) {
          if (this.getNeighborsValue(x, y) != 2 && this.getNeighborsValue(x, y) != 3) {
           result.setPixel(x, y, false); 
          } else {
            result.setPixel(x, y, true);
          }
        } else {
          if (this.getNeighborsValue(x, y) == 3) {
            result.setPixel(x, y, true);
          }
        }
      }
    }
    return result;
  }

  public int getNeighborsValue(int x, int y) {
    int result = 0;
    for (int i = x-1; i < x+2; i++) {
      for (int j = y-1; j < y+2; j++) {
        if (i < 0 || j < 0 || i >= this.width || j >= this.height || (i == x && j == y)) {
          result = result;
        } else {
          if (this.state[i][j].state == true) {
            result++;
          }
        }
      }
    }
    return result;
  }

}

