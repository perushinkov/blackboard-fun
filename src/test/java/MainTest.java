import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Emanuil on 11/03/2017.
 */
public class MainTest {
  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void main() throws Exception {
    Main.main(new String[]{"1+2+3"});
    assertEquals("", Main.getResult(), 25, Constants.DELTA);
  }

}