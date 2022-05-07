package builderPattern.demo03;

public abstract class ActorBuilder {

    protected static Actor actor = new Actor();

    public abstract void builderType();
    public abstract void builderSex();
    public abstract void builderFace();
    public abstract void builderCostume();
    public abstract void builderHairstyle();

    public Actor construct() {
        this.builderType();
        this.builderSex();
        this.builderFace();
        this.builderCostume();
        this.builderHairstyle();
        return actor;
    }
}
