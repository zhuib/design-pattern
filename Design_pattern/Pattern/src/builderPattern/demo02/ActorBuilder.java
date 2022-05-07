package builderPattern.demo02;

public abstract class ActorBuilder {

    protected static Actor actor = new Actor();

    public abstract void builderType();
    public abstract void builderSex();
    public abstract void builderFace();
    public abstract void builderCostume();
    public abstract void builderHairstyle();

    public static Actor construct(ActorBuilder ab) {
        ab.builderType();
        ab.builderSex();
        ab.builderFace();
        ab.builderCostume();
        ab.builderHairstyle();
        return actor;
    }
}
