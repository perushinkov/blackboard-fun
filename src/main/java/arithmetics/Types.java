package arithmetics;

import core.JobType;

/**
 * Created by Emanuil on 11/03/2017.
 */
public enum Types {
  TSum {
    @Override
    public JobType getJobType() {
      return () -> "sum";
    }
  },
  TProduct {
    @Override
    public JobType getJobType() {
      return () -> "product";
    }
  };
  public abstract JobType getJobType();
}
