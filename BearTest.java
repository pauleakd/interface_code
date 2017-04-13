import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

  BrownBear brownbear;
  PandaBear pandabear;
  PolarBear polarbear;
  BlackBear blackbear;
  Salmon food;

  @Before
  public void setup(){
    brownbear = new BrownBear();
    polarbear = new PolarBear();
    pandabear = new PandaBear();
    blackbear = new BlackBear();
    food = new Salmon();
  }

  @Test
  public void canEatSalmon(){
    brownbear.eat(food);
    assertEquals(1, brownbear.foodCount());
  }

  @Test
  public void cantEatIfBellyFull(){
    for (int i = 0; i < 7; i++){
      brownbear.eat(food);
    }
    assertEquals(5, brownbear.foodCount());
  }

@Test
  public void canFishSalmon(){
    Edible freshSalmon = brownbear.gather();
    assertEquals(Salmon.class, freshSalmon.getClass());
  }
@Test
  public void canFishSeal(){
    Edible freshSeal = polarbear.gather();
    assertEquals(Seal.class, freshSeal.getClass());
  }
@Test
  public void canHarvestHoney(){
    Edible freshHoney = blackbear.gather();
    assertEquals(Honey.class, freshHoney.getClass());
  }
@Test
  public void canHarvestBamboo(){
    Edible freshBamboo = pandabear.gather();
    assertEquals(Bamboo.class, freshBamboo.getClass());
  }

}
