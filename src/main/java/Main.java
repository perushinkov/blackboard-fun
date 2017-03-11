import arithmetics.JProduct;
import arithmetics.JSum;
import arithmetics.MathFact;
import core.BlackBoard;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Emanuil on 11/03/2017.
 */
public class Main {
  private static double result;

  public static void main(String[] args) {
    BlackBoard board = new BlackBoard();
    board.addWorkers(MathFact.getWorkers(board));
    Object questionMark = board.runProgram(new JProduct(Arrays.asList(2.,3.)));
    System.out.println(questionMark);

  }

  public static double getResult() {
    return result;
  }
}
