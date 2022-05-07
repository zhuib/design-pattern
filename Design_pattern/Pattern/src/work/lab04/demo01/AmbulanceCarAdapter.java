package work.lab04.demo01;

/**
 * Date: 2021/3/24 19:49
 */
public class AmbulanceCarAdapter extends CarController {

    private AmbulanceLamp lamp;
    private AmbulanceSound sound;

    public AmbulanceCarAdapter() {

        lamp = new AmbulanceLamp();
        sound = new AmbulanceSound();
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
