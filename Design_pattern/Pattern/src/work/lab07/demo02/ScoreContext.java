package work.lab07.demo02;

/**
 * Date: 2021/4/14 17:56
 */
public class ScoreContext {

    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}


  /*  private AbstractState state, middleState, highState;

    public ScoreContext(){
        state = new LowState(this);
        middleState = new MiddleState(state);
        highState = new HighState(state);
    }

    public void add(int score) {
        state.score = score;
        if (score >= 60 && score <90) {
            this.setState(middleState);
            middleState.stateName = "中等";
            middleState.checkState();
        }else if (score >= 90) {
            this.setState(highState);
            highState.stateName = "优秀";
            highState.checkState();
        }else {
            this.setState(state);
            state.stateName = "不及格";
            state.checkState();
        }
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }
}
*/