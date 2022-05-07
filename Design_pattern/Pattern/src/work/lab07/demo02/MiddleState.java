package work.lab07.demo02;

/**
 * Date: 2021/4/14 17:56
 */
public class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}

    /*
    public MiddleState(AbstractState  state) {
        this.hj = state.hj;
    }

    @Override
    public void checkState() {
        if (hj.getState() == this){
            System.out.println(this.stateName);
        }
    }
}*/
