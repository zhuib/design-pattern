package work.lab07.demo02;

/**
 * Date: 2021/4/14 17:56
 */
public class LowState extends AbstractState {

    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }

    public void checkState() {
        if (score >= 90) {
            hj.setState(new HighState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }
}

  /*  public LowState(ScoreContext h) {
        this.hj = h;
    }
    public LowState(AbstractState state) {
        this.hj = state.hj;
    }

    @Override
    public void checkState() {
        if (hj.getState() == this){
            System.out.println(this.score);
            System.out.println(this.stateName);
        }
    }
}
*/