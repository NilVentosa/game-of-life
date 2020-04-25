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
    for (int w = 0; w < width; w++) {
      for (int h = 0; h < height; h++) {
        if (this.state[w][h].state == false) {
          result.setPixel(w, h, true);
        } else {
          result.setPixel(w, h, false);
        }
      }
    }
    return result;
  }
    

}

