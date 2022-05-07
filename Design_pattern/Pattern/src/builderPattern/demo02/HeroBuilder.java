package builderPattern.demo02;

public class HeroBuilder extends ActorBuilder {
    @Override
    public void builderType() {
        actor.setType("英雄");
    }

    @Override
    public void builderSex() {
        actor.setSex("男");
    }

    @Override
    public void builderFace() {
        actor.setFace("英俊");
    }

    @Override
    public void builderCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void builderHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
