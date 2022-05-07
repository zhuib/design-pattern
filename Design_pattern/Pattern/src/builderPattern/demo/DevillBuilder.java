package builderPattern.demo;

public class DevillBuilder extends ActorBuilder {
    @Override
    public void builderType() {
        actor.setType("恶魔");
    }

    @Override
    public void builderSex() {
        actor.setSex("妖");
    }

    @Override
    public void builderFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void builderCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void builderHairstyle() {
        actor.setHairstyle("光头");
    }
}
