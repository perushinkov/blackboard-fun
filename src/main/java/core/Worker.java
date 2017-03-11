package core;

/**
 * Created by Emanuil on 11/03/2017.
 */
public abstract class Worker {
  BlackBoardAgent agent;
  public Worker(BlackBoardAgent agent) {
    this.agent = agent;
    init();
  }

  public abstract void init();

  abstract public Object executeJob(Job job);

  public abstract JobType getJobType();
}
