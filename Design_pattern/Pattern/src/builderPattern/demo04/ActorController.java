package builderPattern.demo04;

public class ActorController {

    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.builderType();
        ab.builderSex();
        ab.builderFace();
        ab.builderCostume();

        if (!ab.isBareheaded()) {

            ab.builderHairstyle();
        }
        actor = ab.createActor();
        return actor;
    }
}
