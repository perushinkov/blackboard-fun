package core;

/**
 * Created by Emanuil on 11/03/2017.
 */
public abstract class JobBase implements Job {
  protected JobType type;
  public JobBase(JobType type) {
  }

  @Override
  public JobType getType() {
    return type;
  }
}
