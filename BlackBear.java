import java.util.ArrayList;

public class BlackBear extends Bear implements Bearable, Climable, Gatherable{

  public String climb(){
    return "I'm on a rock, not much to do up here, nice spot for a sleep maybe.";
  }

  public Honey gather(){
    return new Honey();
  }
}
