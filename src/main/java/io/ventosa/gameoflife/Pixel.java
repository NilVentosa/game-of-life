package io.ventosa.gameoflife;

public class Pixel {
  boolean state;

  Pixel() {
    state = false;
  }

  public String toString() {
    if (state == false) {
      return "0";
    } else {
      return "1";
    }
  }
}
