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

  public String toString() {
    String result = "\n";
    for (int h = 0; h < height; h ++) {
      for (int w = 0; w < width; w++) {
        result = result + state[w][h].toString() + " ";
      }
      result = result + "\n";
    }
    
    return result;
  }

}

