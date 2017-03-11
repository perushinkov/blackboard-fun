package arithmetics;

import core.BlackBoardAgent;
import core.Job;
import core.JobType;
import core.Worker;

/**
 * Created by Emanuil on 11/03/2017.
 */
public class WProduct extends Worker {
  public WProduct (BlackBoardAgent agent) {
    super(agent);
  }

  @Override
  public void init() {}

  @Override
  public Double executeJob(Job job) {
    return ((JProduct)job)
      .getParams()
      .stream()
      .reduce((Double a, Double b) -> a * b)
      .orElse(null);
  }

  @Override
  public JobType getJobType() {
    return Types.TProduct.getJobType();
  }
}
