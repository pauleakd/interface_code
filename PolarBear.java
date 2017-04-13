import java.util.ArrayList;

public class PolarBear extends Bear implements Bearable, Climable, Gatherable{

  public String climb(){
    return null;
  }

  public Seal gather(){
    return new Seal();
  }
}
