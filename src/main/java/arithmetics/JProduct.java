package arithmetics;

import core.JobBase;
import core.JobType;

import java.util.List;

/**
 * Created by Emanuil on 11/03/2017.
 */
public class JProduct extends JobBase {
  List<Double> doubles;
  public JProduct(List<Double> doubles) {
    super(Types.TProduct.getJobType());
  }

  @Override
  public List<Double> getParams() {
    return doubles;
  }
}
