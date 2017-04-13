import java.util.ArrayList;

public class BrownBear extends Bear implements Bearable, Climable, Gatherable{

  public String climb(){
    return "I'm on a rock, not much to do up here, nice spot for a sleep maybe.";
  }

  public Salmon gather(){
    return new Salmon();
  }

  // public Honey gather(){
  //   return new Honey();
  // }
}
