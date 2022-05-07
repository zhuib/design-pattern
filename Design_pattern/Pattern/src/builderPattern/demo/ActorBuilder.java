package builderPattern.demo;

public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void builderType();
    public abstract void builderSex();
    public abstract void builderFace();
    public abstract void builderCostume();
    public abstract void builderHairstyle();

    // 工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}
