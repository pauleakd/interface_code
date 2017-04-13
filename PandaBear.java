import java.util.ArrayList;

public class PandaBear extends Bear implements Bearable, Climable, Gatherable{

  public String climb(){
    return "I can climb this tree, you can't hide from me!";
  }

  public Bamboo gather(){
    return new Bamboo();
  }
}
