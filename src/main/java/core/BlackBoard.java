package core;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Emanuil on 11/03/2017.
 *
 * Initial version limitations:
 * - expects all workers to be initialized before a job is run.
 * - supports one worker per type
 */
public class BlackBoard {
  private TreeMap<String, Worker> workerSet;

  public BlackBoard() {
    this.workerSet = new TreeMap<>();
  }
  public void addWorkers(List<Worker> workers){
    workers.forEach(worker -> workerSet.put(worker.getJobType().getId(), worker));
  }

  Object run(Job job) {
    return workerSet.get(job.getType().getId()).executeJob(job);
  }

  public Object runProgram(Job job) {
    return run(job);
  }

  public BlackBoardAgent getAgent() {
    return new BlackBoardAgent(this);
  }
}
