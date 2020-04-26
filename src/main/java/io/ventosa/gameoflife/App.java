package io.ventosa.gameoflife;

public class App 
{
    public static void main( String[] args )
    {
      Game game = new Game(
          Integer.parseInt(args[0]), 
          Integer.parseInt(args[1]), 
          Integer.parseInt(args[2]));

      game.play();
    }
}
