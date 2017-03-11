package arithmetics;

import core.JobBase;
import core.JobType;

import java.util.List;

/**
 * Created by Emanuil on 11/03/2017.
 */
public class JSum extends JobBase {
  private List<Double> doubles;
  public JSum(List<Double> doubles) {
    super(Types.TSum.getJobType());
    this.doubles = doubles;
  }

  @Override
  public List<Double> getParams() {
    return doubles;
  }
}
