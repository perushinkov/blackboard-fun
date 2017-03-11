package arithmetics;

import core.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Emanuil on 11/03/2017.
 */
class WSum extends Worker {
  public WSum(BlackBoardAgent agent) {
    super(agent);
  }

  @Override
  public void init() {}

  @Override
  public Double executeJob(Job job) {
    return ((JSum)job)
      .getParams()
      .stream()
      .reduce((Double a, Double b) -> a + b)
      .orElse(null);
  }

  @Override
  public JobType getJobType() {
    return Types.TSum.getJobType();
  }
}
