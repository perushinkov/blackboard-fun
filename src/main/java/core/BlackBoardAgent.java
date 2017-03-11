package core;

/**
 * Created by Emanuil on 11/03/2017.
 */
public class BlackBoardAgent {
  private BlackBoard blackBoard;

  public BlackBoardAgent(BlackBoard blackBoard) {
    this.blackBoard = blackBoard;
  }

  public Object run(Job job) {
    return blackBoard.run(job);
  }
}
