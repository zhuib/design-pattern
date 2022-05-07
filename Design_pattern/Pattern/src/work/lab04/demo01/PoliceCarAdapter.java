package work.lab04.demo01;

/**
 * Date: 2021/3/24 17:10
 */
public class PoliceCarAdapter extends CarController{
    private PoliceSound sound;
    private PoliceLamp lamp;

    public PoliceCarAdapter() {
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
