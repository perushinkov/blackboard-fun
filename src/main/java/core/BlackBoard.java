package core;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 * Created by Emanuil on 11/03/2017.
 *
 * Initial version limitations:
 * - expects all workers to be initialized before a job is run.
 * - supports one worker per type
 */
public class BlackBoard {
  private TreeMap<JobType, Worker> workerSet;

  public BlackBoard(ArrayList<Worker> workers) {
    this.workerSet = new TreeMap<>();
    workers.forEach(worker -> workerSet.put(worker.getJobType(), worker));
  }

  Object run(Job job) {
    return workerSet.get(job.getType()).executeJob(job);
  }

  public Object runProgram(Job job) {
    return run(job);
  }
}
