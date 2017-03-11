package arithmetics;
import core.BlackBoard;
import core.Worker;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Emanuil on 11/03/2017.
 *
 */
public class MathFact {
  public static List<Worker> getWorkers(BlackBoard blackBoard) {
    return Arrays.asList(
      new WProduct(blackBoard.getAgent()),
      new WSum(blackBoard.getAgent())
    );
  }
}
