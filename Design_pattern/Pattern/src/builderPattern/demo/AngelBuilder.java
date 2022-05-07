package builderPattern.demo;

public class AngelBuilder extends ActorBuilder {
    @Override
    public void builderType() {
        actor.setType("天使");
    }

    @Override
    public void builderSex() {
        actor.setSex("女");
    }

    @Override
    public void builderFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void builderCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void builderHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
